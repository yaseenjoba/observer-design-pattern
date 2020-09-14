package com.first;

public class Post {
    public String userName;
    public String title;
    public String postText;

    public Post(String userName, String title, String postText) {
        this.userName = userName;
        this.title = title;
        this.postText = postText;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String getUserName() {
        return userName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
