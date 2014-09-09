///////////////////////
/////Ji Ho Choi
///HW02
///CSE002
///Fundamentals of Programming
///define the public class
public class Arithmetic {
    ///need main method
    public static void main (String[] args) {
        //put all the input data
        //number of pair of socks
        int nSocks=3;
        //cost per pair of socks
        //$ is the part of the variable name
        double sockCost$=2.58;
        //number of drinking glasses
        int nGlasses=6;
        //cost per glass
        double glassCost$=2.29;
        //number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        //this is the tax for PA
        double taxPercent=0.06;
        //Now I need to define variables I am going to use for the calculation
        double totalSockCost$, totalGlassCost$, totalEnvelopeCost$, totalSalesTax$,
        totalCostB4Tax, totalCost, totalSalesTax$decimal, totalSalesTax$intx100;
        //now I need to script the algebra
        totalSockCost$=nSocks*sockCost$;
        //make java print out the line that tells me the value
        System.out.println("Socks cost "+totalSockCost$+" USD in total");
        //totalGlassCost$
        totalGlassCost$=nGlasses*glassCost$;
        System.out.println("Glasses cost "+totalGlassCost$+" USD in total");
        //total Envelope cost
        totalEnvelopeCost$=nEnvelopes*envelopeCost$;
        System.out.println("Envelopes cost "+totalEnvelopeCost$+" USD in total");
        //now I need to calculate the totalCostB4Tax
        totalCostB4Tax=totalSockCost$+totalEnvelopeCost$+totalGlassCost$;
        System.out.println("Total cost before the sales tax is "+totalCostB4Tax+" USD");
        //calculate the sales tax
        totalSalesTax$=totalCostB4Tax*taxPercent;
        totalSalesTax$intx100=totalSalesTax$*100;
        
        int totaltaxfinal=(int)totalSalesTax$intx100;
        totalSalesTax$decimal=totaltaxfinal/100.0;
        System.out.println("Total sales tax is "+totalSalesTax$decimal+"USD");
        //now I need to calculate the total cost after applying the tax
        totalCost=totalCostB4Tax-totalSalesTax$decimal;
        System.out.println("Total cost including the tax is "+totalCost+" USD");
        
        /*double totalSockCost$, totalGlassCost$, totalEnvelopeCost$, totalSalesTax$,
        totalCostB4Tax, totalCost, totalSalesTax$decimal, totalSalesTaxx100$;
        int totalSalesTax$int;
        //now I need to script the algebra
        totalSockCost$=nSocks*sockCost$;
        //make java print out the line that tells me the value
        System.out.println("Socks cost "+totalSockCost$+" USD in total");
        //totalGlassCost$
        totalGlassCost$=nGlasses*glassCost$;
        System.out.println("Glasses cost "+totalGlassCost$+" USD in total");
        //total Envelope cost
        totalEnvelopeCost$=nEnvelopes*envelopeCost$;
        System.out.println("Envelopes cost "+totalEnvelopeCost$+" USD in total");
        //now I need to calculate the totalCostB4Tax
        totalCostB4Tax=totalSockCost$+totalEnvelopeCost$+totalGlassCost$;
        System.out.println("Total cost before the sales tax is "+totalCostB4Tax+" USD");
        //calculate the sales tax
        totalSalesTax$=totalCostB4Tax*taxPercent;
        totalSalesTaxx100$=totalSalesTax$*100;
        totalSalesTax$int=totalSalesTax$/100;
        
        //causes a syntax error because int cannot be changed to double
        
        System.out.println("Total sales tax is "+totalSalesTax$+"USD");
        //now I need to calculate the total cost after applying the tax
        totalCost=totalCostB4Tax-totalSalesTax$;
        System.out.println("Total cost including the tax is "+totalCost+"USD");
        (Testing) */
        
        
    }
}