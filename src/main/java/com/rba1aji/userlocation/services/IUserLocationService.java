package com.rba1aji.userlocation.services;

import com.rba1aji.userlocation.models.UserLocation;

import java.util.List;

public interface IUserLocationService {
    void createTable();
    UserLocation save(UserLocation userLocation);
    List<UserLocation> findNearest(Integer limit, Double latitude, Double longtitude);

}
