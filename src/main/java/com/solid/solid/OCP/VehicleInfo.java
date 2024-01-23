package com.solid.solid.OCP;

import com.solid.solid.OCP.Bike;
import com.solid.solid.OCP.Car;
import com.solid.solid.OCP.Vehicle;

public class VehicleInfo {

    public double vehicleNumber(Vehicle vcl) {
        if (vcl instanceof Car) {
            return vcl.getNumber();
        }
        if (vcl instanceof Bike) {
            return vcl.getNumber();
        }

        /*
        .
        .
        .
        .
        .
         */

        return 0.0;
    }

    /*
    --> The open-closed principle states that according to new requirements the module should be open for
    extension but closed for modification.
    --> If we want to add another subclass named Truck, simply, we add one more if statement
    that violates the open-closed principle.
    --> The only way to add the subclass and achieve the goal of principle by overriding
    the vehicleNumber() method.
    */
}
