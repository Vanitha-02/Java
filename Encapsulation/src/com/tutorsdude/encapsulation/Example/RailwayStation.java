package com.tutorsdude.encapsulation.Example;

import org.omg.CORBA.PUBLIC_MEMBER;

public class RailwayStation {
    private String stationName;
    private String stationCode;
    private String location;
    private String stationManagerName;
    private String stationManagerContact;
    private String emergencyContact;
    private String constructionDate;
    private String lastInspectionDate;
    private String stationCategory;
    private String operatingHours;

    private int totalTracks;
    private int platformCount;
    private int availableTicketCounters;
    private int totalTrains;
    private int operatingTrains;
    private int maxTrainCapacity;
    private int dailyTrainArrival;
    private int dailyTrainDeparture;
    private int parkingSpaces;

    private boolean hasWaitingRoom;
    private boolean hasRestRooms;
    private boolean hasParking;
    private boolean hasBookStore;
    private boolean hasFoodCourt;
    private boolean hasATM;
    private boolean hasMedicalFacility;
    private boolean hasEscalator;
    private boolean hasElevator;
    private boolean hasWifi;




    //---------getter method------------

    public String getStationName(){
        return stationName;
    }
    public String getStationCode(){
        return stationCode;
    }
    public String getLocation() {
        return location;
    }
    public String getStationManagerName(){
        return stationManagerName;
    }
    public String getStationManagerContact(){
        return stationManagerContact;
    }
    public String getEmergencyContact(){
       return emergencyContact;
    }
    public String getConstructionDate() {
        return constructionDate;
    }
    public String getLastInspectionDate() {
        return lastInspectionDate;
    }
    public String getStationCategory(){
        return stationCategory;
    }

    public int getTotalTracks(){
        return totalTracks;
    }
    public int getPlatformCount(){
        return platformCount;
    }
    public int getAvailableTicketCounters(){
        return availableTicketCounters;
    }
    public int getTotalTrains(){
        return totalTrains;
    }
    public int getOperatingTrains(){
        return operatingTrains;
    }
    public int getMaxTrainCapacity(){
        return maxTrainCapacity;
    }
    public int getDailyTrainArrival(){
        return dailyTrainArrival;
    }
    public int getDailyTrainDeparture(){
        return dailyTrainDeparture;
    }
    public int getParkingSpaces(){
        return parkingSpaces;
    }

    public boolean getHasWaitingRoom(){
        return hasWaitingRoom;
    }
    public boolean getHasRestRooms(){
        return hasRestRooms;
    }
    public boolean getHasParking(){
        return hasParking;
    }
    public boolean getHAsBookStore(){
        return hasBookStore;
    }
    public boolean getFoodCourt(){
        return hasFoodCourt;
    }
    public boolean getHasATM(){
        return hasATM;
    }
    public boolean getHasMedicalFacility(){
        return hasMedicalFacility;
    }
    public boolean getHasFoodCourt(){
        return hasFoodCourt;
    }
    public boolean getHasEscalator(){
        return hasEscalator;
    }
    public boolean getHasElevator(){
        return hasElevator;
    }
    public boolean getHasWifi(){
        return hasWifi;
    }

    public String getOperatingHours(){
        return operatingHours;
    }



    //----------Setter Method---------------

    public void setStationName(String stationName){
        this.stationName=stationName;
    }
    public void setStationCode(String stationCode){
        this.stationCode=stationCode;
    }
    public void setLocation(String location){
        this.location=location;
    }
    public void setStationManagerName(String stationManagerName){
        this.stationManagerName=stationManagerName;
    }
    public void setStationManagerContact(String stationManagerContact){
        this.stationManagerContact=stationManagerContact;
    }
    public void setEmergencyContact(String emergencyContact){
        this.emergencyContact=emergencyContact;
    }
    public void setConstructionDate(String constructionDate) {
        this.constructionDate = constructionDate;
    }
    public void setLastInspectionDate(String lastInspectionDate){
        this.lastInspectionDate=lastInspectionDate;
    }
    public void setStationCategory(String stationCategory){
        this.stationCategory=stationCategory;
    }
    public void setTotalTracks(int totalTracks){
        this.totalTracks=totalTracks;
    }
    public void setPlatformCount(int platformCount){
        this.platformCount=platformCount;
    }
    public void setAvailableTicketCounters(int availableTicketCounters){
        this.availableTicketCounters=availableTicketCounters;
    }
    public void setTotalTrains(int totalTrains){
        this.totalTrains=totalTrains;
    }
    public void setOperatingTrains(int operatingTrains){
        this.operatingTrains=operatingTrains;
    }
    public void setMaxTrainCapacity(int maxTrainCapacity){
        this.maxTrainCapacity=maxTrainCapacity;
    }
    public void setDailyTrainArrival(int dailyTrainArrival){
        this.dailyTrainArrival=dailyTrainArrival;
    }
    public void setDailyTrainDeparture(int dailyTrainDeparture){
        this.dailyTrainDeparture=dailyTrainDeparture;
    }
    public void setParkingSpaces(int parkingSpaces){
        this.parkingSpaces=parkingSpaces;
    }

    public void setHasWaitingRoom(boolean waitingRoom){
        this.hasWaitingRoom=hasWaitingRoom;
    }
    public void setHasRestRooms(boolean restRooms){
        this.hasRestRooms=hasRestRooms;
    }
    public void setHasParking(boolean hasParking){
        this.hasParking=hasParking;
    }
    public void setHasBookStore(boolean hasBookStore){
        this.hasBookStore=hasBookStore;
    }
    public void setHasFoodCourt(boolean hasFoodCourt){
        this.hasFoodCourt=hasFoodCourt;
    }
    public void setHasATM(boolean hasATM){
        this.hasATM=hasATM;
    }
    public void setHasMedicalFacility(boolean hasMedicalFacility){
        this.hasMedicalFacility=hasMedicalFacility;
    }
    public void setHasEscalator(boolean hasEscalator){
        this.hasEscalator=hasEscalator;
    }
    public void setHasElevator(boolean hasElevator){
        this.hasElevator=hasElevator;
    }
    public void setHasWifi(boolean hasWifi){
        this.hasWifi=hasWifi;
    }
    public  void setOperatingHours(String operatingHours){
        this.operatingTrains=operatingTrains;
    }




}
