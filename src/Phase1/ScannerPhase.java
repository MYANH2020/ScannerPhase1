package Phase1;
/*
 * Class:       CS 4308 Section n
 * Term:        Fall 2021
 * Name:       <My Anh Huynh>
 * Instructor:   Sharon Perry
 * Project:     Deliverable 1 Scanner
 */

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.util.StringTokenizer;
enum Generate{
    FUNCTION,
    S,
    LEFTPARENTHESIS,
    A,
    COMMA,
    B,
    RIGHTPARENTHESIS,
    RETURN,
    ADD_OPERATOR,
    END
}
public class ScannerPhase {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/anhhuynh/Desktop/input.txt");// input file of minimal form of Julia language
        Scanner sc = new Scanner(file); // Scanner object named as token is initialized
        System.out.print("Lexeme                                    ");
        System.out.println("Tokens");
        System.out.println("-----------------------------------------");

        while (sc.hasNextLine()) {
            String para = sc.nextLine();        // String is obtained in string format

            String[] tokens = para.split(" ");       // split method in java is used to find the token in the file

            for (String token : tokens) {        // for loop will run till the end of the file

                System.out.println(token);       // tokens are printed

            }

        }


        for (Generate myVar : Generate.values()) {
            System.out.println(myVar);
        }

    }

    //make a function that reads the token array and assign it the proper token values
    // example token(1) = function if it sees function it assigns it the FUNCTION token into another array
}



