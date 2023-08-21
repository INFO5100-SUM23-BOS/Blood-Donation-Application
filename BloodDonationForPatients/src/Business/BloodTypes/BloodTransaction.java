/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.BloodTypes;

import Business.BloodTypes.PersonBloodTypes.BloodType;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author maka
 */
public class BloodTransaction {

    public enum TransactionType {
        In("Increase inventory"),
        Out("Decrease inventory");

        private String value;

        private TransactionType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    private final BloodType bloodType;
    private final int units;
    private final TransactionType inOut;
    private final Object reference;
    private final Date timestamp;

    public BloodTransaction(BloodType bloodType, int units, TransactionType inOut, Object reference) {
        this.bloodType = bloodType;
        this.units = units;
        this.inOut = inOut;
        this.reference = reference;
        this.timestamp = new Date();
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public int getUnits() {
        return units;
    }

    public TransactionType getInOut() {
        return inOut;
    }

    public Object getReference() {
        return reference;
    }

    public String getTimestamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(timestamp);
    }

}
