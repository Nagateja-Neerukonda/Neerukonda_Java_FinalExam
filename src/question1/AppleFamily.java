/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;
/**
 *
 * @author Neerukonda Nagateja
 */

public class AppleFamily extends AppleMobilePhones implements AppleMobilePhonesInterface {

    private int year;
    private String mobileBrand;
    private String MobileType;

    public AppleFamily(int year, String mobileSeriesName ,String mobileBrand,String MobileType) {
        super(mobileSeriesName);
        this.year = year;
        this.MobileType=MobileType;
        this.mobileBrand=mobileBrand;
    }

    @Override
    int getMobileSeriesReleasedYear() {
        return getMobileSeriesYear();
    }

    @Override
    public int getMobileSeriesYear() {
        return this.year;
    }
    
    public String getMobileType() {
        return this.MobileType;
    }

    @Override
    public String getMobileBrand() {
        return this.mobileBrand;
    }

    public String getMyParentToString() {
        return super.toString();
    }

    @Override
    public String toString() {
        return "The Mobile Brand is " + this.getMobileBrand()
                + ". Year is " + this.getMobileSeriesReleasedYear();

    }

}

