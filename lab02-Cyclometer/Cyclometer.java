//Ji Ho Choi
/*CSE001
This program will print the number of minutes for each trip
print the # of counts, print the distance, and distance of two trips combined
*/
//I need to define public class
public class Cyclometer {
    //Main method required for all java program
    public static void main (String[] args) {
        //out input data
        int secsTrip1=480;//this is the seconds it took for trip 1
        int secsTrip2=3220;//seconds it took for trip 2
        int countsTrip1=1561;//this is the counts variable for trip 1
        int countsTrip2=9037;//this is the counts for trip 2
        double wheelDiameter=27.0,//created variable for wheelDiameter
        PI=3.14159,//variable for pi
        feetPerMile=5280,//converting feet into mile
        inchesPerFoot=12,//12 inches in 1 foot
        secondsPerMinute=60;//60 seconds in a minute
        double distanceTrip1, distanceTrip2, totalDistance;//variable for calculations
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");//calculation of seconds for Trip1 to minutes and counts
        System.out.println("Trip 2 took "+
            
            (secsTrip2/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");//calculation for "line 23" trip2
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //Above gives distance in inches
        //(For each count, a rotation of the wheel travels
        //the diameter in inches time PI)
        distanceTrip1/=inchesPerFoot*feetPerMile;
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        //print out the output data
        totalDistance=distanceTrip1+distanceTrip2;
        System.out.println("Trip 1 was "+distanceTrip1+" miles");//text for the trip
        System.out.println("Trip 2 was "+distanceTrip2+" miles");//also a text for the trip
        System.out.println("The total distance was "+totalDistance+" miles");//text for total distance
        
        
        
    } //end of main method
} //end of class
    
