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
public abstract class AppleMobilePhones {

    private String mobileSeries;

    public AppleMobilePhones(String mobileSeriesName) {
        this.mobileSeries = mobileSeriesName;
    }

    public String getmobileSeriesName() {
        return this.mobileSeries;
    }

    abstract int getMobileSeriesReleasedYear();

    @Override
    public String toString() {
        return "The mobile Series Name is " + this.getmobileSeriesName()
                + " And its Released Year is " + this.getMobileSeriesReleasedYear();
    }

}
