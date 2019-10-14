package com.github.mausam1;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;


/**
 * A simple {@link Fragment} subclass.
 */
public class PauriFrag extends Fragment {


    private RecyclerView list;
    private static DatabaseReference mDatabase;
    private Query mQueryCurrent;
    private FirebaseRecyclerAdapter<Card, EntryViewHolder> firebaseRecyclerAdapter;

    public PauriFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pauri, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mDatabase = FirebaseDatabase.getInstance().getReference().child("pauri");
        mDatabase.keepSynced(true);
        list = view.findViewById(R.id.list_pauri);
        list.setHasFixedSize(true);
        list.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    @Override
    public void onStart() {
        super.onStart();

        FirebaseRecyclerOptions<Card> options = new FirebaseRecyclerOptions.Builder<Card>()
                .setQuery(mDatabase, Card.class)
                .build();

        firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<Card, EntryViewHolder>(options) {
            @NonNull
            @Override
            public EntryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
                return new EntryViewHolder(view);
            }

            @Override
            protected void onBindViewHolder(@NonNull EntryViewHolder entryViewHolder, int i, @NonNull Card data) {
                entryViewHolder.setAdvisory(data.getAdvisory());
                entryViewHolder.setDate(data.getDate());
                entryViewHolder.setCloud_cover(data.getCloud_cover());
                entryViewHolder.setRainfall(data.getRainfall());
                entryViewHolder.setRh1(data.getRh1());
                entryViewHolder.setRh2(data.getRh2());
                entryViewHolder.setSummary(data.getSummary());
                entryViewHolder.setWind_direction(data.getWind_direction());
                entryViewHolder.setWind_speed(data.getWind_speed());
                entryViewHolder.setTmax(data.getTmax());
                entryViewHolder.setTmin(data.getTmin());
            }
        };

        list.setAdapter(firebaseRecyclerAdapter);
        firebaseRecyclerAdapter.startListening();
    }

    @Override
    public void onStop() {
        super.onStop();
        firebaseRecyclerAdapter.stopListening();
    }

}
