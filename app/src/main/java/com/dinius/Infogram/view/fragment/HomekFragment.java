package com.dinius.Infogram.view.fragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dinius.Infogram.R;
import com.dinius.Infogram.adapter.CardViewAdapter;
import com.dinius.Infogram.model.Image;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomekFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomekFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomekFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomekFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomekFragment newInstance(String param1, String param2) {
        HomekFragment fragment = new HomekFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_homek, container, false);

       //toolbar
        showToolBar(getString(R.string.title_home_fragment), false, view);

        //recyclerview
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);

        //layaut manager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        //el adapter
        CardViewAdapter cardViewAdapter = new CardViewAdapter(biudImage(), R.layout.cardview_image, getActivity());
        recyclerView.setAdapter(cardViewAdapter);

        return view;
    }

    public void showToolBar(String titulo, boolean botonSubir, View view){
        Toolbar toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(titulo);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(botonSubir);
    }

    //creamos la lista de imagenes
    public ArrayList<Image> biudImage() {
        ArrayList<Image> images = new ArrayList<>();

        images.add(new Image("https://dynamic-media-cdn.tripadvisor.com/media/photo-o/0b/48/3a/d4/topo.jpg?w=1000&h=600&s=1","Carlos Valdivia","2 dias", "1 me gusta"));
        images.add(new Image("https://laicismo.org/wp-content/uploads/2017/02/Monumento-Virgen-de-Socavon-en-Oruro-Bolivia.jpg","Luis Perez ","7 dias", "2 me gusta"));
        images.add(new Image("https://media-cdn.tripadvisor.com/media/photo-m/1280/1a/ea/87/c2/puerta-del-sol.jpg","Fernando Torrico","9 dias", "3 me gusta"));
        images.add(new Image("https://www.wamanadventures.com/blog/wp-content/uploads/2019/06/La-Laguna-Colorada-Waman-Adventures.jpg","Juan Lopez","5 dias", "4 me gusta"));
        images.add(new Image("https://brujuladigital.net/images/news/es/b_7357_si-se-determina-mi-teleferico-se-prepara-para-reiniciar-su-servicio-de-transporte-1.jpg","David Colque","6 dias", "5 me gusta"));
        images.add(new Image("https://i2.wp.com/andorreandoporelmundo.com/wp-content/uploads/2019/02/IMG_5577.jpg?fit=1000%2C667&ssl=1","Daniela Torrez","2 dias", "6 me gusta"));
        images.add(new Image("https://www.laregion.bo/wp-content/uploads/2019/07/coroico-parapente.jpeg","Lupe Dominguez","1 dias", "7 me gusta"));
        images.add(new Image("https://www.lostiempos.com/sites/default/files/styles/noticia_detalle/public/media_imagen/2018/1/13/1-_roma_2-_hector_arnez.jpg?itok=E9jbs43e","Jorge Bustamante","2 dias", "8 me gusta"));
        images.add(new Image("https://www.lostiempos.com/sites/default/files/styles/noticia_detalle/public/media_imagen/2018/1/13/1-_roma_2-_hector_arnez.jpg?itok=E9jbs43e","Luis Suarez","8 dias", "9 me gusta"));
        images.add(new Image("https://i1.wp.com/elcalderoviajero.com/wp-content/uploads/2018/04/bolivia-cochabamba-incachaca-15.jpg?resize=750%2C563&ssl=1","Laura Ugarte","10 dias", "10 me gusta"));

        return images;

    }
}