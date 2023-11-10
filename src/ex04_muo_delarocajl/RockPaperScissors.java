package ex04_muo_delarocajl;

import java.util.Scanner;

public class RockPaperScissors{
        
    
	public static void main(String[] args){
		Move rock = new Move("Rock");
		Move paper = new Move("Paper");
		Move scissors = new Move("Scissors");
		
		rock.setStrongAgainst(scissors);
		paper.setStrongAgainst(rock);
		scissors.setStrongAgainst(paper);
		
		int roundsToWin = 2;
                int choiceSet;
                int choice, comScore, plaScore;
                boolean stopGame = false;
                
                while (stopGame == false) {
                System.out.println("""
                                   \nWelcome to Rock, Paper, Scissors. Please choose an option:
                                   1. Start game
                                   2. Change number of rounds
                                   3. Exit application""");
                
                
                    do {
                        System.out.println("Please input your choice (1, 2, 3): ");
                        choiceSet = DummyMethods.getInt();

                    } while (!(choiceSet == 1 || choiceSet == 2 || choiceSet == 3));


                    switch (choiceSet) {
                        case 1:
                            plaScore = 0;
                            comScore = 0;
                            System.out.println(String.format("This match will be first to %d wins",roundsToWin));
                            do {
                                
                                

                                int random = (int) Math.floor(Math.random()*3) + 1;
                                Move randCho = null, optionChos = null;
                                switch (random) {
                                    case 1 -> randCho = rock;
                                    case 2 -> randCho = paper;
                                    case 3 -> randCho = scissors;
                                }
                                System.out.println("""
                                                   The computer has selected its move. Select your move:
                                                   1. Rock
                                                   2. Paper
                                                   3. Scissors""");
                                int optChos = DummyMethods.getInt();
                                switch (optChos) {
                                    case 1 -> optionChos = rock;
                                    case 2 -> optionChos = paper;
                                    case 3 -> optionChos = scissors;
                                }
                                System.out.println(String.format("Player chose %s. Computer chose %s. ",optionChos.getName(),randCho.getName()));
                                switch (Move.compareMoves(optionChos, randCho)) {
                                    case 0:
                                        plaScore++;
                                        System.out.print("Player wins round!\n");
                                        break;
                                    case 1:
                                        comScore++;
                                        System.out.print("Computer wins round!\n");
                                        break;
                                    case 2:
                                        System.out.print("Round is tied!\n");
                                        break;

                                }
                                System.out.print(String.format("Player: %d - Computer: %d\n",plaScore,comScore));

                            } while (plaScore != roundsToWin && comScore != roundsToWin); 
                            
                            if (plaScore == roundsToWin) {System.out.print("\nPlayer Wins!\n\n");}
                            else {System.out.print("\nComputer Wins!\n\n");}
                            break;



                        case 2:
                            System.out.println("How many wins are needed to win a match? ");
                            roundsToWin = DummyMethods.getInt();
                            break;
                        case 3:
                            stopGame = true;
                            break;
                    }
                }
            }
	}
        