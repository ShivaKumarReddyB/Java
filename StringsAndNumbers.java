import java.util.Random;

public class StringsAndNumbers {
    public static void main(String[] args){
       // String
        String welcome = "Welcome to Northwest Missouri State University Spring 2023";
        System.out.println("***** String Class *****");
        //point 1
        System.out.println(welcome);
        System.out.println("The size of welcome is:"+ welcome.length());
        System.out.println(welcome.replace("Northwest Missouri State University", "\"Northwest Missouri State University\""));

        // point 2
        CharSequence universityName = welcome.subSequence(11, 46);
        System.out.println(universityName); // printing repeated
        boolean isUniversity = universityName.toString().endsWith("university");
        System.out.println("Word ends with university or not?: " + isUniversity);

        // point 3
        String intro = " My repeated is Shiva Kumar Reddy_Bakkannagari";
        String location = "I am from India ";
        String[] strings = {intro, location};
        String joinedStr = String.join("_", strings);
        System.out.println(joinedStr);

        // point 4
        String withOutSpaces = joinedStr.trim();
        System.out.println("point 4 :"+withOutSpaces);

        //point 5
        int idx = withOutSpaces.lastIndexOf('_');
        String replacedString = withOutSpaces.substring(0,idx) +" "+ withOutSpaces.substring(idx+1);
        System.out.println(replacedString);

        //point 6
        String repeatedName = intro.substring(12, 42).repeat(3);
        System.out.println(repeatedName);

        //point 7
        String assigmentTittle = "Java Lab Activity O1";
        String UpperCastTittle = assigmentTittle.toUpperCase();
        boolean isEquals = assigmentTittle.equals(UpperCastTittle);
        boolean isEqualsIgnoreCase = assigmentTittle.equalsIgnoreCase(UpperCastTittle);
        System.out.println("By using equals(): " + isEquals);
        System.out.println("By using equalsIgnoreCase():" + isEqualsIgnoreCase);
        System.out.println("Ans: the equal and equalIgnoreCase have different methods because the equalIgnoreCase method ignores the case between the two words where as equal methods checks the case difference ");

        //point 8
        System.out.println("   I chose Northwest Missouri State University for pursuing my masters because its respected programs, committed staff");

        // Math
        System.out.println("***** Math Class *****");
        // a.i
        double resultSqrt = Math.hypot(3,4);
        System.out.println("Sqrt(32+42): "+resultSqrt);
        // a. ii
        double angleNinety  = Math.toRadians(90);
        double FortyFiveDegrees = Math.toRadians(45);
        double LHS = Math.cos(angleNinety) * Math.sin(FortyFiveDegrees);
        double RHS = Math.sin(angleNinety) * Math.cos(FortyFiveDegrees);
        System.out.println("cos(90°)sin(45°) + sin(90°)cos(45°): " + (LHS+RHS));
        double  result3 = Math.sin(Math.toRadians(90 + 45));
        System.out.println("sin(90° + 45°): " + result3);
        System.out.println("is sin(90° + 45°) == cos(90°)sin(45°) + sin(90°)cos(45°): " + (LHS+RHS == result3));

        // a. III
        double tangent45 = Math.tan(Math.toRadians(45));
        double tangent60 = Math.tan(Math.toRadians(60));
        System.out.println("Tangent of 45°: " + tangent45);
        System.out.println("Tangent of 60°: " + tangent60);

        // a. iv
        double log28 = Math.log(28);
        double log48 = Math.log(4);
        System.out.println("log of 28 " + log28);
        System.out.println("log of 4 : " + log48);
        // b
        int x1 = 5,  x2 = 4, y1 = 6, y2 = 3;
        double slope = (double) (y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;
        System.out.println("slope intercept form equation :"+ "y = " + (int)slope + "x" + (int)intercept);

        // Random
        System.out.println("***** Random Class *****");

        int randomValue1 = (int)(Math.random() * ((1000 - 500)+1) + 500);
        int randomValue2 = (int)(Math.random() * ((1000 - 500)+1) + 500);

        System.out.println("First random value ranging between 500 to 1000: "+randomValue1);
        System.out.println("Second random value ranging between 500 to 1000: "+randomValue2);

        //Part b
        Random randomInstance = new Random();

            int random2 = randomInstance.nextInt(200);
            int random1 = randomInstance.nextInt(200);
            int random3 = randomInstance.nextInt(200);
            int random4 = randomInstance.nextInt(200);
            double squareRoot1 = Math.sqrt(random1);
            double squareRoot2 = Math.sqrt(random2);
            double squareRoot3 = Math.sqrt(random3);
            double squareRoot4 = Math.sqrt(random4);
            System.out.println("Random Integer One: " + random1 + ", Square Root: " + squareRoot1);
            System.out.println("Random Integer Two: " + random2 + ", Square Root: " + squareRoot2);
            System.out.println("Random Integer Three: " + random3 + ", Square Root: " + squareRoot3);
            System.out.println("Random Integer Four: " + random4+ ", Square Root: " + squareRoot4);
            System.out.println("3 random values without passing any integer values");
            double random5 = randomInstance.nextInt();
            double random6 = randomInstance.nextInt();
            double random7 = randomInstance.nextInt();
            System.out.println("Random Integer Five:"+random5);
            System.out.println("Random Integer Six:"+random6);
            System.out.println("Random Integer Seven:"+random7);
            //c
            System.out.println("Did you get the same result each time: I didn't get the same answer every time");

            //d
        Random randomInstanceWithValue = new Random(30);
        int randomTwo = randomInstanceWithValue.nextInt(200);
        int randomOne = randomInstanceWithValue.nextInt(200);
        int randomThree = randomInstanceWithValue.nextInt(200);
        int randomFour = randomInstanceWithValue.nextInt(200);
        double squareRootOne = Math.sqrt(randomOne);
        double squareRootTwo = Math.sqrt(randomTwo);
        double squareRootThree = Math.sqrt(randomThree);
        double squareRootFour = Math.sqrt(randomFour);
        System.out.println("Random Integer One: " + randomOne + ", Square Root: " + squareRootOne);
        System.out.println("Random Integer Two: " + randomTwo + ", Square Root: " + squareRootTwo);
        System.out.println("Random Integer Three: " + randomThree + ", Square Root: " + squareRootThree);
        System.out.println("Random Integer Four: " + randomFour+ ", Square Root: " + squareRootFour);
        System.out.println("3 random values without passing any integer values");
        double randomFive = randomInstance.nextInt();
        double randomSix = randomInstance.nextInt();
        double randomSeven = randomInstance.nextInt();
        System.out.println("Random Integer Five:"+randomFive);
        System.out.println("Random Integer Six:"+randomSix);
        System.out.println("Random Integer Seven:"+randomSeven);


    }










    }

