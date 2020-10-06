import java.util.Scanner;

class Player{
    String id;
    String name;
    int[] scores;
    int no_matches_played;

    Player(){
        id = "10";
        name = "neymar";
        scores = new int[]{4, 7, 6, 9};
        no_matches_played = 4;
    }

    Player(String id1, String name1, int[] scores1, int n){
        id = id1;
        name = name1;
        scores = scores1;
        no_matches_played = n;
    }
    
    void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter player details:");
        System.out.println("Enter id:");
        id = sc.next();
        System.out.println("Enter name:");
        name = sc.next();
        System.out.println("Enter no of matches played:");
        no_matches_played = sc.nextInt();
        scores = new int[no_matches_played];
        for(int i = 0; i < no_matches_played; i++){
            System.out.println("Enter goals scored in match " + (i+1) + ":");
            scores[i] = sc.nextInt();
        }
    }
    void printDetails(){
        System.out.println("The player details are:");
        System.out.println("id: " + id + "\tname: " + name + "\tno of matches played: " + no_matches_played);
        for(int i = 0; i < no_matches_played; i++){
            System.out.println("Goals scored in match " + (i+1) +": " + scores[i]);
        }
    }
    double avg(){
        int scoreSum = 0;
        for(int i = 0; i < no_matches_played; i++){
            scoreSum += scores[i];
        }
        return (scoreSum / (no_matches_played + 0.0));
    }
}


public class E_1 {
    public static void main(String[] args){
        int[] score = {3, 4, 7};
        double p1avg, p2avg;
        Player p1 = new Player();
        Player p2 = new Player("cr17", "ronaldo", score,  3);
        p1.getDetails();
        p1avg = p1.avg();
        p2avg = p2.avg();
        
        if (p1avg > p2avg){
            System.out.println("Player 1 has greatest average. i.e, " + p1avg + "\tplayer 2 average is: " + p2avg);
            System.out.println("Player 1:");
            p1.printDetails();
            System.out.println("Player 2:");
            p2.printDetails();
        }
        else if(p2avg > p1avg){
            System.out.println("Player 2 has greatest average. i.e, " + p2avg + "\tplayer 1 average is: " + p1avg);
            System.out.println("Player 2:");
            p2.printDetails();
            System.out.println("Player 1:");
            p1.printDetails();
            
        }
        else{
            System.out.println("Both player 1 and 2 have equal average. " + "\tplayer 1 average is: " + p1avg + "\tplayer 2 average is: " + p2avg);
            System.out.println("Player:");
            p1.printDetails();
            System.out.println("Player 2:");
            p2.printDetails();
        }
    }
}
