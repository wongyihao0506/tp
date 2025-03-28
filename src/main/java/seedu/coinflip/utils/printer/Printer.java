package seedu.coinflip.utils.printer;

import seedu.coinflip.utils.exceptions.CoinflipException;

public class Printer {
    private static final int NUM_OF_UNDERSCORES = 50;
    private static final String USER_GUIDE_URL = "https://ay2425s2-cs2113-f13-1.github.io/tp/UserGuide.html";

    //@@author HTY2003
    public static void printUnderscoreLine() {
        System.out.println(new String(new char[NUM_OF_UNDERSCORES]).replace("\0", "_"));
    }

    public static void printWelcome() {
        System.out.println("Welcome to Coinflip!");
    }

    public static void printBye() {
        System.out.println("Thank you for using Coinflip. Goodbye!");
    }

    public static void printInvalidCommand() {
        System.out.println("Invalid command!");
    }

    public static void printException(CoinflipException e) {
        System.out.println(e.message);
    }

    public static void printLoggerFail() {
        System.out.println("Coinflip could not start due errors initializing its Java logger: ");
    }

    //@@author timothyloh0523
    public static void printBalance(int balance) {
        System.out.println("Your remaining balance is: " + balance);
    }

    //@@author CRL006
    public static void printWins(int wins, int losses) {
        if (wins == 0 && losses != 0) {
            System.out.println("You have not won before... Better luck next time!");
        } else if (wins == 0 && losses == 0) {
            System.out.println("You have not played a coinflip before! Type in 'flip heads' or 'flip tails' to play!");
        }
        else if (wins == 1) {
            System.out.println("You have won once!");
        } else {
            System.out.println("You have won " + wins + "times!");
        }
    }

    //@@author CRL006
    public static void printLosses(int wins, int losses) {
        if (losses == 0 && wins != 0) {
            System.out.println("You have not lost before!! Nice!");
        } else if (losses == 0 && wins == 0) {
            System.out.println("You have not played a coinflip before! Type in 'flip heads' or 'flip tails' to play!");
        } else if (losses == 1) {
            System.out.println("You have only lost once!");
        } else {
            System.out.println("You have lost " + losses + "times");
        }
    }

    //@@author CRL006
    public static void printWinnings(int winnings, int loseCount) {
        if (winnings == 0 && loseCount == 0) {
            System.out.println("You have not played a coinflip before! Type in 'flip heads' or 'flip tails' to play!");
        } else {
            System.out.println("Your total winnings are: " + winnings);
        }
    }

    //@@author CRL006
    public static void printLosings(int losings, int winCount) {
        if (losings == 0 && winCount == 0) {
            System.out.println("You have not played a coinflip before! Type in 'flip heads' or 'flip tails' to play!");
        } else {
            System.out.println("Your total losings are: " + losings);
        }
    }

    public static void printBetAmount(int betAmount) {
        System.out.println("Your current bet amount is: " + betAmount);
    }

    public static void printNotEnoughCoins() {
        System.out.println("You are betting more coins than you currently have! Please change your bet amount.");
    }

    //@@author wongyihao0506
    public static void printFlipOutcome(String coinFlip, Boolean outcome, int betAmount) {
        String outcomeMessage = outcome ? "You won " : "You lost ";
        System.out.println(coinFlip + "! " + outcomeMessage + betAmount + " coins.");
    }

    public static void printNewSaveFileNote() {
        System.out.println("Note: No save file found. A new one will be created for you.");
    }

    //@@author OliverQiL
    public static void printHelp() {
        System.out.println("""
                Here are the commands you can use:\
                \n\ncheck balance - Shows your remaining balance.\
                \ncheck bet - Shows your current bet amount.\
                \ncheck wins - Shows your total win count.\
                \ncheck losses - Shows your total lose count.\
                \ncheck winnings - Shows your total winnings.\
                \ncheck losings - Shows your total losings.\
                \nchange <amount> - Changes your bet amount.\
                \nflip <heads/tails> - Bet on a coin flip being heads or tails.\
                \nexit - Exits the application.\
                \nhelp - Shows this help message.\
                \n\nFor more information, please visit our User Guide: \n"""
                + USER_GUIDE_URL);
    }
}
