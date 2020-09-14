package com.first;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Observers implements IBlogObserver {
    private String name;
    public Observers(String name){
        this.name=name;
    }
    ArrayList<Post> logger=new ArrayList<>();
    @Override
    public void update(Post newPost) {
        logger.add(newPost);
        System.out.println("Alert:"+name+" you can see a new Post about "+newPost.getTitle());
    }
}
