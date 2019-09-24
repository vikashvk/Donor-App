package com.bloodbank.model;

/**
 * Created by v2 on 9/18/2019.
 */

public class DonorLocation {
    double donorLat;
    double donorLong;

    public DonorLocation() {
    }

    public DonorLocation(double donorLat, double donorLong) {
        this.donorLat = donorLat;
        this.donorLong = donorLong;
    }

    public double getDonorLat() {
        return donorLat;
    }

    public void setDonorLat(double donorLat) {
        this.donorLat = donorLat;
    }

    public double getDonorLong() {
        return donorLong;
    }

    public void setDonorLong(double donorLong) {
        this.donorLong = donorLong;
    }
}
