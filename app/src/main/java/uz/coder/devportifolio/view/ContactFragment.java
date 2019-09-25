package uz.coder.devportifolio.view;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import uz.coder.devportifolio.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContactFragment extends Fragment {
     private    TextView insta;
    private TextView mail;

    public ContactFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_contact, container, false);


        // Inflate the layout for this fragment
        return myView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        insta = view.findViewById(R.id.instaTxt);
        mail = view.findViewById(R.id.mail);
        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/student_of_tuit"));
                startActivity(in);
            }
        });
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gmail.com/nightcoderr"));
                startActivity(in);
            }
        });
    }
}
