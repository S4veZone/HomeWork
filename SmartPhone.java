package com.telran.org.HomeWork.Homework2;

class SmartPhone extends Phone {
    public SmartPhone(String phoneName, String ownNumber) {
        setPhoneName(phoneName);
        setOwnNumber(ownNumber);
    }

    @Override
    public void call(String phoneNumber) {
        System.out.println("The phone " + getPhoneName() + " " + getOwnNumber() + " try to make a call to number " + phoneNumber);
        super.call(phoneNumber);
    }

    @Override
    public void receiveCall(String callerNumber) {
        System.out.println("The phone " + getPhoneName() + " " + getOwnNumber() + " try to receive a call from number " + callerNumber);
        super.receiveCall(callerNumber);
    }
}