package com.jap;

import java.util.*;

public class MovieService {

    public Map<Movie,Integer> getMovieWithRating(){

        //create five movie object by calling Movie class parameterized constructor
        Movie movie1 = new Movie(101,"A Beautiful Mind","economic","23/1/2003");
        Movie movie2 = new Movie(102,"Two Beautiful Mind","comedy","13/1/2007");
        Movie movie3 = new Movie(103,"Three Beautiful Mind","Romantic","11/1/2005");
        Movie movie4 = new Movie(104,"Four Beautiful Mind","Horror","29/1/2004");
        Movie movie5 = new Movie(105,"Five Beautiful Mind","Drama","31/1/2004");

        //create HashMap object and add all the Movie object inside it
        Map<Movie,Integer> movieMap = new HashMap();

        //Key will be movie object and value will be rating ranging from 1 to 5
        movieMap.put(movie1,3);
        movieMap.put(movie2,4);
        movieMap.put(movie3,5);
        movieMap.put(movie4,4);
        movieMap.put(movie5,3);

        //return the HashMap object


        return movieMap;
    }


}
