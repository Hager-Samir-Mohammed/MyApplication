package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.security.AccessController;
import java.util.ArrayList;
import java.util.List;

public class RV_Adapter extends RecyclerView.Adapter<RV_Adapter.BookViewHolder>
{
        private Context context;
        public List<SUPER_Book_Fair> Book_Fair;

    public RV_Adapter(Context context, List<SUPER_Book_Fair> book_Fair) {
        this.context = context;
        this.Book_Fair = book_Fair;
    }

    public class BookViewHolder extends RecyclerView.ViewHolder
    {
        ImageView Img;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
                      //inflate
                Img = itemView.findViewById(R.id.book_interface3);
        }
    }
    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.books, parent , false);

        return new BookViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position)
    {
        SUPER_Book_Fair Super_book_fair = Book_Fair.get(position);
        holder.Img.setImageResource(Super_book_fair.getImag_book());

    }

    @Override
    public int getItemCount() {
        return Book_Fair.size(); //Books.size
    }

    // Holder class for Recycler View

}
