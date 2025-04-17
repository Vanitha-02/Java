package com.tutorsdude.associationPrint.Hospitalism;

public class HospitalStore {
    public String name;
    public Department[] department;
    public String ceoName;
    public Doctor[] doctor;
    public Patient[] patient;
    public Disease[] disease;
    public Address address;


    public void printAll(){
        System.out.println("Hospital Name: " + name);
        System.out.println("CEO Name:"+ceoName);
        System.out.println("Department: " + department);
        System.out.println("Doctor: " + doctor);
        System.out.println("Patient: " + patient);
        System.out.println("Diseases:" + disease);
        System.out.println("Address: " + address);



        }
}
