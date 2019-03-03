package com.company;

import java.net.*;
import java.io.*;
import java.util.Vector;

/*

    Code by Arend Smith, please credit an use of this code. It will be provided on my github:
    https://github.com/ArendSmith

    Class has functions which parses highscore data into a vector.
    Each row in the vector has three values.

    eg. Rank - Level - Xp

    Note: This class does not support pulling ranks. Rank is located in position 0 of the row. Feel free to develop
    it into this code if need, for my use it was not needed.

    Needed fixes: Utilize enums to simplify get commands.

 */

public class Highscores
{
    public static final String searchURL = "https://secure.runescape.com/m=hiscore_oldschool/index_lite.ws?player=";
    public static final int expVSize = 24;

    /*
        Grabs data from OSRS highscores and stores it into a vector. This function will be used to update all calculators
        and homescreen high score.

        Catch FileNotFoundException w/ User not found.
     */


    public static Vector getHighscores(String rsname) throws Exception
    {
        Vector data = new Vector(expVSize);
        URL resultsURL = new URL(searchURL + rsname);
        BufferedReader resultsBuffer = new BufferedReader(new InputStreamReader(resultsURL.openStream()));

        String current = "";
        while((current = resultsBuffer.readLine()) != null)
        {
            data.add(current.split(","));
        }

        resultsBuffer.close();
        return data;
    }

    public static int prayerLvl(Vector temp)
    {
        int lvl;

        String formatted = "";
        String[] get = (String[])temp.get(6);

        lvl = Integer.parseInt(get[1]);

        return lvl;

    }

    public static int prayerXp(Vector temp)
    {
        int xp;

        String formatted = "";
        String[] get = (String[])temp.get(6);

        xp = Integer.parseInt(get[2]);

        return xp;
    }

    public static int magicLvl(Vector temp)
    {
        int lvl;

        String formatted = "";
        String[] get = (String[])temp.get(7);

        lvl = Integer.parseInt(get[1]);

        return lvl;

    }

    public static int magicXp(Vector temp)
    {
        int xp;

        String formatted = "";
        String[] get = (String[])temp.get(7);

        xp = Integer.parseInt(get[2]);

        return xp;
    }

    public static int cookingLvl(Vector temp)
    {
        int lvl;

        String formatted = "";
        String[] get = (String[])temp.get(8);

        lvl = Integer.parseInt(get[1]);

        return lvl;

    }

    public static int cookingXp(Vector temp)
    {
        int xp;

        String formatted = "";
        String[] get = (String[])temp.get(8);

        xp = Integer.parseInt(get[2]);

        return xp;
    }

    public static int woodcuttingLvl(Vector temp)
    {
        int lvl;

        String formatted = "";
        String[] get = (String[])temp.get(9);

        lvl = Integer.parseInt(get[1]);

        return lvl;

    }

    public static int woodcuttingXp(Vector temp)
    {
        int xp;

        String formatted = "";
        String[] get = (String[])temp.get(9);

        xp = Integer.parseInt(get[2]);

        return xp;
    }

    public static int fletchingLvl(Vector temp)
    {
        int lvl;

        String formatted = "";
        String[] get = (String[])temp.get(10);

        lvl = Integer.parseInt(get[1]);

        return lvl;

    }

    public static int fletchingXp(Vector temp)
    {
        int xp;

        String formatted = "";
        String[] get = (String[])temp.get(10);

        xp = Integer.parseInt(get[2]);

        return xp;
    }

    public static int fishingLvl(Vector temp)
    {
        int lvl;

        String formatted = "";
        String[] get = (String[])temp.get(11);

        lvl = Integer.parseInt(get[1]);

        return lvl;

    }

    public static int fishingXp(Vector temp)
    {
        int xp;

        String formatted = "";
        String[] get = (String[])temp.get(11);

        xp = Integer.parseInt(get[2]);

        return xp;
    }

    public static int firemakingLvl(Vector temp)
    {
        int lvl;

        String formatted = "";
        String[] get = (String[])temp.get(12);

        lvl = Integer.parseInt(get[1]);

        return lvl;

    }

    public static int firemakingXp(Vector temp)
    {
        int xp;

        String formatted = "";
        String[] get = (String[])temp.get(12);

        xp = Integer.parseInt(get[2]);

        return xp;
    }

    public static int craftingLvl(Vector temp)
    {
        int lvl;

        String formatted = "";
        String[] get = (String[])temp.get(13);

        lvl = Integer.parseInt(get[1]);

        return lvl;

    }

    public static int craftingXp(Vector temp)
    {
        int xp;

        String formatted = "";
        String[] get = (String[])temp.get(13);

        xp = Integer.parseInt(get[2]);

        return xp;
    }

    public static int smithingLvl(Vector temp)
    {
        int lvl;

        String formatted = "";
        String[] get = (String[])temp.get(14);

        lvl = Integer.parseInt(get[1]);

        return lvl;

    }

    public static int smithingXp(Vector temp)
    {
        int xp;

        String formatted = "";
        String[] get = (String[])temp.get(14);

        xp = Integer.parseInt(get[2]);

        return xp;
    }

    public static int miningLvl(Vector temp)
    {
        int lvl;

        String formatted = "";
        String[] get = (String[])temp.get(15);

        lvl = Integer.parseInt(get[1]);

        return lvl;

    }

    public static int miningXp(Vector temp)
    {
        int xp;

        String formatted = "";
        String[] get = (String[])temp.get(15);

        xp = Integer.parseInt(get[2]);

        return xp;
    }

    public static int herbloreLvl(Vector temp)
    {
        int lvl;

        String formatted = "";
        String[] get = (String[])temp.get(16);

        lvl = Integer.parseInt(get[1]);

        return lvl;

    }

    public static int herbloreXp(Vector temp)
    {
        int xp;

        String formatted = "";
        String[] get = (String[])temp.get(16);

        xp = Integer.parseInt(get[2]);

        return xp;
    }

    public static int agilityLvl(Vector temp)
    {
        int lvl;

        String formatted = "";
        String[] get = (String[])temp.get(17);

        lvl = Integer.parseInt(get[1]);

        return lvl;

    }

    public static int agilityXp(Vector temp)
    {
        int xp;

        String formatted = "";
        String[] get = (String[])temp.get(17);

        xp = Integer.parseInt(get[2]);

        return xp;
    }

    public static int thievingLvl(Vector temp)
    {
        int lvl;

        String formatted = "";
        String[] get = (String[])temp.get(18);

        lvl = Integer.parseInt(get[1]);

        return lvl;

    }

    public static int theivingXp(Vector temp)
    {
        int xp;

        String formatted = "";
        String[] get = (String[])temp.get(18);

        xp = Integer.parseInt(get[2]);

        return xp;
    }

    public static int runecraftLvl(Vector temp)
    {
        int lvl;

        String formatted = "";
        String[] get = (String[])temp.get(21);

        lvl = Integer.parseInt(get[1]);

        return lvl;

    }

    public static int runecraftXp(Vector temp)
    {
        int xp;

        String formatted = "";
        String[] get = (String[])temp.get(21);

        xp = Integer.parseInt(get[2]);

        return xp;
    }

    public static int hunterLvl(Vector temp)
    {
        int lvl;

        String formatted = "";
        String[] get = (String[])temp.get(22);

        lvl = Integer.parseInt(get[1]);

        return lvl;

    }

    public static int hunterXp(Vector temp)
    {
        int xp;

        String formatted = "";
        String[] get = (String[])temp.get(22);

        xp = Integer.parseInt(get[2]);

        return xp;
    }

    public static int constructionLvl(Vector temp)
    {
        int lvl;

        String formatted = "";
        String[] get = (String[])temp.get(23);

        lvl = Integer.parseInt(get[1]);

        return lvl;

    }

    public static int constructionXp(Vector temp)
    {
        int xp;

        String formatted = "";
        String[] get = (String[])temp.get(23);

        xp = Integer.parseInt(get[2]);

        return xp;
    }



}
