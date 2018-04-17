package lab.standards.currencio;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Currencies extends RecyclerView.Adapter<Currencies.CurrenciesViewHolder> {

    private Context context; // android.content.Context
    private List<ListCurrencies> CurrencyList;

    public Currencies(Context context, List<ListCurrencies> CurrencyList) {
        this.context = context;
        this.CurrencyList = CurrencyList;
    }

    @Override
    public CurrenciesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.list_item, null);
        return new CurrenciesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CurrenciesViewHolder holder, int position) {

        ListCurrencies list = CurrencyList.get(position);
        holder.Price.setText(list.getPrice());
        holder.current.setText(list.getCurrency());
        holder.country.setText(list.getCountry());
        holder.imageView.setImageDrawable(context.getResources().getDrawable(list.getImage()));
    }

    @Override
    public int getItemCount() {
        return CurrencyList.size();
    }


    class CurrenciesViewHolder extends RecyclerView.ViewHolder {

        TextView country;
        TextView Price;
        TextView current;
        ImageView imageView;

        public CurrenciesViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.country_flag);
            country = itemView.findViewById(R.id.country_name);
            current = itemView.findViewById(R.id.country_currency);
            Price = itemView.findViewById(R.id.currency_pruce);


        }
    }

}
