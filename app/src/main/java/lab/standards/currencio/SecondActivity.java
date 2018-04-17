package lab.standards.currencio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {


    private static final String API_URL = "http://apilayer.net/api/live?access_key=e5f59bca636e0397f1040e7cabb84178&currencies=EUR,USD,TND,BTC,GBP&source=USD&format=1";
    List<ListCurrencies> currenciesList;
    RecyclerView recyclerView;
    private static String currency;
    private RequestQueue query;
    private int USDUSD;
    private float USDTND;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        Intent intent = getIntent();
        currency = intent.getStringExtra(MainActivity.EXTRA_CONVERT);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerCurrency);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        query = Volley.newRequestQueue(this);


        currenciesList = new ArrayList<>();
        currenciesList.add(new ListCurrencies("Tunisia", "TND", currency, R.drawable.ic_tn));
        currenciesList.add(new ListCurrencies("European Union", "EUR", currency, R.drawable.ic_eu));
        currenciesList.add(new ListCurrencies("United Kingdom", "GBP", currency, R.drawable.ic_uk));
        currenciesList.add(new ListCurrencies("United States", "USD", currency, R.drawable.ic_us));
        //currenciesList.add(new ListCurrencies("Bitcoin", "BTC", currency, R.drawable.ic_btc));

        Currencies adapter = new Currencies(this, currenciesList);
        recyclerView.setAdapter(adapter);
    }

    public void getJson() {
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override   
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_open:
                return true;
            case R.id.action_about:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
