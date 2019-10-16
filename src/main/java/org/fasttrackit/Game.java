package org.fasttrackit;

public class Game {

    public String Generator(){

    String[] randomWord1 = {"Bob the Cat","Zanik","Arrav","Vannaka","The Wise Old Man","Diango"};
    String[] randomWord2 = {"is wearing","is selling","is cleaning","is buying","is playing with"};
    String[] randomWord3 = {"green party hat","steel longsword","bronze pickaxe","bronze platemail","crystal bow","steel fullhelm","magic staff"};

    int firstLength = randomWord1.length;
    int secondLength = randomWord2.length;
    int thirdLength = randomWord3.length;

    int random1 = (int) (Math.random() * firstLength);
    int random2 = (int) (Math.random() * secondLength);
    int random3 = (int) (Math.random() * thirdLength);

    String sentence = "What!? " + randomWord1[random1] + " " + randomWord2[random2] + " a " + randomWord3[random3]+".";

    return sentence;
    }
}
