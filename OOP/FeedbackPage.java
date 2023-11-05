package com.ait.golf;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FeedbackPage {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your feedback:");
        String feedback = reader.readLine();
        System.out.println("Thank you for your feedback: " + feedback);
    }
}

