import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FilePlayerManagement implements IPlayerManagement {
    private Player player1;
    private Player player2;

    public FilePlayerManagement() {
        this.player1 = new Player();
        this.player2 = new Player();

        this.readDataFromFile();
    }

    private void readDataFromFile() {
        try {
            Scanner file = new Scanner(new File("data.txt"));
            if (file.hasNextLine()) {
                this.player1.setName(file.nextLine());
            }
            if (file.hasNextLine()) {
                this.player2.setName(file.nextLine());
            }
            file.close();
          } catch (FileNotFoundException e) {}
    }

    private void writeIntoFile() {
        try {
            FileWriter file = new FileWriter("data.txt");
            file.write(this.player1.getName() + "\n");
            file.write(this.player2.getName());
            file.close();
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }

    public Player getPlayer1() {
        return this.player1;
    }

    public Player getPlayer2() {
        return this.player2;
    }

    public void onExit() {
        this.writeIntoFile();
    }
}