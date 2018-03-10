package com.guru.inviter.model;

import android.net.Uri;

/**
 * Created by Guru on 09-03-2018.
 */

public class InviteDetails {
    private String Title;
    private String User;
    private String Date;
    private String Time;
    private String Background;
    private String Venue;
    private String Location;
    private String Contact;
    private String Email;
    private Uri postfix;

    @Override
    public String toString() {
        return "InviteDetails{" +
                "Title='" + Title + '\'' +
                ", User='" + User + '\'' +
                ", Date='" + Date + '\'' +
                ", Time='" + Time + '\'' +
                ", Background='" + Background + '\'' +
                ", Venue='" + Venue + '\'' +
                ", Location='" + Location + '\'' +
                ", Contact='" + Contact + '\'' +
                ", Email='" + Email + '\'' +
                ", postfix=" + postfix +
                '}';
    }



    public Uri getPostfix() {
        return postfix;
    }

    public void setPostfix(Uri postfix) {
        this.postfix = postfix;
    }





    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getBackground() {
        return Background;
    }

    public void setBackground(String background) {
        Background = background;
    }

    public String getVenue() {
        return Venue;
    }

    public void setVenue(String venue) {
        Venue = venue;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
