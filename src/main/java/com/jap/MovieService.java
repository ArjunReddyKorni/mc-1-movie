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

    public Set<String> getMovieNameWithRating4(Map<Movie,Integer> map,int rating){
        //Create a TreeSet object
        TreeSet<String> movieTreeSet = new TreeSet<>();

        //Use entrySet() method to iterate through the map object
         Set<Map.Entry<Movie, Integer>> entries = map.entrySet();
        for (Map.Entry<Movie, Integer> entry : map.entrySet()) {
            if(entry.getValue() == rating){
                movieTreeSet.add(entry.getKey().getMovieName());
            }
        }

        //retrieve all the movies name having rating as 4

        //Store the movie name in TreeSet object

        //return the TreeSet object

      return movieTreeSet;
    }

    public List<String> getMovieWithHighestRating(Map<Movie,Integer> map){
        //Create a ArrayList object of type String

        List<String> movieArrayList = new ArrayList();
        movieArrayList.add(map.entrySet().iterator().next().getKey().getMovieName());

        //get the first value from the map and store it in the variable max

        // Use entrySet().iterator().next() method to retrieve the first value of Map object
            int max = map.entrySet().iterator().next().getValue();
        for(Map.Entry<Movie,Integer> entry : map.entrySet()){

            if(entry.getValue() > max){
               //   System.out.println("movieArrayList = " + movieArrayList);
                movieArrayList.set(0,entry.getKey().getMovieName());
            }
        }


        //get the name of the movie with the highest rating and add it in the List created

        //return the List object


        return movieArrayList;
    }
    public Map<String,String> getAllMoviesWithComedy(Map<Movie,Integer> map){
        //Create a Map object
        Map<String,String > map1 = new HashMap();

        //use entrySet to iterate through the Map object
        for (Map.Entry<Movie, Integer> entry : map.entrySet()) {
            if(entry.getKey().getGenre().equalsIgnoreCase("comedy")){
                map1.put(entry.getKey().getMovieName(),entry.getKey().getReleaseDate());
            }
        }


        //get all the movies name and their released date for the movie of genre "comedy"

        //store movie name with release date in the above created Map object and return the Map object


        return map1;

    }


}
