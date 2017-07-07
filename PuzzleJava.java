import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

class PuzzleJava{
    public static void main(String[] args){
        int[] arrayX = {3,5,1,2,7,9,8,13,25,32};
        int sum = 0;

        for(int i = 0; i < arrayX.length; i++){
            sum = sum + arrayX[i];
        }
        System.out.println(sum);

        ArrayList <Integer> newArray = new ArrayList<>();
        for(int i = 0; i < arrayX.length; i++){
            if(arrayX[i] > 10){
                newArray.add(arrayX[i]);
            }
        }
        System.out.println(newArray);
    }
}


class PuzzleJava{
    public static void main(String[] args){
        String[] arrayNames = {"Nancy","Jinichi","Fujibayashi","Momochi","Ishikawa"};
        Collections.shuffle(Arrays.asList(arrayNames));
        System.out.println(Arrays.toString(arrayNames));

        ArrayList <String> newArray = new ArrayList<>();

        for(int i = 0; i < arrayNames.length; i++){
            if(arrayNames[i].length() > 5){
                newArray.add(arrayNames[i]);
            }
        }
        System.out.println(newArray);
    }
}

class PuzzleJava{
    public static void main(String[] args){
        String[] letters = {"A","B","C","D","E","F","G",
        "H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        Collections.shuffle(Arrays.asList(letters));
        System.out.println(Arrays.toString(letters));

        String check1 = letters[letters.length-1];
        System.out.println("Last Value of the Array is:" + check1);

        String check2 = letters[0];
        System.out.println("First Value of the Array is:" + check2);

        String[] vowels = {"A","E","I","O","U"};
        for(int i = 0; i < vowels.length; i++){
            if(check2 == vowels[i]){
                System.out.println("The first letter in the array is a vowel");
            }
        }
    }
}

class PuzzleJava{
    public static void main(String[] args){
        ArrayList <Integer> myArray = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            int random = (int)(Math.random()*45 + 55);
            myArray.add(random);
        }
        System.out.println(myArray);
    }
}

class PuzzleJava{
    public static void main(String[] args){
        ArrayList <Integer> myArray = new ArrayList<>();
        for(int i = 1; i <=10; i++){
            int random = (int)(Math.random()*45 + 55);
            myArray.add(random);
        }
        Collections.sort(myArray);
        System.out.println(myArray);

        int min = myArray.get(0);
        int max = myArray.get(myArray.size()-1);
        System.out.println("Minimum value is:" +min);
        System.out.println("Maximum value is:" +max);
    }
}

class PuzzleJava{
    public static void main(String[] args){
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String strNew = "";
        Random r = new Random();
        for(int i = 0; i < 5; i++){
            strNew = strNew + str.charAt(r.nextInt(str.length()));
        }
        System.out.println(strNew);
    }
}

class PuzzleJava{
    public static void main(String[] args){
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String strNew = "";
        ArrayList <String> newArray = new ArrayList<>();
        Random r = new Random();

        for(int j = 0; j < 9; j++){
            for(int i = 0; i < 5; i++){
                strNew = strNew + str.charAt(r.nextInt(str.length()));
            }
            newArray.add(strNew);
            strNew = "";
        }
        System.out.println(newArray);
    }
}