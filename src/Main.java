Author: Tunde Idahor

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        String name = "Reese";
        int score = 10;
        int bonus = 6;
        int levelCompleted = 3;
        int highScore;

    /***
     * Player 1:
     *
     *
     * Controller One.
     */
        highScore = calculateScore(gameOver,score,bonus,levelCompleted,name);
        int player_1 = calculateHighScorePosition(highScore);
        System.out.println("Your final score_1 is "+ highScore + " ,PlayerOnePos = " + player_1 + " ,Player_Name: " + name );
        displayHighScorePosition(name, player_1);


        /***
         * Player 2:
         *
         *
         * Controller Two.
         */

        score = 100;
        bonus = 5000;
        levelCompleted = 4;
        name = "Joe";

        highScore = calculateScore(gameOver, score, bonus,levelCompleted, name);
        int player_2 = calculateHighScorePosition(highScore);
        System.out.println("Your final score_2 is  " + highScore + " ,PlayerTwoPos = " + player_2 + " ,Player_Name: " + name );
        displayHighScorePosition(name, player_2);


        /***
         * Player 3
         *
         * Controller Three.
         */


        score = 15000;
        bonus = 10;
        levelCompleted = 4;
        name = "Mike";

        highScore = calculateScore(gameOver, score, bonus,levelCompleted, name);
        int player_3 = calculateHighScorePosition(highScore);
        System.out.println("Your final score_2 is  " + highScore + " ,PlayerThreePos. = " + player_3  + " ,Player_Name: " + name );
        displayHighScorePosition(name, player_3);



        /***
         * Player 4
         *
         *
         * Controller Three.
         */


        score = 100;
        bonus = 10;
        levelCompleted = 4;
        name = "Wayne";

        highScore = calculateScore(gameOver, score, bonus,levelCompleted, name);
        int player_4 = calculateHighScorePosition(highScore);
        System.out.println("Your final score_2 is  " + highScore + " ,PlayerFourPos. = " + player_4  + " ,Player_Name: " + name );
        displayHighScorePosition(name, player_4);

    }

    /***
     *
     *  @ Method calculates the values
     *
     * This method calculates the score of each player.
     *
     * @ return finalScore
    *
    * */


        public static int calculateScore(boolean gameOver, int score, int bonus, int levelCompleted, String name){
            if (gameOver){
                int finalScore = score + (levelCompleted * bonus);
                finalScore += 1000;
                return finalScore;
            }
            return -1;
        }

    /***
     * Challenge......
     *
     * Method calculate the position of the players
     *
     */
        public static void displayHighScorePosition(String name, int position){

            System.out.println("++++++++++ Player Name: " + name + " and your position is " + position + " on the gaming table. +++++++++++++++" + "\n");

            }

    /***
     *
     * @param newHighScore
     *
     * @return The value of the highest score on the gaming chart for players.
     */

    public static int calculateHighScorePosition(int newHighScore){

                    if(newHighScore >= 20000){
                        System.out.println("First position!!!!!");
                    }
                    else if( (newHighScore > 19000) && (newHighScore <= 19500)) {
                        System.out.println("Second position");
                    }

                    else if( (newHighScore >= 15000) && (newHighScore < 16500)){
                            System.out.println("Third position..........");
                        }
                    else
                        {

                        System.out.println("Last :(  ");
                    }
                    return newHighScore;
            }

        }





//        int score_2 = 10000;
//        int bonus_2 = 200;
//        int levelCompleted_2 = 8;


//        if ((score < 5000) && (score > 1000)) {
//            System.out.println("Your score is less than 5000  but greater than 1000");
//            System.out.println("++++++++++++++++++++++");
//
//        }
//        if (score > 7000) {
//            System.out.println("Yes it is.........more than 7000.");
//
//        }
//        if (gameOver) {
//            System.out.println("Continue..");
//
//        } else {
//            System.out.println("The score is not what you think......");

//        if (gameOver){
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("First Score "  + finalScore );
//}


