package com.telran.org.HomeWork.Homework2;

class Phone {
    private String phoneName;
    private String ownNumber;

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(String ownNumber) {
        this.ownNumber = ownNumber;
    }

    public void call(String phoneNumber) {
        System.out.println(" try to make a call to number " + phoneNumber);
    }

    public void receiveCall(String callerNumber) {
        System.out.println(" try to receive a call from number " + callerNumber);
    }
}