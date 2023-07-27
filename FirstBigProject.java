import java.util.Objects;
import java.util.Scanner ;
import java.util.Random;
public class FirstBigProject{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int yourchoice ;

        // ASK NAME FROM THE USER
        System.out.println();
        System.out.println("***********************************************************************************************************************************************************************************");
        System.out.print("ENTER YOUR NAME --> ");
        String name = s.nextLine();
        System.out.println();
        // ALL TASKS WHICH YOU CAN RUN
        do{
            // WHICH TASK TO DO ?
            System.out.println("HELLO "+name.toUpperCase()+ ",\nTHE TASK LIST IS GIVEN BELOW, PLEASE CHOOSE ONE OF THEM TO EXECUTE.");
            System.out.println("|---------------------------------------------------------------------|");
            System.out.println("| SNO.     | PROGRAMS WHICH YOU CAN EXECUTE                           |");
            System.out.println("|---------------------------------------------------------------------|");
            // CHECK WHETHER THE NUMBER IS PRIME OR NOT
            System.out.println("| PRESS 1  | TO CHECK WHETHER THE NUMBER IS PRIME OR NOT              |");
            // AREA OF DIFFERENT FIGURES
            System.out.println("| PRESS 2  | TO FIND AREA OF DIFFERENT FIGURES                        |");
            // VOLUME OF DIFFERENT FIGURES
            System.out.println("| PRESS 3  | TO FIND VOLUME OF DIFFERENT FIGURES                      |");
            // PERIMETER OF CIRCLE
            System.out.println("| PRESS 4  | TO FIND PERIMETER OF DIFFERENT FIGURES                   |");
            // CONVERSION OF DISTANCE MEASUREMENT
            System.out.println("| PRESS 5  | TO CONVERT DISTANCE MEASUREMENTS                         |");
            // CONVERSION OF WEIGHT MEASUREMENTS
            System.out.println("| PRESS 6  | TO CONVERT WEIGHT MEASUREMENTS                           |");
            // CALCULATE PERCENTAGE FOR GIVEN SUBJECTS AND MARKS
            System.out.println("| PRESS 7  | TO CALCULATE THE PERCENTAGE FOR GIVEN SUBJECTS AND MARKS |");
            // RANDOM NUMBER GENERATOR BETWEEN THE GIVEN LIMITS
            System.out.println("| PRESS 8  | TO GENERATE RANDOM NUMBER BETWEEN THE GIVEN LIMITS       |");
            // TO CALCULATE SIMPLE INTEREST
            System.out.println("| PRESS 9  | TO CALCULATE SIMPLE INTEREST                             |");
            // TO CALCULATE COMPOUND INTEREST
            System.out.println("| PRESS 10 | TO CALCULATE COMPOUND INTEREST                           |");
            // STONE PAPER SCISSORS GAME
            System.out.println("| PRESS 11 | TO PLAY STONE PAPER SCISSORS GAME                        |");
            // CONVERSION OF DECIMAL VALUE IN BINARY
            System.out.println("| PRESS 12 | TO CONVERT DECIMAL VALUE IN BINARY VALUE                 |");
            // CONVERSION OF BINARY VALUE IN DECIMAL VALUE
            System.out.println("| PRESS 13 | TO CONVERT BINARY VALUE IN DECIMAL VALUE                 |");
            // HAND CRICKET GAME WITH COMPUTERS
            System.out.println("| PRESS 14 | TO PLAY HAND-CRICKET GAME WITH COMPUTER                  |");
            // CALCULATE FACTORIAL NUMBER
            System.out.println("| PRESS 15 | TO CALCULATE THE FACTORIAL OF A NUMBER                   |");
            // CALCULATE AVERAGE OF GIVEN NUMBERS
            System.out.println("| PRESS 16 | TO CALCULATE THE AVERAGE OF GIVEN NUMBERS                |");
            //CALCULATE PERMUTATION ADN COMBINATION
            System.out.println("| PRESS 17 | TO CALCULATE PERMUTATION AND COMBINATION                 |");
            //TABLES
            System.out.println("| PRESS 18 | TO PRINT TABLE OF ANY NUMBER                             |");
            // FREE SPACE
            System.out.println("|---------------------------------------------------------------------|");

            // SELECT WHICH CHOICE TO DO
            System.out.print("ENTER THE \"SNO.\" OF A TASK IN LIST WHICH YOU WANT TO EXECUTE --> ");
            int task = s.nextInt();

            // ALL CHOICES
            if(task==1){
                System.out.println("SNO. SELECTED BY YOU IS : 1");
                System.out.print("ENTER THE VALUE WHICH YOU WANT TO CHECK --> ");
                int prime = s.nextInt();
                int count = 0;
                for(int i = 1; i<=prime; i++)
                    if(prime%i==0){
                        count++;
                    }
                if(count==2){
                    System.out.println(prime+" is a \"PRIME NUMBER\".");
                }
                else{
                    System.out.println(prime+" is \"NOT PRIME NUMBER\".");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                }
            }

            if(task==2){
                System.out.println("SNO. SELECTED BY YOU IS : 2");
                System.out.println("|----------------------------------------------------------------|");
                System.out.println("| SNO.     |  AREA OF DIFFERENT FIGURES                          |");
                System.out.println("|----------------------------------------------------------------|");
                // AREA OF CIRCLE
                System.out.println("| PRESS 1  |  AREA OF CIRCLE                                     |");
                // AREA OF SEMI-CIRCLE
                System.out.println("| PRESS 2  |  AREA OF SEMI-CIRCLE                                |");
                // AREA OF SQUARE
                System.out.println("| PRESS 3  |  AREA OF SQUARE                                     |");
                // AREA OF RECTANGLE
                System.out.println("| PRESS 4  |  AREA OF RECTANGLE                                  |");
                // AREA OF TRIANGLE
                System.out.println("| PRESS 5  |  AREA OF TRIANGLE                                   |");
                // AREA OF PARALLELOGRAM
                System.out.println("| PRESS 6  |  AREA OF PARALLELOGRAM                              |");
                // AREA OF RHOMBUS
                System.out.println("| PRESS 7  |  AREA OF RHOMBUS                                    |");
                System.out.println("|----------------------------------------------------------------|");
                System.out.print("ENTER YOUR CHOICE --> ");
                int aodf = s.nextInt();
                if(aodf==1){
                    System.out.println("AREA OF CIRCLE");
                    System.out.print("ENTER RADIUS OF CIRCLE --> ");
                    double aoc = s.nextDouble();
                    double areaofcircle = (3.14*aoc*aoc);
                    System.out.println("PI = 3.14");
                    System.out.println("AREA OF CIRCLE --> "+areaofcircle+" cm^2");
                }
                if(aodf==2){
                    System.out.println("AREA OF SEMI-CIRCLE");
                    System.out.print("ENTER RADIUS OF SEMI-CIRCLE --> ");
                    double aosc = s.nextDouble();
                    double areaofsemicircle = (3.14*aosc*aosc)/2;
                    System.out.println("PI = 3.14");
                    System.out.println("AREA OF SEMI-CIRCLE --> "+areaofsemicircle+" cm^2");

                }
                if(aodf==3){
                    System.out.println("AREA OF SQUARE");
                    System.out.print("ENTER VALUE OF SQUARE SIDE --> ");
                    double aos = s.nextDouble();
                    double areaodsquare = (aos*aos);
                    System.out.println("AREA OF SQUARE --> "+areaodsquare+" cm^2");

                }
                if(aodf==4){
                    System.out.println("AREA OF RECTANGLE");
                    System.out.print("ENTER LENGTH OF RECTANGLE --> ");
                    double arealengthofrectangle = s.nextDouble();
                    System.out.print("ENTER WIDTH OF RECTANGLE --> ");
                    double areawidthofrectangle = s.nextDouble();
                    double areaofrectangle = (arealengthofrectangle*areawidthofrectangle);
                    System.out.println("AREA OF RECTANGLE --> "+areaofrectangle+" cm^2");

                }
                if(aodf==5){
                    System.out.println("AREA OF TRIANGLE");
                    System.out.print("ENTER BASE OF THE TRIANGLE --> ");
                    double areabaseoftriangle = s.nextDouble();
                    System.out.print("ENTER HEIGHT OF THE TRIANGLE --> ");
                    double areaheightoftriangle = s.nextDouble();
                    double areaoftriangle = (areabaseoftriangle*areaheightoftriangle)/2;
                    System.out.println("AREA OF TRIANGLE --> "+areaoftriangle+" cm^2");

                }
                if(aodf==6){
                    System.out.println("AREA OF PARALLELOGRAM");
                    System.out.print("ENTER BASE OF PARALLELOGRAM --> ");
                    double areabaseofparallelogram = s.nextDouble();
                    System.out.print("ENTER HEIGHT OF RECTANGLE --> ");
                    double areaheightofparallelogram = s.nextDouble();
                    double areaofparallelogram = (areabaseofparallelogram*areaheightofparallelogram);
                    System.out.println("AREA OF PARALLELOGRAM --> "+areaofparallelogram+" cm^2");

                }
                if(aodf==7){
                    System.out.println("FROM WHICH WAY YOU WANT TO FIND AREA OF RHOMBUS");
                    System.out.println("PRESS 1 --> FOR USING [BASE * HEIGHT] FORMULA");
                    System.out.println("PRESS 2 --> FOR USING [(DIAGONAL 1 * DIAGONAL 2)/2] FORMULA");
                    System.out.print("ENTER YOUR CHOICE --> ");
                    int press = s.nextInt();
                    if(press==1){
                        System.out.println("AREA OF RHOMBUS");
                        System.out.print("ENTER BASE OF THE RHOMBUS --> ");
                        double areabaseofrhombus = s.nextDouble();
                        System.out.print("ENTER HEIGHT OF THE RHOMBUS --> ");
                        double areaheightofrhombus = s.nextDouble();
                        double areaofrhombus = (areaheightofrhombus*areabaseofrhombus);
                        System.out.println("AREA OF RHOMBUS --> "+areaofrhombus+" cm^2");
                    }
                    if(press==2){
                        System.out.println("AREA OF RHOMBUS");
                        System.out.print("ENTER DIAGONAL 1 OF THE RHOMBUS --> ");
                        double areadiagonal1ofrhombus = s.nextDouble();
                        System.out.print("ENTER DIAGONAL 2 OF THE RHOMBUS --> ");
                        double areadiagonal2ofrhombus = s.nextDouble();
                        double areaofrhombus = (areadiagonal1ofrhombus*areadiagonal2ofrhombus)/2;
                        System.out.println("AREA OF RHOMBUS --> "+areaofrhombus+" cm^2");

                    }

                }System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            }

            if(task==3){
                System.out.println("SNO. SELECTED BY YOU IS : 3");
                System.out.println("|-----------------------------------------------------------------|");
                System.out.println("| SNO.     |  VOLUME OF DIFFERENT FIGURES                         |");
                System.out.println("|-----------------------------------------------------------------|");
                // AREA OF CIRCLE
                System.out.println("| PRESS 1  |  VOLUME OF CONE                                      |");
                // AREA OF SEMI-CIRCLE
                System.out.println("| PRESS 2  |  VOLUME OF CUBE                                      |");
                // AREA OF SQUARE
                System.out.println("| PRESS 3  |  VOLUME OF CUBOID                                    |");
                // AREA OF RECTANGLE
                System.out.println("| PRESS 4  |  VOLUME OF SPHERE                                    |");
                // AREA OF TRIANGLE
                System.out.println("| PRESS 5  |  VOLUME OF SEMI-SPHERE                               |");
                // AREA OF RHOMBUS
                System.out.println("| PRESS 6  |  VOLUME OF CYLINDER                                  |");
                System.out.println("|-----------------------------------------------------------------|");
                System.out.print("ENTER YOUR CHOICE --> ");
                int vodf = s.nextInt();
                if(vodf==1){
                    System.out.println("VOLUME OF CONE");
                    System.out.print("ENTER RADIUS OF CONE --> ");
                    double volumeradiusofcone = s.nextDouble();
                    System.out.print("ENTER HEIGHT OF CONE --> ");
                    double volumeheightofcone = s.nextDouble();
                    double volumeofcone = (3.14*volumeradiusofcone*volumeradiusofcone*volumeheightofcone)/3;
                    System.out.println("VOLUME OF CONE --> "+volumeofcone+" cm^3");

                }
                if(vodf==2){
                    System.out.println("VOLUME OF CUBE");
                    System.out.print("ENTER SIDE VALUE OF CUBE --> ");
                    double volumesideofcube = s.nextDouble();
                    double volumeofcube = (volumesideofcube * volumesideofcube * volumesideofcube);
                    System.out.println("VOLUME OF CUBE --> "+volumeofcube+" cm^3");

                }
                if(vodf==3){
                    System.out.println("VOLUME OF CUBOID");
                    System.out.print("ENTER WIDTH OF CUBOID --> ");
                    double volumewidthofcuboid = s.nextDouble();
                    System.out.print("ENTER LENGTH OF CUBOID ---> ");
                    double volumelengthofcuboid = s.nextDouble();
                    System.out.print("ENTER HEIGHT OF CUBOID --> ");
                    double volumeheightofcuboid = s.nextDouble();
                    double volumeofcuboid = (volumewidthofcuboid*volumelengthofcuboid*volumeheightofcuboid);
                    System.out.println("VOLUME OF CUBOID --> "+volumeofcuboid+" cm^3");

                }
                if(vodf==4){
                    System.out.println("VOLUME OF SPHERE");
                    System.out.print("ENTER RADIUS OF SPHERE --> ");
                    double volumeradiusofsphere = s.nextDouble();
                    double volumeofsphere = (4*3.14*volumeradiusofsphere*volumeradiusofsphere*volumeradiusofsphere)/3;
                    System.out.println("VOLUME OF SPHERE --> "+volumeofsphere+" cm^3");
                }
                if(vodf==5){
                    System.out.println("VOLUME OF SEMI-SPHERE");
                    System.out.print("ENTER RADIUS OF SEMI-SPHERE --> ");
                    double volumeradiusofsemisphere = s.nextDouble();
                    double volumeofsemisphere = (2*3.14*volumeradiusofsemisphere*volumeradiusofsemisphere*volumeradiusofsemisphere)/3;
                    System.out.println("VOLUME OF SEMI-SPHERE --> "+volumeofsemisphere+" cm^3");
                }
                if(vodf==6){
                    System.out.println("VOLUME OF CYLINDER");
                    System.out.print("ENTER HEIGHT OF CYLINDER --> ");
                    double volumeheightofcylinder = s.nextDouble();
                    System.out.print("ENTER RADIUS OF CYLINDER --> ");
                    double volumeradiusofcylinder = s.nextDouble();
                    double volumeofcylinder = (3.14 * volumeradiusofcylinder * volumeradiusofcylinder * volumeheightofcylinder);
                    System.out.println("VOLUME OF RHOMBUS --> "+volumeofcylinder+" cm^3");

                }System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }

            if(task==4){
                System.out.println("NUMBER SELECTED BY YOU IS : 4");
                System.out.println("|----------------------------------------------------------------|");
                System.out.println("| SNO.     |  PERIMETER OF DIFFERENT FIGURES                     |");
                System.out.println("|----------------------------------------------------------------|");
                // PERIMETER OF CIRCLE
                System.out.println("| PRESS 1  |  PERIMETER OF CIRCLE                                 |");
                // PERIMETER OF SEMI-CIRCLE
                System.out.println("| PRESS 2  |  PERIMETER OF SEMI-CIRCLE                            |");
                // PERIMETER OF SQUARE
                System.out.println("| PRESS 3  |  PERIMETER OF SQUARE                                 |");
                // PERIMETER OF RECTANGLE
                System.out.println("| PRESS 4  |  PERIMETER OF RECTANGLE                              |");
                // PERIMETER OF TRIANGLE
                System.out.println("| PRESS 5  |  PERIMETER OF TRIANGLE                               |");
                // PERIMETER OF PARALLELOGRAM
                System.out.println("| PRESS 6  |  PERIMETER OF PARALLELOGRAM                          |");
                // PERIMETER OF RHOMBUS
                System.out.println("| PRESS 7  |  PERIMETER OF RHOMBUS                                |");
                System.out.println("|-----------------------------------------------------------------|");
                System.out.print("ENTER YOUR CHOICE --> ");
                int podf = s.nextInt();
                if(podf==1){
                    System.out.println("PERIMETER OF CIRCLE");
                    System.out.print("ENTER RADIUS OF CIRCLE --> ");
                    double perimeterradiusofcircle = s.nextDouble();
                    double perimeterofcircle = (2*3.14*perimeterradiusofcircle);
                    System.out.println("PERIMETER OF CIRCLE --> "+perimeterofcircle+" cm^2");
                }
                if(podf==2){
                    System.out.println("PERIMETER OF SEMI-CIRCLE");
                    System.out.print("ENTER RADIUS OF CIRCLE --> ");
                    double perimeterradiusofsemicircle = s.nextDouble();
                    double perimeterofsemicircle = (3.14*perimeterradiusofsemicircle)+(2*perimeterradiusofsemicircle);
                    System.out.println("PERIMETER OF SEMI-CIRCLE --> "+perimeterofsemicircle+" cm^2");
                }
                if(podf==3){
                    System.out.println("PERIMETER OF SQUARE");
                    System.out.print("ENTER SIDE OF SQUARE --> ");
                    double perimetersideofsquare = s.nextDouble();
                    double perimeterofsquare = (4*perimetersideofsquare);
                    System.out.println("PERIMETER OF SQUARE --> "+perimeterofsquare+" cm^2");
                }
                if(podf==4){
                    System.out.println("PERIMETER OF RECTANGLE");
                    System.out.print("ENTER LENGTH OF RECTANGLE --> ");
                    double perimeterlengthofrectangle = s.nextDouble();
                    System.out.print("ENTER WIDTH OF RECTANGLE --> ");
                    double perimeterwidthofrectangle = s.nextDouble();
                    double perimeterofrectangle = 2*(perimeterlengthofrectangle+perimeterwidthofrectangle);
                    System.out.println("PERIMETER OF RECTANGLE --> "+perimeterofrectangle+" cm^2");
                }
                if(podf==5){
                    System.out.println("PERIMETER OF TRIANGLE");
                    System.out.print("ENTER SIDE 1 OF TRINAGLE --> ");
                    double perimeterside1oftriangle = s.nextDouble();
                    System.out.print("ENTER SIDE 2 OF TRIANGLE --> ");
                    double perimeterside2oftriangle = s.nextDouble();
                    System.out.print("ENTER SIDE 3 OF TRIANGLE --> ");
                    double perimeterside3oftriangle = s.nextDouble();
                    double perimeteroftriangle = (perimeterside1oftriangle+perimeterside2oftriangle+perimeterside3oftriangle);
                    System.out.println("PERIMETER OF TRIANGLE --> "+perimeteroftriangle+" cm^2");
                }
                if(podf==6){
                    System.out.println("PERIMETER OF PARALLELOGRAM");
                    System.out.print("ENTER SIDE OF PARALLELOGRAM --> ");
                    double perimetersideofparallelogram = s.nextDouble();
                    System.out.print("ENTER BASE OF PARALLELOGRAM --> ");
                    double perimeterbaseofparallelogram = s.nextDouble();
                    double perimeterofparallelogram = (2*perimetersideofparallelogram*perimeterbaseofparallelogram);
                    System.out.println("PERIMETER OF PARALLELOGRAM --> "+perimeterofparallelogram+" cm^2");
                }
                if(podf==7){
                    System.out.println("PERIMETER OF RHOMBUS");
                    System.out.print("ENTER SIDE OF RHOMBUS --> ");
                    double perimetersideofrhombus = s.nextDouble();
                    double perimeterofrhombus = (4*perimetersideofrhombus);
                    System.out.println("PERIMETER OF RHOMBUS --> "+perimeterofrhombus+" cm^2");
                }System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }

            if(task==5){
                System.out.println("NUMBER SELECTED BY YOU IS : 5");
                System.out.println("|-----------------------------------------------------------------|");
                System.out.println("| SNO.     |  CONVERT DISTANCE MEASUREMENTS                       |");
                System.out.println("|-----------------------------------------------------------------|");
                // CONVERT MILLI-METERS INTO CENTIMETERS OR METERS OR KILOMETERS OR YARDS OR INCHES OR FEET OR MILES
                System.out.println("| PRESS 1  |  CONVERT MILLI-METERS                                |");
                // CONVERT CENTIMETERS INTO MILLI-METERS OR METERS OR KILOMETERS OR YARDS OR INCHES OR FEET OR MILES
                System.out.println("| PRESS 2  |  CONVERT CENTIMETERS                                 |");
                // CONVERT METERS INTO MILLI-METERS OR CENTIMETERS OR KILOMETERS OR YARDS OR INCHES OR FEET OR MILES
                System.out.println("| PRESS 3  |  CONVERT METERS                                      |");
                // CONVERT KILOMETERS INTO MILLI-METERS OR CENTIMETERS OR METERS OR YARDS OR INCHES OR FEET OR MILES
                System.out.println("| PRESS 4  |  CONVERT KILOMETERS                                  |");
                // CONVERT YARDS INTO MILLI-METERS OR CENTIMETERS OR METERS OR KILOMETERS OR INCHES OR FEET OR MILES
                System.out.println("| PRESS 5  |  CONVERT YARDS                                       |");
                // CONVERT INCHES INTO MILLI-METERS OR CENTIMETERS OR METERS OR KILOMETERS OR YARDS OR FEET OR MILES
                System.out.println("| PRESS 6  |  CONVERT INCHES                                      |");
                // CONVERT FEET INTO MILLI-METERS OR CENTIMETERS OR METERS OR KILOMETERS OR YARDS OR INCHES OR MILES
                System.out.println("| PRESS 7  |  CONVERT FEET                                        |");
                // CONVERT MILES INTO MILLI-METERS OR CENTIMETERS OR METERS OR KILOMETERS OR YARDS OR INCHES OR FEET
                System.out.println("| PRESS 8  |  CONVERT MILES                                       |");
                System.out.println("|-----------------------------------------------------------------|");
                System.out.print("ENTER YOUR CHOICE --> ");
                int cdm = s.nextInt();

                if(cdm==1){
                    System.out.println("CONVERT MILLI-METERS");
                    System.out.println("ENTER VALUE --> ");
                    double convertmillimeters = s.nextDouble();
                    double convertedincentimeters = (convertmillimeters*0.1);
                    double convertedinmeters = (convertmillimeters*0.001);
                    double convertedinkilometers = (convertmillimeters*0.000001);
                    double convertedinyards = (convertmillimeters*0.00109361);
                    double convertedininches = (convertmillimeters*0.0393701);
                    double convertedinfeet = (convertmillimeters*0.00328084);
                    double convertedinmiles = (convertmillimeters*6.213712121212)/10000000;
                    System.out.println(convertmillimeters+" IN CENTI-METERS --> "+convertedincentimeters);
                    System.out.println(convertmillimeters+" IN METERS --> "+convertedinmeters);
                    System.out.println(convertmillimeters+" IN KILOMETERS --> "+convertedinkilometers);
                    System.out.println(convertmillimeters+" IN YARDS --> "+convertedinyards);
                    System.out.println(convertmillimeters+" IN INCHES --> "+convertedininches);
                    System.out.println(convertmillimeters+" IN FEET --> "+convertedinfeet);
                    System.out.println(convertmillimeters+" IN MILES --> "+convertedinmiles);
                }
                if(cdm==2){
                    System.out.println("CONVERT CENTIMETERS");
                    System.out.println("ENTER VALUE --> ");
                    double convertcentimeters = s.nextDouble();
                    double convertedinmillimeters = (convertcentimeters*10);
                    double convertedinmeters = (convertcentimeters*0.01);
                    double convertedinkilometers = (convertcentimeters)/100000;
                    double convertedinyards = (convertcentimeters*0.0109361);
                    double convertedininches = (convertcentimeters*0.393701);
                    double convertedinfeet = (convertcentimeters*0.0328084);
                    double convertedinmiles = (convertcentimeters*6.2137)/1000000;
                    System.out.println(convertcentimeters+" IN MILLI-METERS --> "+convertedinmillimeters);
                    System.out.println(convertcentimeters+" IN METERS --> "+convertedinmeters);
                    System.out.println(convertcentimeters+" IN KILOMETERS --> "+convertedinkilometers);
                    System.out.println(convertcentimeters+" IN YARDS --> "+convertedinyards);
                    System.out.println(convertcentimeters+" IN INCHES --> "+convertedininches);
                    System.out.println(convertcentimeters+" IN FEET --> "+convertedinfeet);
                    System.out.println(convertcentimeters+" IN MILES --> "+convertedinmiles);
                }
                if(cdm==3){
                    System.out.println("CONVERT METERS");
                    System.out.println("ENTER VALUE --> ");
                    double convertmeters = s.nextDouble();
                    double convertedinmillimeters = (convertmeters*1000);
                    double convertedincentimeters = (convertmeters*100);
                    double convertedinkilometers = (convertmeters*0.001);
                    double convertedinyards = (convertmeters*1.09361);
                    double convertedininches = (convertmeters*39.3701);
                    double convertedinfeet = (convertmeters*3.28084);
                    double convertedinmiles = (convertmeters*0.000621371);
                    System.out.println(convertmeters+" IN MILLI-METERS --> "+convertedinmillimeters);
                    System.out.println(convertmeters+" IN CENTIMETERS --> "+convertedincentimeters);
                    System.out.println(convertmeters+" IN KILOMETERS --> "+convertedinkilometers);
                    System.out.println(convertmeters+" IN YARDS --> "+convertedinyards);
                    System.out.println(convertmeters+" IN INCHES --> "+convertedininches);
                    System.out.println(convertmeters+" IN FEET --> "+convertedinfeet);
                    System.out.println(convertmeters+" IN MILES --> "+convertedinmiles);

                }
                if(cdm==4){
                    System.out.println("CONVERT KILOMETERS");
                    System.out.println("ENTER VALUE --> ");
                    double convertkilometers = s.nextDouble();
                    double convertedinmillimeters = (convertkilometers*1000000);
                    double convertedincentimeters = (convertkilometers*100000);
                    double convertedinmeters = (convertkilometers*1000);
                    double convertedinyards = (convertkilometers*1093.61);
                    double convertedininches = (convertkilometers*39370.1);
                    double convertedinfeet = (convertkilometers*3280.84);
                    double convertedinmiles = (convertkilometers*0.621371);
                    System.out.println(convertkilometers+" IN MILLI-METERS --> "+convertedinmillimeters);
                    System.out.println(convertkilometers+" IN CENTIMETERS --> "+convertedincentimeters);
                    System.out.println(convertkilometers+" IN METERS --> "+convertedinmeters);
                    System.out.println(convertkilometers+" IN YARDS --> "+convertedinyards);
                    System.out.println(convertkilometers+" IN INCHES --> "+convertedininches);
                    System.out.println(convertkilometers+" IN FEET --> "+convertedinfeet);
                    System.out.println(convertkilometers+" IN MILES --> "+convertedinmiles);

                }
                if(cdm==5){
                    System.out.println("CONVERT YARDS");
                    System.out.println("ENTER VALUE --> ");
                    double convertyards = s.nextDouble();
                    double convertedinmillimeters = (convertyards*914.4);
                    double convertedincentimeters = (convertyards*91.44);
                    double convertedinmeters = (convertyards*0.9144);
                    double convertedinkilometers = (convertyards*0.0009144);
                    double convertedininches = (convertyards*36);
                    double convertedinfeet = (convertyards*3);
                    double convertedinmiles = (convertyards*0.000568182);
                    System.out.println(convertyards+" IN MILLI-METERS --> "+convertedinmillimeters);
                    System.out.println(convertyards+" IN CENTIMETERS --> "+convertedincentimeters);
                    System.out.println(convertyards+" IN METERS --> "+convertedinmeters);
                    System.out.println(convertyards+" IN KILOMETERS --> "+convertedinkilometers);
                    System.out.println(convertyards+" IN INCHES --> "+convertedininches);
                    System.out.println(convertyards+" IN FEET --> "+convertedinfeet);
                    System.out.println(convertyards+" IN MILES --> "+convertedinmiles);


                }
                if(cdm==6){
                    System.out.println("CONVERT INCHES");
                    System.out.println("ENTER VALUE --> ");
                    double convertinches = s.nextDouble();
                    double convertedinmillimeters = (convertinches*25.4);
                    double convertedincentimeters = (convertinches*2.54);
                    double convertedinmeters = (convertinches*0.0254);
                    double convertedinkilometers = (convertinches*2.54)/100000;
                    double convertedinyards = (convertinches*0.0277778);
                    double convertedinfeet = (convertinches*0.0833333);
                    double convertedinmiles = (convertinches*1.5783)/100000;
                    System.out.println(convertinches+" IN MILLI-METERS --> "+convertedinmillimeters);
                    System.out.println(convertinches+" IN CENTIMETERS --> "+convertedincentimeters);
                    System.out.println(convertinches+" IN METERS --> "+convertedinmeters);
                    System.out.println(convertinches+" IN KILOMETERS --> "+convertedinkilometers);
                    System.out.println(convertinches+" IN YARDS --> "+convertedinyards);
                    System.out.println(convertinches+" IN FEET --> "+convertedinfeet);
                    System.out.println(convertinches+" IN MILES --> "+convertedinmiles);

                }
                if(cdm==7){
                    System.out.println("CONVERT FEET");
                    System.out.println("ENTER VALUE --> ");
                    double convertfeet = s.nextDouble();
                    double convertedinmillimeters = (convertfeet*304.8);
                    double convertedincentimeters = (convertfeet*30.48);
                    double convertedinmeters = (convertfeet*0.3048);
                    double convertedinkilometers = (convertfeet*0.0003048);
                    double convertedinyards = (convertfeet*0.333333);
                    double convertedininches = (convertfeet*12);
                    double convertedinmiles = (convertfeet*0.000189394);
                    System.out.println(convertfeet+" IN MILLI-METERS --> "+convertedinmillimeters);
                    System.out.println(convertfeet+" IN CENTIMETERS --> "+convertedincentimeters);
                    System.out.println(convertfeet+" IN METERS --> "+convertedinmeters);
                    System.out.println(convertfeet+" IN KILOMETERS --> "+convertedinkilometers);
                    System.out.println(convertfeet+" IN YARDS --> "+convertedinyards);
                    System.out.println(convertfeet+" IN INCHES --> "+convertedininches);
                    System.out.println(convertfeet+" IN MILES --> "+convertedinmiles);
                }
                if(cdm==8){
                    System.out.println("CONVERT MILES");
                    System.out.println("ENTER VALUE --> ");
                    double convertmiles = s.nextDouble();
                    double convertedinmillimeters = (convertmiles*1.609*1000000);
                    double convertedincentimeters = (convertmiles*160934);
                    double convertedinmeters = (convertmiles*1609.34);
                    double convertedinkilometers = (convertmiles*1.60934);
                    double convertedinyards = (convertmiles*1760);
                    double convertedininches = (convertmiles*63360);
                    double convertedinfeet = (convertmiles*5280);
                    System.out.println(convertmiles+" IN MILLI-METERS --> "+convertedinmillimeters);
                    System.out.println(convertmiles+" IN CENTIMETERS --> "+convertedincentimeters);
                    System.out.println(convertmiles+" IN METERS --> "+convertedinmeters);
                    System.out.println(convertmiles+" IN KILOMETERS --> "+convertedinkilometers);
                    System.out.println(convertmiles+" IN YARDS --> "+convertedinyards);
                    System.out.println(convertmiles+" IN INCHES --> "+convertedininches);
                    System.out.println(convertmiles+" IN FEET --> "+convertedinfeet);
                }System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }

            if(task==6){
                System.out.println("NUMBER SELECTED BY YOU IS : 6");
                System.out.println("|----------------------------------------------------------------|");
                System.out.println("| SNO.     |  CONVERT WEIGHT MEASUREMENTS                        |");
                System.out.println("|----------------------------------------------------------------|");
                // CONVERT MILLI-GRAMS INTO GRAMS OR KILOGRAMS OR POUNDS
                System.out.println("| PRESS 1  | CONVERT MILLI-GRAMS                                 |");
                // CONVERT GRAMS INTO MILLI-GRAMS OR KILOGRAMS OR POUNDS
                System.out.println("| PRESS 2  | CONVERT GRAMS                                       |");
                // CONVERT KILOGRAMS INTO MILLI-GRAMS OR GRAMS OR POUNDS
                System.out.println("| PRESS 3  | CONVERT KILOGRAMS                                   |");
                // CONVERT POUNDS INTO MILLI-GRAMS OR GRAMS OR KILOGRAMS
                System.out.println("| PRESS 4  | CONVERT POUNDS                                      |");
                System.out.println("|----------------------------------------------------------------|");
                System.out.print("ENTER YOUR CHOICE --> ");
                int cwm = s.nextInt();
                if(cwm==1){
                    System.out.println("CONVERT MILLI-GRAMS");
                    System.out.println("ENTER VALUE --> ");
                    double convertmilligrams = s.nextDouble();
                    double convertedingrams = (convertmilligrams*0.001);
                    double convertedinkilograms = (convertmilligrams)/1000000;
                    double convertedinponds = (convertmilligrams*2.2046)/1000000;
                    System.out.println(convertmilligrams+" IN GRAMS --> "+convertedingrams);
                    System.out.println(convertmilligrams+" IN KILOGRAMS --> "+convertedinkilograms);
                    System.out.println(convertmilligrams+" IN POUNDS --> "+convertedinponds);
                }
                if(cwm==2){
                    System.out.println("CONVERT GRAMS");
                    System.out.println("ENTER VALUE --> ");
                    double convertgrams = s.nextDouble();
                    double convertedinmilligrams = (convertgrams*1000);
                    double convertedinkilograms = (convertgrams*0.001);
                    double convertedinponds = (convertgrams*0.00220462);
                    System.out.println(convertgrams+" IN MILLI-GRAMS --> "+convertedinmilligrams);
                    System.out.println(convertgrams+" IN KILOGRAMS --> "+convertedinkilograms);
                    System.out.println(convertgrams+" IN POUNDS --> "+convertedinponds);

                }
                if(cwm==3){
                    System.out.println("CONVERT KILOGRAMS");
                    System.out.println("ENTER VALUE --> ");
                    double convertkilograms = s.nextDouble();
                    double convertedinmilligrams = (convertkilograms*1000000);
                    double convertedingrams = (convertkilograms*1000);
                    double convertedinponds = (convertkilograms*2.20462);
                    System.out.println(convertkilograms+" IN MILLI-GRAMS --> "+convertedinmilligrams);
                    System.out.println(convertkilograms+" IN GRAMS --> "+convertedingrams);
                    System.out.println(convertkilograms+" IN POUNDS --> "+convertedinponds);

                }
                if(cwm==4){
                    System.out.println("CONVERT POUNDS");
                    System.out.println("ENTER VALUE --> ");
                    double convertpounds = s.nextDouble();
                    double convertedinmilligrams = (convertpounds*453592);
                    double convertedingrams = (convertpounds*453.592);
                    double convertedinkilograms = (convertpounds*0.453592);
                    System.out.println(convertpounds+" IN MILLI-GRAMS --> "+convertedinmilligrams);
                    System.out.println(convertpounds+" IN GRAMS --> "+convertedingrams);
                    System.out.println(convertpounds+" IN KILOGRAMS --> "+convertedinkilograms);

                }System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }

            if(task==7){
                System.out.println("SNO. SELECTED BY YOU IS : 7");
                System.out.println("TO CALCULATE PERCENTAGE FOR GIVEN SUBJECTS AND MARKS");
                System.out.println();
                System.out.println("---------- PERCENTAGE CALCULATOR ----------");
                System.out.println();
                System.out.print("ENTER THE NUMBER OF SUBJECTS YOU HAVE BETWEEN (5-8) --> ");
                float y = s.nextFloat();

                System.out.print("ENTER MARKS CONTAINED BY EACH SUBJECT --> ");
                float z = s.nextFloat();


                if (y == 5) {
                    System.out.print("ENTER FIRST SUBJECT MARKS --> ");
                    float a = s.nextFloat();
                    if (a < 0 || a > z) {
                        System.out.println("You Have entered Wrong Value");
                        System.exit(0);
                    }

                    System.out.print("ENTER SECOND SUBJECT MARKS --> ");
                    float b = s.nextFloat();

                    if (b < 0 || b > z) {
                        System.out.println("You Have entered Wrong Value");
                        System.exit(0);
                    }

                    System.out.print("ENTER THIRD SUBJECT MARKS --> ");
                    float c = s.nextFloat();

                    if (c < 0 || c > z) {
                        System.out.println("You Have entered Wrong Value");
                        System.exit(0);
                    }

                    System.out.print("ENTER FOURTH SUBJECT MARKS --> ");
                    float d = s.nextFloat();

                    if (d < 0 || d > z) {
                        System.out.println("You Have entered Wrong Value");
                        System.exit(0);
                    }

                    System.out.print("ENTER FIFTH SUBJECT MARKS --> ");
                    float e = s.nextFloat();

                    if (e < 0 || e > z) {
                        System.out.println("YOU HAVE ENTERED WRONG VALUE");
                        System.exit(0);
                    }
                    float percentage = ((a + b + c + d + e  ) * 100)/ (y*z);
                    System.out.println("YOUR TOTAL PERCENTAGE --> " + percentage + "%");

                }

                if (y == 6) {
                    System.out.print("ENTER FIRST SUBJECT MARKS --> ");
                    float a = s.nextFloat();


                    if (a < 0 || a > z) {
                        System.out.println("YOU HAVE ENTERED WRONG VALUE");
                        System.exit(0);
                    }

                    System.out.print("ENTER SECOND SUBJECT MARKS --> ");
                    float b = s.nextFloat();


                    if (b < 0 || b > z) {
                        System.out.println("YOU HAVE ENTERED WRONG VALUE");
                        System.exit(0);
                    }

                    System.out.print("ENTER THIRD SUBJECT MARKS --> ");
                    float c = s.nextFloat();


                    if (c < 0 || c > z) {
                        System.out.println("YOU HAVE ENTERED WRONG VALUE");
                        System.exit(0);
                    }

                    System.out.print("ENTER FOURTH SUBJECT MARKS --> ");
                    float d = s.nextFloat();

                    if (d < 0 || d > z) {
                        System.out.println("YOU HAVE ENTERED WRONG VALUE");
                        System.exit(0);
                    }

                    System.out.print("ENTER FIFTH SUBJECT MARKS --> ");
                    float e = s.nextFloat();

                    if (e < 0 || e > z) {
                        System.out.println("YOU HAVE ENTERED WRONG VALUE");
                        System.exit(0);
                    }

                    System.out.print("ENTER SIXTH SUBJECT MARKS --> ");
                    float f = s.nextFloat();

                    if (f < 0 || f > z) {
                        System.out.println("YOU HAVE ENTERED WRONG VALUE");
                        System.exit(0);
                    }
                    float percentage = ((a + b + c + d + e + f ) * 100)/ (y*z);
                    System.out.println("YOUR TOTAL PERCENTAGE --> " + percentage + "%");

                }

                if (y == 7) {
                    System.out.print("ENTER FIRST SUBJECT MARKS --> ");
                    float a = s.nextFloat();

                    if (a < 0 || a > z) {
                        System.out.println("YOU HAVE ENTERED WRONG VALUE");
                        System.exit(0);
                    }

                    System.out.print("ENTER SECOND SUBJECT MARKS --> ");
                    float b = s.nextFloat();

                    if (b < 0 || b > z) {
                        System.out.println("YOU HAVE ENTERED WRONG VALUE");
                        System.exit(0);
                    }

                    System.out.print("ENTER THIRD SUBJECT MARKS --> ");
                    float c = s.nextFloat();

                    if (c < 0 || c > z) {
                        System.out.println("YOU HAVE ENTERED WRONG VALUE");
                        System.exit(0);
                    }

                    System.out.print("ENTER FOURTH SUBJECT MARKS --> ");
                    float d = s.nextFloat();

                    if (d < 0 || d > z) {
                        System.out.println("YOU HAVE ENTERED WRONG VALUE");
                        System.exit(0);
                    }

                    System.out.print("ENTER FIFTH SUBJECT MARKS --> ");
                    float e = s.nextFloat();

                    if (e < 0 || e > z) {
                        System.out.println("YOU HAVE ENTERED WRONG VALUE");
                        System.exit(0);
                    }

                    System.out.print("ENTER SIXTH SUBJECT MARKS --> ");
                    float f = s.nextFloat();

                    if (f < 0 || f > z) {
                        System.out.println("YOU HAVE ENTERED WRONG VALUE");
                        System.exit(0);
                    }

                    System.out.print("ENTER SEVENTH SUBJECT MARKS --> ");
                    float g = s.nextFloat();

                    if (g < 0 || g > z) {
                        System.out.println("YOU HAVE ENTERED WRONG VALUE");
                        System.exit(0);
                    }

                    float percentage = ((a + b + c + d + e + f + g) * 100)/ (y*z);
                    System.out.println("YOUR TOTAL PERCENTAGE --> " + percentage + "%");

                }

                if (y == 8) {
                    System.out.print("ENTER FIRST SUBJECT MARKS --> ");
                    float a = s.nextFloat();

                    if (a < 0 || a > z) {
                        System.out.println("YOU HAVE ENTERED WRONG VALUE");
                        System.exit(0);
                    }

                    System.out.print("ENTER SECOND SUBJECT MARKS --> ");
                    float b = s.nextFloat();

                    if (b < 0 || b > z) {
                        System.out.println("YOU HAVE ENTERED WRONG VALUE");
                        System.exit(0);
                    }

                    System.out.print("ENTER THIRD SUBJECT MARKS --> ");
                    float c = s.nextFloat();

                    if (c < 0 || c > z) {
                        System.out.println("YOU HAVE ENTERED WRONG VALUE");
                        System.exit(0);
                    }

                    System.out.print("ENTER FOURTH SUBJECT MARKS --> ");
                    float d = s.nextFloat();

                    if (d < 0 || d > z) {
                        System.out.println("YOU HAVE ENTERED WRONG VALUE");
                        System.exit(0);
                    }

                    System.out.print("ENTER FIFTH SUBJECT MARKS --> ");
                    float e = s.nextFloat();

                    if (e < 0 || e > z) {
                        System.out.println("YOU HAVE ENTERED WRONG VALUE");
                        System.exit(0);
                    }

                    System.out.print("ENTER SIXTH SUBJECT MARKS --> ");
                    float f = s.nextFloat();

                    if (f < 0 || f > z) {
                        System.out.println("YOU HAVE ENTERED WRONG VALUE");
                        System.exit(0);
                    }

                    System.out.print("ENTER SEVENTH SUBJECT MARKS --> ");
                    float g = s.nextFloat();

                    if (g < 0 || g > z) {
                        System.out.println("YOU HAVE ENTERED WRONG VALUE");
                        System.exit(0);
                    }

                    System.out.print("ENTER EIGHTH SUBJECT MARKS --> ");
                    float h = s.nextFloat();

                    if (h < 0 || h > z) {
                        System.out.println("YOU HAVE ENTERED WRONG VALUE");
                        System.exit(0);
                    }

                    float percentage = ((a + b + c + d + e + f + g + h) * 100)/ (y*z);
                    System.out.println("YOUR TOTAL PERCENTAGE --> " + percentage + "%");

                }System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            }

            if(task==8){
                System.out.println("SNO. SELECTED BY YOU IS : 8");
                System.out.println("TO GENERATE RANDOM NUMBER BETWEEN THE GIVEN LIMITS");
                System.out.println();
                System.out.print("ENTER STARTING NUMBER (this number can also be random number) --> ");
                int start = s.nextInt();
                System.out.print("ENTER ENDING NUMBER (this number will not come as random number)--> ");
                int end = s.nextInt();
                int a = start + r.nextInt(end - start);
                System.out.println("YOUR RANDOM NUMBER BETWEEN ("+start+" to "+end+") IS --> "+a);
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }

            if(task==9){
                System.out.println("SNO. SELECTED BY YOU IS : 9");
                System.out.println("TO CALCULATE SIMPLE INTEREST");
                System.out.print("ENTER PRINCIPLE AMOUNT --> ");
                double amount = s.nextDouble();
                System.out.print("ENTER INTEREST RATE(in %) --> ");
                double rate = s.nextDouble();
                System.out.print("ENTER TIME(in Years) --> ");
                double time = s.nextDouble();
                System.out.println();
                System.out.println("PRINCIPLE AMOUNT --> ₹"+amount);
                System.out.println("INTEREST RATE --> "+rate+"%");
                System.out.println("TIME(in years) --> "+time);
                System.out.println();
                double simpleinterest = (amount*rate*time)/100;
                System.out.println("TOTAL INTEREST AFTER "+time+" YEARS--> "+simpleinterest);
                double totalamount = (amount+simpleinterest);
                System.out.println("TOTAL AMOUNT AFTER "+time+" years --> "+totalamount);
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }

            if(task==10){
                System.out.println("SNO. SELECTED BY YOU IS : 10");
                System.out.println("TO CALCULATE COMPOUND INTEREST");
                System.out.print("ENTER PRINCIPLE AMOUNT --> ");
                double amount = s.nextDouble();
                System.out.print("ENTER INTEREST RATE(in %) --> ");
                double rate = s.nextDouble();
                System.out.print("ENTER TIME(in Years) --> ");
                double time = s.nextDouble();
                System.out.println();
                System.out.println("PRINCIPLE AMOUNT --> ₹"+amount);
                System.out.println("INTEREST RATE --> "+rate+"%");
                System.out.println("TIME(in years) --> "+time);
                System.out.println();
                double compundinterest = amount*(Math.pow((1+rate/100),time));
                double onlyinterest = (compundinterest-amount);
                System.out.println("TOTAL INTEREST AFTER "+time+" YEARS  --> "+onlyinterest);
                System.out.println("TOTAL AMOUNT AFTER "+time+" years --> "+compundinterest);
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            }

            if(task==11){
                System.out.println("SNO. SELECTED BY YOU IS : 11");
                System.out.println("STONE PAPER SCISSORS GAME");
                System.out.println();
                System.out.println("|-----------------------------------|");
                System.out.println("|     STONE PAPER SCISSORS GAME     |");
                System.out.println("|-----------------------------------|");
                System.out.println("| PRESS 1  | TO CHOOSE \"STONE\"      |");
                System.out.println("| PRESS 2  | TO CHOOSE \"PAPER\"      |");
                System.out.println("| PRESS 3  | TO CHOOSE \"SCISSORS\"   |");
                System.out.println("|-----------------------------------|");

                int loop=0;
                int me = 0 ;
                int pc = 0 ;
                int draw = 0;
                String answer ;
                do{
                    System.out.print("ENTER YOUR CHOICE --> ");
                    int choice = s.nextInt();
                    if(choice>3){
                        System.out.println("INVALID VALUE");
                        System.exit(0);
                    }
                    int random = 1+r.nextInt(4-1);

                    if (random==1) {
                        System.out.println("COMPUTER CHOICE --> STONE");
                    }

                    if (random==2){
                        System.out.println("COMPUTER CHOICE --> PAPER");
                    }

                    if (random==3){
                        System.out.println("COMPUTER CHOICE --> SCISSORS");
                    }

                    if(choice==1){
                        System.out.println("YOUR CHOICE --> STONE");

                    }
                    if(choice==2){
                        System.out.println("YOUR CHOICE --> PAPER");

                    }
                    if(choice==3){
                        System.out.println("YOUR CHOICE --> SCISSORS");
                    }

                    String s1 = "DRAW";
                    String s2 = "YOU LOST";
                    String s3 = "YOU WIN";

                    if(choice==random){
                        System.out.println(s1);
                        System.out.println();
                        draw++;
                    }
                    if (choice==1 && random==2){
                        System.out.println(s2);
                        System.out.println();
                        pc++;
                    }
                    if (choice==1 && random==3){
                        System.out.println(s3);
                        System.out.println();
                        me++;
                    }
                    if (choice==2 && random==1){
                        System.out.println(s3);
                        System.out.println();
                        me++;
                    }
                    if (choice==2 && random==3){
                        System.out.println(s2);
                        System.out.println();
                        pc++;
                    }
                    if (choice==3 && random==1){
                        System.out.println(s2);
                        System.out.println();
                        pc++;
                    }
                    if (choice==3 && random==2){
                        System.out.println(s3);
                        System.out.println();
                        me++;
                    }
                    loop++;
                    System.out.println("|-------------------------------------|");
                    System.out.println("| IF YOU WANT TO PLAY MORE TYPE : YES |" +
                            "\n| AND IF NOT THEN TYPE : NO           |");
                    System.out.println("|-------------------------------------|");
                    System.out.print("YOUR CHOICE --> ");
                    answer = s.next();
                    System.out.println();
                }while(answer.equals("y") || answer.equals("Y") || answer.equals("YES") || answer.equals("yes"));
                if(answer.equals("n") || answer.equals("N") || answer.equals("NO") || answer.equals("no")) {
                    System.out.printf("|--------------------------------------|%n");
                    System.out.printf("|%29s %-8d|%n","YOUR SCORE --> ",me);
                    System.out.printf("|%29s %-8d|%n","DRAW --> ",draw);
                    System.out.printf("|%29s %-8d|%n","COMPUTER SCORE --> ",pc);
                    System.out.printf("|%29s %-8d|%n","TOTAL CHANCES PLAYED --> ",(me+pc+draw));
                    System.out.printf("|--------------------------------------|%n");
                    if (me > pc) {
                        System.out.println("CONGRATULATIONS! YOU WON THE GAME");
                    }
                    if (me == pc) {
                        System.out.println("GAME DRAW");
                    }
                    if (me < pc) {
                        System.out.println("SORRY! YOU LOST THE GAME");
                    }
                }System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }

            if(task==12){
                System.out.println("NUMBER SELECTED BY YOU IS : 12");
                System.out.println("CONVERSION OF DECIMAL VALUE IN BINARY VALUE");
                System.out.print("ENTER DECIMAL VALUE --> ");
                Long a = s.nextLong();
                String b = "";
                while (a>0){
                    Long q = a%2;
                    a =  a/2;
                    b = q + b;
                }
                System.out.println("Binary Number --> "+b);
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }

            if(task==13){
                System.out.println("NUMBER SELECTED BY YOU IS : 13");
                System.out.println("CONVERSION OF BINARY VALUE IN DECIMAL VALUE");
                System.out.print("ENTER BINARY NUMBER --> ");
                long a = s.nextLong();
                long b = a;
                int c = 0;
                long d = 0;
                while (b>0){
                    long q = b % 10 ;
                    b = b / 10 ;
                    d = d + q * (int)Math.pow(2,c++);
                }
                System.out.println("DECIMAL VALUE --> "+d);
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }

            if(task==14){
                System.out.println("NUMBER SELECTED BY YOU IS : 14");
                System.out.println("HAND CRICKET GAME WITH COMPUTER");
                System.out.println("|---------TOSS----------|");
                System.out.println("| PRESS 1  | FOR HEADS  |");
                System.out.println("| PRESS 2  | FOR TAILS  |");
                System.out.println("|-----------------------|");
                System.out.print("ENTER YOUR CHOICE --> ");
                int choice = s.nextInt();
                if(choice == 1 || choice==2){
                    if (choice == 1) {
                        System.out.println("|-----------------------|");
                        System.out.println("| YOUR CHOICE --> HEADS |");
                    }
                    if (choice == 2) {
                        System.out.println("|-----------------------|");
                        System.out.println("| YOUR CHOICE --> TAILS |");
                    }
                } else {
                    System.out.println("YOU ENTERED WRONG VALUE");
                }
                int pc = 1 + r.nextInt(3 - 1);
                if(pc==1 || pc==2){
                    if (pc == 1) {
                        System.out.println("|     TOSS --> HEADS    |");
                        System.out.println("|-----------------------|");
                    }
                    if (pc == 2) {
                        System.out.println("|     TOSS --> TAILS    |");
                        System.out.println("|-----------------------|");
                    }
                } else{
                    System.out.println("YOU ENTERED WRONG VALUE");
                }




                if (choice == pc) {
                    System.out.println();
                    System.out.println("|-------------------|");
                    System.out.println("| YOU WON THE TOSS  |");
                    System.out.println("|-------------------|");
                    System.out.println();
                    System.out.println("|-------RULES-------|");
                    System.out.println("| PRESS 1 | 1 RUN   |");
                    System.out.println("| PRESS 2 | 2 RUNS  |");
                    System.out.println("| PRESS 3 | 3 RUNS  |");
                    System.out.println("| PRESS 4 | 4 RUNS  |");
                    System.out.println("| PRESS 5 | 5 RUNS  |");
                    System.out.println("| PRESS 6 | 6 RUNS  |");
                    System.out.println("|-------------------|");
                    System.out.println();

                    int V = 0;
                    int W = 0;
                    int X = 0;
                    int Y = 0;
                    System.out.println("------------FIRST INNINGS START------------");
                    System.out.println("              ITS YOUR BATTING             ");
                    System.out.println("              TOTAL OVERS = 1 ");
                    for(int z=0; z<1; z++){
                        System.out.print("1st BALL --> ");
                        int b1 = s.nextInt();
                        int b1r = 1 + r.nextInt(7 - 1);
                        if (b1 == b1r) {
                            System.out.println("COMPUTER CHOICE --> " + b1r);
                            System.out.println("----OUT----");
                            System.out.println("TOTAL RUNS --> 0");
                            int target = 1 ;
                            System.out.println("TARGET --> "+target);
                            V = target ;
                            break;

                        }
                        else {
                            System.out.println("COMPUTER CHOICE --> " + b1r);
                        }
                        System.out.print("2nd BALL --> ");
                        int b2 = s.nextInt();
                        int b2r = 1 + r.nextInt(7 - 1);
                        if (b2 == b2r) {
                            System.out.println("COMPUTER CHOICE --> " + b2r);
                            System.out.println("----OUT----");
                            System.out.println("TOTAL RUNS --> " + b1);
                            int target = ((1 + b1));
                            System.out.println("TARGET --> " + target);
                            V = target ;
                            break;

                        }
                        else {
                            System.out.println("COMPUTER CHOICE --> " + b2r);
                        }
                        System.out.print("3rd BALL --> ");
                        int b3 = s.nextInt();
                        int b3r = 1 + r.nextInt(7 - 1);
                        if (b3 == b3r) {
                            System.out.println("COMPUTER CHOICE --> " + b3r);
                            System.out.println("----OUT----");
                            System.out.println("TOTAL RUNS --> " + (b1 + b2));
                            int target = ((1 + b1 + b2));
                            System.out.println("TARGET --> " + target);
                            V = target ;
                            break;

                        }
                        else {
                            System.out.println("COMPUTER CHOICE --> " + b3r);
                        }

                        System.out.print("4th BALL --> ");
                        int b4 = s.nextInt();
                        int b4r = 1 + r.nextInt(7 - 1);
                        if (b4 == b4r) {
                            System.out.println("COMPUTER CHOICE --> " + b4r);
                            System.out.println("----OUT----");
                            System.out.println("TOTAL RUNS --> " + (b1 + b2 + b3));
                            int target = ((1 + b1 + b2 + b3));
                            System.out.println("TARGET --> " +target);
                            V = target ;
                            break;

                        }
                        else {
                            System.out.println("COMPUTER CHOICE --> " + b4r);
                        }

                        System.out.print("5th BALL --> ");
                        int b5 = s.nextInt();
                        int b5r = 1 + r.nextInt(7 - 1);
                        if (b5 == b5r) {
                            System.out.println("COMPUTER CHOICE --> " + b5r);
                            System.out.println("----OUT----");
                            System.out.println("TOTAL RUNS --> " + (b1 + b2 + b3 + b4));
                            int target = ((1 + b1 + b2 + b3 + b4));
                            System.out.println("TARGET --> " + target);
                            V = target ;
                            break;

                        }
                        else {
                            System.out.println("COMPUTER CHOICE --> " + b5r);

                        }
                        System.out.print("6th BALL --> ");
                        int b6 = s.nextInt();
                        int b6r = 1 + r.nextInt(7 - 1);
                        if (b6 == b6r) {
                            System.out.println("COMPUTER CHOICE --> " + b6r);
                            System.out.println("----OUT----");
                            System.out.println("TOTAL RUNS --> " + (b1 + b2 + b3 + b4 + b5));
                            int target = ((1 + b1 + b2 + b3 + b4 + b5));
                            System.out.println("TARGET --> " + target);
                            V = target ;
                            break;

                        }
                        else {
                            System.out.println("COMPUTER CHOICE --> " + b6r);
                            int target = ((1 + b1 + b2 + b3 + b4 + b5+ b6));
                            System.out.println("TARGET --> " + target);
                            V = target ;
                        }
                    }

                    System.out.println("------------FIRST INNINGS OVER------------");

                    System.out.println();

                    System.out.println("------------SECOND INNINGS START------------");
                    System.out.println("          NOW COMPUTER IS BATTING           ");
                    for(int y=0; y<1; y++){
                        System.out.print("1st BALL --> ");
                        int c1 = s.nextInt();
                        int c1r = 1 + r.nextInt(7 - 1);
                        if (c1 == c1r) {
                            System.out.println("COMPUTER CHOICE --> " + c1r);
                            System.out.println("----OUT----");
                            System.out.println("TOTAL RUNS --> 0");
                            W = X ;
                            if (W==(V-1)){
                                System.out.println("GAME DRAW");
                                break;
                            }
                            else if(W<V){
                                System.out.println("YOU WON");
                                break;
                            }
                            break;
                        }
                        else {
                            System.out.println("COMPUTER CHOICE --> " + c1r);
                            W = c1r ;
                            if (W>=V){
                                System.out.println("COMPUTER WON");
                                break;
                            }
                        }

                        System.out.print("2nd BALL --> ");
                        int c2 = s.nextInt();
                        int c2r = 1 + r.nextInt(7 - 1);
                        System.out.println("COMPUTER CHOICE --> " + c2r);
                        if (c2 == c2r) {
                            System.out.println("----OUT----");
                            System.out.println("TOTAL RUNS --> " + c1r);
                            W = c1r ;
                            if (W==(V-1)){
                                System.out.println("GAME DRAW");
                                break;
                            }
                            else if(W<(V-1)){
                                System.out.println("YOU WON");
                                break;
                            }
                            break;
                        }
                        else {
                            W = (c1r+c2r);
                            if (W>=V){
                                System.out.println("COMPUTER WON");
                                break;
                            }

                        }

                        System.out.print("3rd BALL --> ");
                        int c3 = s.nextInt();
                        int c3r = 1 + r.nextInt(7 - 1);
                        if (c3 == c3r) {
                            System.out.println("COMPUTER CHOICE --> " + c3r);
                            System.out.println("----OUT----");
                            System.out.println("TOTAL RUNS --> " + (c1r + c2r));
                            W = (c1r+c2r);
                            if (W==(V-1)){
                                System.out.println("GAME DRAW");
                                break;
                            }
                            else if(W<V){
                                System.out.println("YOU WON");
                                break;
                            }
                            break;
                        }
                        else {
                            System.out.println("COMPUTER CHOICE --> " + c3r);
                            W = (c1r+c2r+c3r);
                            if (W>=V){
                                System.out.println("COMPUTER WON");
                                break;
                            }
                        }

                        System.out.print("4th BALL --> ");
                        int c4 = s.nextInt();
                        int c4r = 1 + r.nextInt(7 - 1);
                        if (c4 == c4r) {
                            System.out.println("COMPUTER CHOICE --> " + c4r);
                            System.out.println("----OUT----");
                            System.out.println("TOTAL RUNS --> " + (c1r + c2r + c3r));
                            W = (c1r+c2r+c3r);
                            if (W==(V-1)){
                                System.out.println("GAME DRAW");
                                break;
                            }
                            else if(W<V){
                                System.out.println("YOU WON");
                                break;
                            }
                            break;
                        }
                        else {
                            System.out.println("COMPUTER CHOICE --> " + c4r);
                            W = (c1r+c2r+c3r+c4r);
                            if (W>=V){
                                System.out.println("COMPUTER WON");
                                break;
                            }
                        }

                        System.out.print("5th BALL --> ");
                        int c5 = s.nextInt();
                        int c5r = 1 + r.nextInt(7 - 1);
                        if (c5 == c5r) {
                            System.out.println("COMPUTER CHOICE --> " + c5r);
                            System.out.println("----OUT----");
                            System.out.println("TOTAL RUNS --> " + (c1r + c2r + c3r + c4r));
                            W = (c1r+c2r+c3r+c4r);
                            if (W==(V-1)){
                                System.out.println("GAME DRAW");
                                break;
                            }
                            else if(W<V){
                                System.out.println("YOU WON");
                                break;
                            }
                            break;
                        }
                        else {
                            System.out.println("COMPUTER CHOICE --> " + c5r);
                            W = (c1r+c2r+c3r+c4r+c5r);
                            if (W>=V){
                                System.out.println("COMPUTER WON");
                                break;
                            }

                        }

                        System.out.print("6th BALL --> ");
                        int c6 = s.nextInt();
                        int c6r = 1 + r.nextInt(7 - 1);
                        if (c6 == c6r) {
                            System.out.println("COMPUTER CHOICE --> " + c6r);
                            System.out.println("----OUT----");
                            System.out.println("TOTAL RUNS --> " + (c1r + c2r + c3r + c4r + c5r));
                            W = (c1r+c2r+c3r+c4r+c5r);
                            if (W==(V-1)){
                                System.out.println("GAME DRAW");
                                break;
                            }
                            else if(W<V){
                                System.out.println("YOU WON");
                                break;
                            }
                            break;
                        }
                        else {
                            System.out.println("COMPUTER CHOICE --> " + c6r);
                            W = (c1r+c2r+c3r+c4r+c5r+c6r);
                            if (W>=V){
                                System.out.println("COMPUTER WON");
                                break;
                            }
                            else if (W==(V-1)){
                                System.out.println("GAME DRAW");
                                break;
                            }
                            else if(W<V){
                                System.out.println("YOU WON");
                                break;
                            }
                        }
                    }

                    System.out.println("------------SECOND INNINGS OVER------------");
                }

                else {
                    System.out.println();
                    System.out.println("|-----------------------|");
                    System.out.println("|   YOU LOST THE TOSS   |");
                    System.out.println("|-----------------------|");
                    System.out.println();
                    System.out.println("|-------RULES-------|");
                    System.out.println("| PRESS 1 | 1 RUN   |");
                    System.out.println("| PRESS 2 | 2 RUNS  |");
                    System.out.println("| PRESS 3 | 3 RUNS  |");
                    System.out.println("| PRESS 4 | 4 RUNS  |");
                    System.out.println("| PRESS 5 | 5 RUNS  |");
                    System.out.println("| PRESS 6 | 6 RUNS  |");
                    System.out.println("|-------------------|");
                    System.out.println();

                    int V = 0;
                    int W = 0;
                    int X = 0;
                    int Y = 0;
                    System.out.println("------------------FIRST INNINGS START------------------");
                    System.out.println("                NOW COMPUTER IS BATTING                ");
                    System.out.println("                   TOTAL OVERS = 1                     ");
                    for(int y=0; y<1; y++){
                        System.out.print("1st BALL --> ");
                        int c1 = s.nextInt();
                        int c1r = 1 + r.nextInt(7 - 1);
                        if (c1 == c1r) {
                            System.out.println("COMPUTER CHOICE --> " + c1r);
                            System.out.println("----OUT----");
                            System.out.println("TOTAL RUNS --> 0");
                            int target = 1;
                            System.out.println("TARGET --> " + target);
                            V = target ;
                            break;
                        }
                        else {
                            System.out.println("COMPUTER CHOICE --> " + c1r);
                        }

                        System.out.print("2nd BALL --> ");
                        int c2 = s.nextInt();
                        int c2r = 1 + r.nextInt(7 - 1);
                        if (c2 == c2r) {
                            System.out.println("COMPUTER CHOICE --> " + c2r);
                            System.out.println("----OUT----");
                            System.out.println("TOTAL RUNS --> " + c1r);
                            int target = 1 + c1r;
                            System.out.println("TARGET --> " + target);
                            V = target;
                            break;
                        }
                        else {
                            System.out.println("COMPUTER CHOICE --> " + c2r);
                        }

                        System.out.print("3rd BALL --> ");
                        int c3 = s.nextInt();
                        int c3r = 1 + r.nextInt(7 - 1);
                        if (c3 == c3r) {
                            System.out.println("COMPUTER CHOICE --> " + c3r);
                            System.out.println("----OUT----");
                            System.out.println("TOTAL RUNS --> " + (c1r + c2r));
                            int target = 1 + (c1r+c2r);
                            System.out.println("TARGET --> " + target);
                            V = target ;
                            break;
                        }
                        else {
                            System.out.println("COMPUTER CHOICE --> " + c3r);
                        }

                        System.out.print("4th BALL --> ");
                        int c4 = s.nextInt();
                        int c4r = 1 + r.nextInt(7 - 1);
                        if (c4 == c4r) {
                            System.out.println("COMPUTER CHOICE --> " + c4r);
                            System.out.println("----OUT----");
                            System.out.println("TOTAL RUNS --> " + (c1r + c2r + c3r));
                            int target = 1 + (c1r+c2r+c3r);
                            System.out.println("TARGET --> " + target);
                            V = target;
                            break;
                        }
                        else {
                            System.out.println("COMPUTER CHOICE --> " + c4r);
                        }

                        System.out.print("5th BALL --> ");
                        int c5 = s.nextInt();
                        int c5r = 1 + r.nextInt(7 - 1);
                        if (c5 == c5r) {
                            System.out.println("COMPUTER CHOICE --> " + c5r);
                            System.out.println("----OUT----");
                            System.out.println("TOTAL RUNS --> " + (c1r + c2r + c3r + c4r));
                            int target = 1 + (c1r + c2r + c3r + c4r);
                            System.out.println("TARGET --> " + target);
                            V = target;
                            break;
                        }
                        else {
                            System.out.println("COMPUTER CHOICE --> " + c5r);
                        }

                        System.out.print("6th BALL --> ");
                        int c6 = s.nextInt();
                        int c6r = 1 + r.nextInt(7 - 1);
                        if (c6 == c6r) {
                            System.out.println("COMPUTER CHOICE --> " + c6r);
                            System.out.println("----OUT----");
                            System.out.println("TOTAL RUNS --> " + (c1r + c2r + c3r + c4r + c5r));
                            int target = 1 + (c1r + c2r + c3r + c4r + c5r);
                            System.out.println("TARGET --> " + target);
                            V = target ;
                            break;
                        }
                        else {
                            System.out.println("COMPUTER CHOICE --> " + c6r);
                            int target = 1 + (c1r + c2r + c3r + c4r + c5r + c6r);
                            System.out.println("TARGET --> " + target);
                            V = target ;
                        }
                    }

                    System.out.println("------------------FIRST INNINGS OVER------------------");


                    System.out.println();

                    System.out.println("------------------SECOND INNINGS START------------------");
                    System.out.println("                    ITS YOUR BATTING                    ");
                    for(int z=0; z<1; z++){
                        System.out.print("1st BALL --> ");
                        int b1 = s.nextInt();
                        int b1r = 1 + r.nextInt(7 - 1);
                        if (b1 == b1r) {
                            System.out.println("COMPUTER CHOICE --> " + b1r);
                            System.out.println("----OUT----");
                            System.out.println("TOTAL RUNS --> 0");
                            W = Y ;
                            if (W==(V-1)){
                                System.out.println("GAME DRAW");
                                break;
                            }
                            else if(W<V){
                                System.out.println("COMPUTER WON");
                                break;
                            }
                            break;

                        }
                        else {
                            System.out.println("COMPUTER CHOICE --> " + b1r);
                            W = b1;
                            if (W>=V){
                                System.out.println("YOU WON");
                                break;
                            }
                        }
                        System.out.print("2nd BALL --> ");
                        int b2 = s.nextInt();
                        int b2r = 1 + r.nextInt(7 - 1);
                        if (b2 == b2r) {
                            System.out.println("COMPUTER CHOICE --> " + b2r);
                            System.out.println("----OUT----");
                            System.out.println("TOTAL RUNS --> " + b1);
                            W = b1 ;
                            if (W==(V-1)){
                                System.out.println("GAME DRAW");
                                break;
                            }
                            else if(W<(V-1)){
                                System.out.println("COMPUTER WON");
                                break;
                            }

                            break;

                        }
                        else {
                            System.out.println("COMPUTER CHOICE --> " + b2r);
                            W = (b1+b2);
                            if (W>=V){
                                System.out.println("YOU WON");
                                break;
                            }
                        }
                        System.out.print("3rd BALL --> ");
                        int b3 = s.nextInt();
                        int b3r = 1 + r.nextInt(7 - 1);
                        if (b3 == b3r) {
                            System.out.println("COMPUTER CHOICE --> " + b3r);
                            System.out.println("----OUT----");
                            System.out.println("TOTAL RUNS --> " + (b1 + b2));
                            W = (b1+b2);
                            if(W<(V-1)){
                                System.out.println("COMPUTER WON");
                                break;
                            }
                            break;

                        }
                        else {
                            System.out.println("COMPUTER CHOICE --> " + b3r);
                            W = (b1+b2+b3);
                            if (W>=V){
                                System.out.println("YOU WON");
                                break;
                            }
                        }

                        System.out.print("4th BALL --> ");
                        int b4 = s.nextInt();
                        int b4r = 1 + r.nextInt(7 - 1);
                        if (b4 == b4r) {
                            System.out.println("COMPUTER CHOICE --> " + b4r);
                            System.out.println("----OUT----");
                            System.out.println("TOTAL RUNS --> " + (b1 + b2 + b3));
                            W = (b1+b2+b3);
                            if (W==(V-1)){
                                System.out.println("GAME DRAW");
                                break;
                            }
                            else if(W<(V-1)){
                                System.out.println("COMPUTER WON");
                                break;
                            }

                            break;

                        }
                        else {
                            System.out.println("COMPUTER CHOICE --> " + b4r);
                            W = (b1+b2+b3+b4);
                            if (W>=V){
                                System.out.println("YOU WON");
                                break;
                            }
                        }

                        System.out.print("5th BALL --> ");
                        int b5 = s.nextInt();
                        int b5r = 1 + r.nextInt(7 - 1);
                        if (b5 == b5r) {
                            System.out.println("COMPUTER CHOICE --> " + b5r);
                            System.out.println("----OUT----");
                            System.out.println("TOTAL RUNS --> " + (b1 + b2 + b3 + b4));
                            W = (b1+b2+b3+b4);
                            if (W==(V-1)){
                                System.out.println("GAME DRAW");
                                break;
                            }
                            else if(W<(V-1)){
                                System.out.println("COMPUTER WON");
                                break;
                            }

                            break;

                        }
                        else {
                            System.out.println("COMPUTER CHOICE --> " + b5r);
                            W = (b1+b2+b3+b4+b5);
                            if (W>=V){
                                System.out.println("YOU WON");
                                break;
                            }
                        }
                        System.out.print("6th BALL --> ");
                        int b6 = s.nextInt();
                        int b6r = 1 + r.nextInt(7 - 1);
                        if (b6 == b6r) {
                            System.out.println("COMPUTER CHOICE --> " + b6r);
                            System.out.println("----OUT----");
                            System.out.println("TOTAL RUNS --> " + (b1 + b2 + b3 + b4 + b5));
                            W = (b1+b2+b3+b4+b5);
                            if (W==(V-1)){
                                System.out.println("GAME DRAW");
                                break;
                            }
                            else if(W<(V-1)){
                                System.out.println("COMPUTER WON");
                                break;
                            }

                            break;

                        }
                        else {
                            System.out.println("COMPUTER CHOICE --> " + b6r);
                            W = (b1+b2+b3+b4+b5+b6);
                            if (W>=V){
                                System.out.println("YOU WON");
                                break;
                            }
                            else if (W==(V-1)){
                                System.out.println("GAME DRAW");
                                break;
                            }
                            else if(W<(V-1)){
                                System.out.println("COMPUTER WON");
                                break;
                            }
                        }
                    }

                    System.out.println("------------------SECOND INNINGS OVER------------------");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                }


            }

            if(task==15){
                System.out.println("NUMBER SELECTED BY YOU IS : 15");
                System.out.println("CALCULATE FACTORIAL WITH THE GIVEN NUMBER");
                System.out.print("ENTER NUMBER (1 - 20)--> ");
                int a = s.nextInt();
                long b = 1;
                for (int c = 1; c<=a; c++){
                    b = c * b;
                }
                System.out.println("FACTORIAL OF \""+a+ "\" is --> "+b);
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }

            if(task==16){
                System.out.println("NUMBER SELECTED BY YOU IS : 16");
                System.out.println("CALCULATE AVERAGE OF GIVEN NUMBERS");
                String yesorno;
                int count = 0;
                float sum = 0;
                
                do{
                    System.out.print("ENTER NUMBER --> ");
                    float a = s.nextInt();
                    
                    sum = sum + a;
                    count++;
                    System.out.print("TO ADD ANOTHER NUMBER TYPE : YES"+
                            "\nTO CALCULATE AVERAGE WITH GIVEN NUMBERS TYPE : NO"+
                            "\nENTER YOUR CHOICE --> ");
                    yesorno = s.next();
                }
                while(yesorno.equals("y") || yesorno.equals("Y") || yesorno.equals("YES") || yesorno.equals("yes"));
                if(yesorno.equals("n") || yesorno.equals("N") || yesorno.equals("NO") || yesorno.equals("no")){
                    System.out.println();
                    System.out.println("ADDITON OF GIVEN NUMBER IS --> "+sum);
                    System.out.println("TOTAL NUMBER YOU HAVE INSERTED --> "+count);
                    float average = (sum/count);
                    System.out.println();
                    System.out.println("AVERAGE OF GIVEN NUMBER IS --> "+average);
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                }
            }

            if(task==17){
                System.out.println("NUMBER SELECTED BY YOU IS : 17");
                System.out.println(" CALCULATE PERMUTATION AND COMBINATION ");
                System.out.println("PRESS 1 TO USE \"nPr\" FORMULA");
                System.out.println("PRESS 2 TO USE \"nCr\" FORMULA ");
                System.out.print("Enter your Choice --> ");
                int a = s.nextInt();
                long b = 1 ;
                int c ;
                long d = 1;
                int e ;
                long f = 1;
                int g ;
                int n ;
                int o ;
                float divide ;
                if (a!=0){
                    if (a==1){
                        System.out.println("|-----------------------------|");
                        System.out.println("| FORMULA USED IN PERMUTATION |");
                        System.out.println("|-----------------------------|");
                        System.out.println("|   n            n!           |");
                        System.out.println("|    P  =   ------------      |");
                        System.out.println("|     r       (n - r)!        |");
                        System.out.println("|-----------------------------|");
                        System.out.println();
                        System.out.print("ENTER THE VALUE OF \"n\" -->  ");
                        n = s.nextInt();
                        System.out.print("ENTER THE VALUE OF \"r\" -->  ");
                        o = s.nextInt();
                        int sub = (n-o);
                        if (sub==0){
                            for(c = 1; c<=n; c++){
                                b = c * b;
                            }
                            divide = b;
                        }
                        else{
                            for(c = 1; c<=n; c++){
                                b = c * b;
                            }
                            System.out.println("Value of n! is --> "+b);
                            for(e = 1; e<=sub; e++){
                                d = e * d;
                            }
                            System.out.println("Value of (n-r)! is --> "+d);
                            divide = (b/d);
                        }
                        System.out.println("ANSWER --> "+divide);
                    }
                    else if(a==2){
                        System.out.println("|-------------------------------|");
                        System.out.println("|  FORMULA USED IN COMBINATION  |");
                        System.out.println("|-------------------------------|");
                        System.out.println("|   n            n!             |");
                        System.out.println("|    C  =   ------------        |");
                        System.out.println("|     r      r! (n - r)!        |");
                        System.out.println("|-------------------------------|");
                        System.out.print("ENTER THE VALUE OF \"n\" -->  ");
                        n = s.nextInt();
                        System.out.print("ENTER THE VALUE OF \"r\" -->  ");
                        o = s.nextInt();
                        int sub = (n-o);
                        if (sub==0){
                            for(c = 1; c<=n; c++){
                                b = c * b;
                            }
                            System.out.println("Value of n! is --> "+b);
                            for(g = 1; g<=o; g++){
                                f = g * f;
                            }
                            System.out.println("Value of r! is --> "+f);
                            divide = (b/f);
                        }
                        else{
                            for(c = 1; c<=n; c++){
                                b = c * b;
                            }
                            System.out.println("Value of n! is --> "+b);
                            for(g = 1; g<=o; g++){
                                f = g * f;
                            }
                            System.out.println("Value of r! is --> "+f);
                            for(e = 1; e<=sub; e++){
                                d = e * d;
                            }
                            System.out.println("Value of (n-r)! is --> "+d);
                            divide = (b/(f*d));
                        }
                        System.out.println("ANSWER --> "+divide);
                    }
                    else{
                        System.out.println(" Invalid Value !");
                    }
                }
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }

            if(task==18){
                System.out.println("NUMBER SELECTED BY YOU IS : 18");
                System.out.print("ENTER NUMBER TO PRINT TABLE --> ");
                int a = s.nextInt();
                for(int n=1; n<=10; n++){
                    long c = (a*n);
                    System.out.println(a+" * "+n+" = "+c);
                }
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }

            else{
                System.out.println(" Invalid Value ! ");
            }

            System.out.println("PRESS 1 --> TO GET THE LIST OF CODE AGAIN");
            System.out.println("PRESS 2 --> TO STOP");
            System.out.print("ENTER YOUR CHOICE --> ");
            yourchoice = s.nextInt();
            System.out.println();
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
        while(Objects.equals(yourchoice,1));
        if(Objects.equals(yourchoice,2)){
            System.out.println("   😊THANKS FOR USING THIS PROGRAM😊    ");
        }
    }
}