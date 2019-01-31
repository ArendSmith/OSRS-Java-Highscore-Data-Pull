# OSRS-Java-Highscore-Data-Pull
# A very brute force implementation of OSRS data pulling methods. Please credit use of this class in your code if you decide to use it.

//Note: This class does not come with getters for skill rank. The rank is pulled in position 0 of the vector's rows.
//feel free to implement it.


//You will need to:

import java.util.Vector;

//Create an object by doing:

Vector obj = new Highscores.getHighscores(*rsname*);

//Then by calling

Highscores.attackLvl(obj);

//or

Highscores.attackXP(obj);

//These two commands will return the level or XP integer.

//Pretty straight forward. 
