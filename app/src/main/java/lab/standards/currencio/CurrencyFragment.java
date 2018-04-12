package lab.standards.currencio;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CurrencyFragment extends Fragment {

    ImageButton mCurrency;
    TextView mTextCurrency;
    HorizontalScrollView mHScrollView;

    public CurrencyFragment() {
        // Required empty public constructor
    }

    public interface

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_currency, container, false);

        return view;
    }

}
