package com.tutorsdude.association;

import com.tutorsdude.association.Hospitals.*;

public class HospitalRunner {
    public static void main(String[] args) {

          Hospital hospital01 = new Hospital();
          hospital01.name = "Chiniwalar Dental Care";
          System.out.println(hospital01.name);
          hospital01.ceoName = "Chetan Kumar";
          System.out.println(hospital01.ceoName);


          Department dept1 = new Department();
          dept1.name = "Physician";
          System.out.println(dept1.name);
          dept1.chiefDoctor = "Dr. Ramesh patil";
          System.out.println(dept1.chiefDoctor);

          hospital01.department = dept1;

         

          Doctor doc1 = new Doctor();
          doc1.name = "Chetan Kumar";
          System.out.println(doc1.name);
          doc1.specialization= "Dentist";
          System.out.println(doc1.specialization);
          doc1.noOfOperations = 30;
          System.out.println(doc1.noOfOperations);

          hospital01.doctor = doc1;

          Patient patient1 = new Patient();
          patient1.name = "Srujan";
          System.out.println(patient1.name);
          patient1.address="Chiniwalar Hospital,Mahaveer Circle,Gangavathi";
          System.out.println(patient1.address);
          patient1.age = 35;
          System.out.println(patient1.age);

          Disease disease1 = new Disease();
          disease1.name = "Dental Caries";
          System.out.println(disease1.name);
          disease1.severity = "low";
          System.out.println(disease1.severity);
          disease1.cause = "Bacteria in mouth";
          System.out.println(disease1.cause);

          hospital01.patient = patient1;
          hospital01.disease = disease1;

          Address address1 = new Address();
          address1.name = "Chiniwalar Dental Care";
          System.out.println(address1.name);
          address1.area="Mahaveer Circle";
          System.out.println(address1.area);
          address1.city = "Gangavathi";
          System.out.println(address1.city);
          address1.pincode=583227;
          System.out.println(address1.pincode);

          hospital01.address = address1;

          System.out.println("....................*....................");


          Hospital hospital02 = new Hospital();
          hospital02.name = "Varasiddii hospital and MRC";
          System.out.println(hospital02.name);
          hospital02.ceoName = "Arjun hosalli";
          System.out.println(hospital02.ceoName);

          Department dept2 = new Department();
          dept2.name = "Physician";
          System.out.println(dept2.name);
          dept2.chiefDoctor = "Dr. Ramesh patil";
          System.out.println(dept2.chiefDoctor);

          hospital02.department = dept2;

          Doctor doctor2 = new Doctor();
          doctor2.name = "Dr.Venkateshwar";
          System.out.println(doctor2.name);
          doctor2.specialization= "Endoscopist";
          System.out.println(doctor2.specialization);
          doctor2.noOfOperations = 10;
          System.out.println(doctor2.noOfOperations);

          hospital02.doctor = doctor2;

          Patient patient2 = new Patient();
          patient2.name = "pradeep";
          System.out.println(patient2.name);
          patient2.address = "Varasiddii Hospital and MRC";
          System.out.println(patient2.address);
          patient2.age = 28;
          System.out.println(patient2.age);

          Disease disease2 = new Disease();
          disease2.name = "Stomach Ulcers";
          System.out.println(disease2.name);
          disease2.severity = "High";
          System.out.println(disease2.severity);
          disease2.cause = "Damage to stomach lining";
          System.out.println(disease2.cause);


          hospital02.patient = patient2;
          hospital01.disease = disease2;

          Address address2 = new Address();
          address2.name = "Varasiddii Hospital and MRC";
          System.out.println(address2.name);
          address2.area = "Mahaveer Circle";
          System.out.println(address2.area);
          address2.city = "Gangavathi";
          System.out.println(address2.city);
          address2.pincode=583227;
          System.out.println(address2.pincode);

          hospital02.address = address2;



















    }
}



