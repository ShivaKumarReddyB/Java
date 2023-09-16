package movies;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AmcTheater {
    private  String movieName, seatType, bav, nameCust, vehType;
    private int  numOfTickets, onOfVehicles, noOfBev;
    private  double TAX_SALES = 0.05;
    private  double TAX_BAR = 0.03;
    private  double TAX_PAR = 0.015;

    private  boolean isMember, isFirstMember;
    private  double seatFare;

    public  AmcTheater(){}

    public  AmcTheater(String movieName, int noOfTkt, String seatType, boolean isMemberShip,boolean isFirstMember){
        this.movieName = movieName;
        this.numOfTickets = noOfTkt;
        this.seatType = seatType;
        this.isMember = isMemberShip;
        this.isFirstMember = isFirstMember;

    }

    public  AmcTheater( int onOfVehicles, String nameCust, String vehType){
        this.onOfVehicles = onOfVehicles;
        this.nameCust = nameCust;
        this.vehType = vehType;
    }

    public  AmcTheater( String movieName, String seatType){
        this.movieName = movieName;
        this.seatType = seatType;
    }

    public AmcTheater(String bav){
        this.bav = bav;
    }

    public AmcTheater(int noOfBev, String bav){
        this.noOfBev = noOfBev;
        this.bav = bav;
    }

    public  AmcTheater(String movieName, int onOfVehicles){
        this.movieName = movieName;
        this.onOfVehicles = onOfVehicles;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getSeatType() {
        return seatType;
    }

    public String getBav() {
        return bav;
    }

    public String getNameCust() {
        return nameCust;
    }

    public String getVehType() {
        return vehType;
    }

    public int getNumOfTickets() {
        return numOfTickets;
    }

    public int getOnOfVehicles() {
        return onOfVehicles;
    }

    public int getNoOfBev() {
        return noOfBev;
    }

    public double getTAX_SALES() {
        return TAX_SALES;
    }

    public double getTAX_BAR() {
        return TAX_BAR;
    }

    public double getTAX_PAR() {
        return TAX_PAR;
    }

    public boolean isMember() {
        return isMember;
    }

    public boolean isFirstMember() {
        return isFirstMember;
    }

    public double getSeatFare() {
        return seatFare;
    }

    // Setter methods
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public void setBav(String bav) {
        this.bav = bav;
    }

    public void setNameCust(String nameCust) {
        this.nameCust = nameCust;
    }

    public void setVehType(String vehType) {
        this.vehType = vehType;
    }

    public void setNumOfTickets(int numOfTickets) {
        this.numOfTickets = numOfTickets;
    }

    public void setOnOfVehicles(int onOfVehicles) {
        this.onOfVehicles = onOfVehicles;
    }

    public void setNoOfBev(int noOfBev) {
        this.noOfBev = noOfBev;
    }

    public void setMember(boolean member) {
        isMember = member;
    }

    public void setFirstMember(boolean firstMember) {
        isFirstMember = firstMember;
    }

    public void setSeatFare(double seatFare) {
        this.seatFare = seatFare;
    }

    // CheckMemberShip()

    public double checkMemberShip(){
        double discount = 0;
        if(isMember) {
            discount =  0.50 ;
        }

        if(isMember && isFirstMember){
            discount = 0.25;
        }

        return  discount;
    }

    public  double checkSeatFare(){
        double seatFare = 0;

        switch (seatType){
            case "Lounge":
                seatFare = 40;
                break;
            case "Top" :
                seatFare = 35;
                break;
            case "Middle":
                seatFare = 30;
                break;
            case  "Bottom":
                seatFare = 25;
                break;

        }

        return  seatFare;

    }

    public  double totalTktPrice(){
        double seatPrice = checkSeatFare();
        double discount = checkMemberShip();
        double totalPrice = numOfTickets * seatPrice * (1 - discount);
        return totalPrice + totalPrice * TAX_SALES;

    }

    public double beverageCost(String bev, int num) {
        double cost = 0.0;
        switch (bev) {
            case "Pepsi":
                cost = 10.0;
                break;
            case "Samosa":
                cost = 17.99;
                break;
            case "Nachos":
                cost = 7.99;
                break;
            case "Cakes":
                cost = 11.89;
                break;
            case "Water":
                cost = 5.0;
                break;
        }
        return cost * num;
    }

    public double totalBavCost(String str, int num){
        double bevCost = beverageCost(str, num);
        return  bevCost +bevCost * TAX_BAR;
    }

    public String getCurrentTime(){
        DateFormat formatter = new SimpleDateFormat("hh:mm a");
        String time = formatter.format(new Date());
        return  time;
    }
    public  String getCurrentDate(){
        LocalDate dateObj = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String date = dateObj.format(formatter);
        return date;
    }

    public String tktPrint(){
        return  "********************************************************"+"\n"+
                "***          AMC                                   ***"+ "\n"+
                "*******************************************************"+ "\n"+
                "* Date   "+ getCurrentDate()+ "          Time: "+ getCurrentTime() +  "   *"+"\n"+
                "* Screen No : 04                 Floor : 7                         *" + "\n"+
                "* Movie Name                   :"+movieName+       "               *"+"\n" +
                "* Seat Type                     :"+seatType+"("+ checkSeatFare()+")"+"        *"+ "\n"+
                "* Number  of Tickets           :"+ numOfTickets+"         *"+ "\n"+
                "*                              -------------   " +"\n" +
                "* Total Cost (Inc Tax)         :"+ totalTktPrice() +"\n" +
                "*************************************************"+"\n"+
                "------------------Thank You Visit Again --------- *";
    }

    public String bavTkt(String str, int num ){
        return  "*********************************"+"\n"+
                "***          AMC               ***"+ "\n"+
                "***********************************"+ "\n"+
                "* Date"+ getCurrentDate()+ "  Time: "+ getCurrentTime() + "*"+"\n"+
                "* Screen No : 04                 Floor : 7   *" + "\n"+
                "*                                                  *"+"\n" +
                "*******************Beverages Bill ********************"+"\n" +
                "* Items     Price          Quantity *"+ "\n"+
                "* "+str+"  "+ beverageCost(str, num)+" "+ num+"       *"+ "\n"+
                "*                              -------------   " +"\n" +
                "* Total Cost (Inc Tax)      :"+ totalBavCost(str,num) +"\n" +
                "*************************************************"+"\n"+
                "------------------Thank You Visit Again --------- *";
    }

    public  double vehFare(String str){
        switch (str.toLowerCase()){
            case  "bicycle" :
                return  2.0;
            case "two-wheeler":
                return  3.50;
            case "four-wheeler":
                return  5.0;
            default:
                return 7.0;

        }
    }

    public  double vehTotalCost(String str, int num){
        double vehCost = vehFare(str) * num;
        return  vehCost +vehCost * TAX_PAR;
    }

    public String parkTkt(String str, int num ){
        return  "**********************************************************"+"\n"+
                "***                         AMC               ***"+ "\n"+
                "**********************************************************"+ "\n"+
                "* Date "+ getCurrentDate()+ "  Time: "+ getCurrentTime() + " *"+"\n"+
                "* Screen No : 04                 Floor : 7   *" + "\n"+
                "*                                                           *"+"\n" +
                "* Customer Name        :"+nameCust+"                        *"+"\n" +
                "* S/no     VehicleType          No of Vehicles                *"+ "\n"+
                "* 1         "+ str+"               "+ num+"                 *"+ "\n"+
                "*                              -------------                 * "    +"\n" +
                "* Total Cost (Inc Tax)      :"+ vehTotalCost(str,num)+"      *" +"\n" +
                "*************************************************"+"\n"+
                "------------------Thank You Visit Again --------- *";
    }







}
