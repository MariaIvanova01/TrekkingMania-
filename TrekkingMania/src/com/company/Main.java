package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numTeams = scan.nextInt();
        int teamMembers = 0;
        int teamMusala = 0;
        int teamMonblan = 0;
        int teamKilimandjaro = 0;
        int teamK2 = 0;
        int teamEverest = 0;
        int participants = 0;

        for (int i = 0; i < numTeams; i++){
            teamMembers = scan.nextInt();
            participants += teamMembers;

            if (teamMembers <= 5){
                teamMusala += teamMembers;
            }else if (teamMembers >= 6 && teamMembers <=12){
                teamMonblan += teamMembers;
            }else if (teamMembers >= 13 && teamMembers <= 25){
                teamKilimandjaro += teamMembers;
            }else if (teamMembers >= 26 && teamMembers <= 40){
                teamK2 += teamMembers;
            }else{
                teamEverest += teamMembers;
            }
        }
        double pMusala = ((double)teamMusala / (double)participants) * 100;
        double pMonblan = ((double)teamMonblan / (double)participants) * 100;
        double pKilimandjaro = ((double)teamKilimandjaro / (double)participants) * 100;
        double pK2 = ((double)teamK2 / (double)participants) * 100;
        double pEverest = ((double)teamEverest / (double)participants) * 100;

        System.out.printf("%.2f%% %n%.2f%% %n%.2f%% %n%.2f%% %n%.2f%%", pMusala, pMonblan, pKilimandjaro, pK2, pEverest);
    }
}
