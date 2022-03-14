package com.example.tuan03;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ProductListView extends BaseAdapter {
    private ArrayList<Product> products;

    public ProductListView(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int position) {
        return products.get(position);
    }

    @Override
    public long getItemId(int position) {
        return products.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View productView;

        if (convertView == null){
            productView = View.inflate(parent.getContext(), R.layout.product_listview, null);
        }else {
            productView = convertView;
        }

        Product product = (Product) getItem(position);
        ((TextView) productView.findViewById(R.id.product_name)).setText(product.getName());
        ((TextView) productView.findViewById(R.id.product_supplier)).setText(product.getSupplier());

        return productView;
    }
}
