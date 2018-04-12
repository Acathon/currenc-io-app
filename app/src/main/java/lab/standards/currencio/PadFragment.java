package lab.standards.currencio;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * A simple {@link Fragment} subclass.
 */
public class PadFragment extends Fragment {


    public PadFragment() {
        // Required empty public constructor
    }

    @OnClick({R.id._one, R.id._two, R.id._three, R.id._four, R.id._five,
            R.id._s3x, R.id._seven, R.id._eight, R.id._nine, R.id._zero,
            R.id._point, R.id._back})
    public void onPadClick(Button button) {

    }

    public static PadFragment newInstance() {
        return new PadFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pad, container, false);

        ButterKnife.bind(this, v);

        return view;
    }

}
