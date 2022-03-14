package com.example.tuan03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ProductListView productListView;
    private ArrayList<Product> product_list;
    private ListView lv_product;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_product = findViewById(R.id.lv_product);

        product_list.add(new Product(1, "Ca nấu lẩu, nấu mì mini", "Devang"));
        product_list.add(new Product(2, "1KG KHÔ GÀ BƠ TỎI", "LTD  Food"));
        product_list.add(new Product(3, "Xe cần cẩu đa năng", "Thế giới đồ chơi"));
        product_list.add(new Product(4, "Đồ chơi dạng mô hình", "Thế giới đồ chơi"));

        productListView = new ProductListView(product_list);
        lv_product.setAdapter(productListView);

    }
}