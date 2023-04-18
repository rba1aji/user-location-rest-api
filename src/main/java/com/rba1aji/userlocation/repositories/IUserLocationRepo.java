package com.rba1aji.userlocation.repositories;

import com.rba1aji.userlocation.models.UserLocation;

import java.util.List;

public interface IUserLocationRepo {
    void createTable();
    UserLocation save(UserLocation userLocation);
    List<UserLocation> findNearest(Integer limit, Double latitude, Double longitude);
}
