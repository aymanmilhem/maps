/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maps;

import java.util.*;

/**
 *
 * @author omega
 */
public class Maps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] allNames
                = //<editor-fold desc="raw names data">
                {"Jane", "Addams",
                    "Muhammad", "Ali",
                    "Stephan", "Ambrose",
                    "Louis", "Armstrong",
                    "Joan", "Beaz",
                    "Josephine", "Barker",
                    "Eleanor", "Roosevelt",
                    "Frank", "Sinatra"
                };
        //</editor-fold>
        String[] firstNames = new String[allNames.length / 2];
        String[] lastNames = new String[allNames.length / 2];
        for (int i = 0; i < allNames.length; i++) {
            /*This if statement checks if we are in an EVEN
                    NUMBERED iteration
                    % is the "mod" or "modulus" operator...
                    it returns the ramainder after we divide number1 by
                    number2*/
            if (i % 2 == 0) {
                //We are in an even number iteration - looking at a 
                //first name
                firstNames[i / 2] = allNames[i];
            } else {
                //we are in an odd number iteration - looking at a 
                //last name
                lastNames[i / 2] = allNames[i];
            }
        }
//        System.out.println(Arrays.toString(firstNames));
//        System.out.println(Arrays.toString(lastNames));
        Map<String, String> famousPeople = new HashMap<>();
        for (int i = 0; i < lastNames.length; i++)
        {
            famousPeople.put(lastNames[i], firstNames[i]);
        }
        System.out.println(famousPeople.get("Sinatra"));

    }

}
