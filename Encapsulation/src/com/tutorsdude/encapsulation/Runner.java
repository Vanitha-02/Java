package com.tutorsdude.encapsulation;

import com.tutorsdude.encapsulation.Example.RailwayStation;

public class Runner {
    public static void main(String[] args){

        RailwayStation railwayStation=new RailwayStation();
        railwayStation.setStationName("bengalore");
        System.out.println(railwayStation.getStationName());

        RailwayStation Station=new RailwayStation();
        Station.setStationCode("KSR Bengaluru");
        System.out.println(Station.getStationCode());

        RailwayStation stationLocation=new RailwayStation();
        stationLocation.setLocation("Gangavathi Railway Station");
        System.out.println(stationLocation.getLocation());

        RailwayStation managerName=new RailwayStation();
        managerName.setStationManagerName("Harshit");
        System.out.println(managerName.getStationManagerName());

        RailwayStation managerContact=new RailwayStation();
        managerContact.setStationManagerContact("calling general enquiry number");
        System.out.println(managerContact.getStationManagerContact());

        RailwayStation contact=new RailwayStation();
        contact.setEmergencyContact("Call Helpline Number");
        System.out.println(contact.getEmergencyContact());

        RailwayStation Date=new RailwayStation();
        Date.setConstructionDate("March");
        System.out.println(Date.getConstructionDate());

        RailwayStation inspectiondDate=new RailwayStation();
        inspectiondDate.setLastInspectionDate("Carried out by of railway board officers");
        System.out.println(inspectiondDate.getLastInspectionDate());

        RailwayStation category=new RailwayStation();
        category.setStationCategory("A");
        System.out.println(category.getStationCategory());

        RailwayStation Total=new RailwayStation();
        Total.setTotalTracks(3);
        System.out.println(Total.getTotalTracks());

        RailwayStation count=new RailwayStation();
        count.setPlatformCount(3);
        System.out.println(count.getPlatformCount());

        RailwayStation ticketCounters=new RailwayStation();
        ticketCounters.setAvailableTicketCounters(4);
        System.out.println(ticketCounters.getAvailableTicketCounters());

        RailwayStation trains=new RailwayStation();
        trains.setTotalTrains(596);
        System.out.println(trains.getTotalTrains());

        RailwayStation operating=new RailwayStation();
        operating.setOperatingTrains(56);
        System.out.println(operating.getOperatingTrains());

        RailwayStation capacity=new RailwayStation();
        capacity.setMaxTrainCapacity(1780);
        System.out.println(capacity.getMaxTrainCapacity());

        RailwayStation arrival=new RailwayStation();
        arrival.setDailyTrainArrival(8);
        System.out.println(arrival.getDailyTrainArrival());

        RailwayStation departure=new RailwayStation();
        departure.setDailyTrainDeparture(10);
        System.out.println(departure.getDailyTrainDeparture());

        RailwayStation room=new RailwayStation();
        room.setHasWaitingRoom(true);
        System.out.println(room.getHasWaitingRoom());

        RailwayStation rest=new RailwayStation();
        rest.setHasRestRooms(true);
        System.out.println(rest.getHasRestRooms());

        RailwayStation park=new RailwayStation();
        park.setHasParking(true);
        System.out.println(park.getHasParking());

        RailwayStation book=new RailwayStation();
        book.setHasBookStore(false);
        System.out.println(book.getHAsBookStore());

        RailwayStation Food=new RailwayStation();
        Food.setHasFoodCourt(true);
        System.out.println(Food.getHasFoodCourt());

        RailwayStation ATM=new RailwayStation();
        ATM.setHasATM(false);
        System.out.println(ATM.getHasATM());

        RailwayStation facility=new RailwayStation();
        facility.setHasMedicalFacility(true);
        System.out.println(facility.getHasMedicalFacility());

        RailwayStation machine=new RailwayStation();
        machine.setHasEscalator(true);
        System.out.println(machine.getHasEscalator());

        RailwayStation electric=new RailwayStation();
        electric.setHasElevator(true);
        System.out.println(electric.getHasElevator());

        RailwayStation WiFi=new RailwayStation();
        WiFi.setHasWifi(false);
        System.out.println(WiFi.getHasWifi());

        RailwayStation hours=new RailwayStation();
        hours.setOperatingHours("three");
        System.out.println(hours.getOperatingTrains());





    }
}
