/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

import java.util.Objects;

/**
 *
 * @author S542313
 */
public class RiceMill {

    private double processedWheatQuantityInTons;
    private String industryName;

    public RiceMill(double quantity, String industryName) {
        this.processedWheatQuantityInTons = quantity;
        this.industryName = industryName;
    }

    public double getQuantity() {
        return processedWheatQuantityInTons;
    }

    public void setQuantity(double quantity) {
        this.processedWheatQuantityInTons = quantity;
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String name) {
        this.industryName = name;
    }

    @Override
    public String toString() {
        return "RiceMill{" + "processedWheatQuantityInTons=" + processedWheatQuantityInTons
                + ", industryName=" + industryName + '}';
    }

    //This method returns the hashcode for every object created for this class.
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.industryName);
        return hash;
    }

    //this method takes obj which is the object for comparing class. Here we are 
    // checking only for name hence if 2 objects has same name then they are 
    //equal.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RiceMill other = (RiceMill) obj;
        if (!Objects.equals(this.industryName, other.industryName)) {
            return false;
        }
        return true;
    }

}
