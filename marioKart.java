

public class marioKart {
    String playerName;
    String character;
    int speed;

    public marioKart(String playerName, String character ,int speed) {
        this.playerName = playerName;
        this.character = character;
        this.speed = speed;
    }

    public void boost(int boostAmount) {

        this.speed += boostAmount;
    }

    public void displayinfo() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Character: " + character);
        System.out.println("Speed: " + speed);
    }

    public static void main(String[] args) {

        System.out.println("Mario Kart!");
            marioKart player1 = new marioKart("Julio", "Mario" ,10);
        player1.displayinfo();
        player1.boost(5);
        System.out.println(player1.playerName + " speed after boost: " + player1.speed);
        
    }
}
