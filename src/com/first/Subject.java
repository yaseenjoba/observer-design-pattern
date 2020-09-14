package com.first;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Subject {
    ArrayList<IBlogObserver>listOfObservers=new ArrayList<>();

    Post newPost=null;
    void Posting(Post newP){
        newPost=newP;
        notifyObservers();
    }
    void registerObesrver(IBlogObserver x){
        listOfObservers.add(x);
    }
    void unregisterObserver(IBlogObserver X){
        listOfObservers.remove(X);
    }
    void notifyObservers(){
        if(listOfObservers.isEmpty())return;
        for(IBlogObserver i : listOfObservers){
            i.update(newPost);
        }
    }
}
