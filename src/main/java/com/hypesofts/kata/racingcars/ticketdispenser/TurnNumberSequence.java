package com.hypesofts.kata.racingcars.ticketdispenser;

public class TurnNumberSequence
{
    private static int _turnNumber = 0;

    public static int getNextTurnNumber()
    {
        return _turnNumber++;
    }
}