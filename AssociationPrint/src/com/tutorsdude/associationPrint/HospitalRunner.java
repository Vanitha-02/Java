package com.tutorsdude.associationPrint;
import com.tutorsdude.associationPrint.Hospitalism.*;
public class HospitalRunner {

    public static void main(String[] args) {


        HospitalStore hospitalStore = new HospitalStore();
        hospitalStore.name="bellari clinic";
        hospitalStore.ceoName="Madhav shetty";

        Department dept1 = new Department();
        dept1.name="general department";
        dept1.chiefDoctor="Madhav shetty";

        Department dept2 = new Department();
        dept2.name="general department";
        dept2.chiefDoctor="Madhav shetty";

        Department dept3 = new Department();
        dept3.name="general department";
        dept3.chiefDoctor="Madhav shetty";

        Department[] deptArray = {dept1, dept2, dept3};
        hospitalStore.department=deptArray;

        for(int i=0; i<deptArray.length; i++) {
            deptArray[i].printAll();

        }

            Doctor doctor = new Doctor();
            doctor.name="Ramesh patil";
            doctor.specialization="Madhav shetty";
            doctor.noOfOperations=10;


            Doctor doctor1 = new Doctor();
            doctor1.name="Ramesh patil";
            doctor1.specialization="Madhav shetty";
            doctor1.noOfOperations=10;

            Doctor doctor2 = new Doctor();
            doctor2.name="Ramesh patil";
            doctor2.specialization="Madhav shetty";
            doctor2.noOfOperations=10;

            Doctor[] doctorArray = {doctor,doctor1,doctor2};
            hospitalStore.doctor=doctorArray;

            for(int j = 0;j<doctorArray.length;j++) {
               doctorArray[j].printAll();
            }


                Patient patient = new Patient();
                patient.name="Ramesh Patil";
                patient.address="Bellary clinic";
                patient.age=38;

                Patient patient1 = new Patient();
                patient1.name="Ramesh Patil";
                patient1.address="Bellary clinic";
                patient1.age=38;

                Patient patient2 = new Patient();
                patient2.name="Ramesh Patil";
                patient2.address="Bellary clinic";
                patient2.age=38;

                Patient[] patientArray = {patient,patient1,patient2};
                hospitalStore.patient=patientArray;

                for(int k = 0;k<patientArray.length;k++) {
                   patientArray[k].printAll();
                }

                    Disease disease=new Disease();
                    disease.name="dental caries";
                    disease.severity="Medium";
                    disease.cause="not cleaning mouth";


                    Disease disease1=new Disease();
                    disease1.name="dental caries";
                    disease1.severity="Medium";
                    disease1.cause="not cleaning mouth";

                    Disease disease2=new Disease();
                    disease2.name="dental caries";
                    disease2.severity="Medium";
                    disease2.cause="not cleaning mouth";

                    Disease[] diseaseArray={disease,disease1,disease2};
                    hospitalStore.disease=diseaseArray;

                    for (int l = 0;l<diseaseArray.length;l++) {
                        diseaseArray[l].printAll();
                    }


                        Address address = new Address();
                        address.name = "bellary clinic";
                        address.area = "Mahaveer circle";
                        address.city = "Gangavathi";
                        address.pincode = 583227;


                        address.printAll();


    }
}












