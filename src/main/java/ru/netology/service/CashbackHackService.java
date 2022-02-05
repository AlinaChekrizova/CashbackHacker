package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;


    public int remain(int amount) {
        int remain = boundary - amount % boundary;
        if (amount == 0){
            return boundary;
        }
        if (remain == 1000) {
            return 0;
        }

        return remain;
    }
}
