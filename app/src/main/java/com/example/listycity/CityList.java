package com.example.listycity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Checks if the citylist has the specified item
     * @param city
     * @return
     * Returns boolean based on truth value
     */
    public boolean hasCity(City city){
        for (int i = 0; i < cities.size(); i++){
            if (cities.get(i) == city){
                return true;
            }
        }
        return false;
    }

    /**
     * This method removes a city from the list
     * @param city
     */
    public void delete(City city){
        if (!cities.contains(city)){
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * This method checks th amount of items in the list
     * @return
     * returns the count of items in the list
     */
    public int count() {
        return cities.size();
    }

}
