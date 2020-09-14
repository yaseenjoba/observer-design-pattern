package com.first;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Subject subject=new Subject();
        while(true){
            System.out.println("Menu:");
            System.out.println("1.Post a new Post ");
            System.out.println("2.Add a new Subscriber ");
            System.out.println("3.exit ! ");
            int x = in.nextInt();
            switch (x){
                case 1:
                    String userName,title,postText;
                    System.out.print("Enter your username : ");
                    userName=in.next();
                    System.out.print("Enter your Post title : ");
                    title=in.next();
                    System.out.print("Enter your Post text : ");
                    postText=in.next();
                    Post post = new Post(userName,title,postText);
                    subject.Posting(post);
                    break;
                case 2:
                    System.out.print("Enter the Subscriber name : ");
                    String observerName=in.next();
                    subject.registerObesrver(new Observers(observerName));
                    break;
                case 3:
                    System.exit(0);

            }


        }
    }
}
