package com.notebook.enums;

/**
 * Created by monju on 01-May-17.
 */
public enum PlanType {
    DAILY(1),
    MONTHLY(2),
    YEARLY(3);

    private int planNumber;

    PlanType(int planNumber){
        this.planNumber = planNumber;
    }

    int getPlan(){
        return planNumber;
    }
}
