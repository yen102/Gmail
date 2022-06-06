package com.example.gmail;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gmail.model.Email;

import java.util.ArrayList;

public class EmailAdapter extends RecyclerView.Adapter<EmailAdapter.ViewHolder> {
    ArrayList<Email> emails;

    public EmailAdapter(ArrayList<Email> emails) {
        this.emails = emails;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Email email = emails.get(position);

        holder.imageSender.setImageResource(email.getImageSender());
        holder.textSenderEmail.setText(email.getEmailSender());
        holder.textTime.setText(email.getTime());
        holder.textEmailContent.setText(email.getContent());
        if (email.isImportant()) {
            holder.imageImportance.setImageResource(R.drawable.ic_baseline_star_24);
        } else {
            holder.imageImportance.setImageResource(R.drawable.ic_baseline_star_outline_24);
        }
    }

    @Override
    public int getItemCount() {
        return emails.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageSender;
        TextView textSenderEmail;
        TextView textTime;
        TextView textEmailContent;
        ImageView imageImportance;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageSender = itemView.findViewById(R.id.imageviewSender);
            textSenderEmail = itemView.findViewById(R.id.textviewSender);
            textTime = itemView.findViewById(R.id.textviewTime);
            textEmailContent = itemView.findViewById(R.id.textviewEmailContent);
            imageImportance = itemView.findViewById(R.id.imageviewImportant);
        }
    }
}
