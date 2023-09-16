public class Test {


    public static void main(String[] args) {
    String name = "Shiva Kumar Reddy";
    int numberOfLines = 0;

        do{

        if(numberOfLines == 0 || numberOfLines == 3){
            numberOfLines+=1;
            for(int i =0; i<= name.length()+2 ; i++){
                if( i == 0 || i == name.length()+2) {
                    System.out.print("+");
                } else{
                    System.out.print("*");
                }
            }

        } else {
            numberOfLines+=1;
            System.out.println("+ " +name+" +");
        }

    } while(numberOfLines <4);
}

}
