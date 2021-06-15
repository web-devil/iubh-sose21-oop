import java.util.Scanner;

/* Gedankenspiel wegen (Mehrfach-)Vererbung und Interface
sowie Polymorphie 

RenamePLayerController controllerObj = new RenamePLayerController();
ParentClass controllerObj = new RenamePLayerController();
IController controllerObj = new RenamePLayerController();
ISomethingElse controllerObj = new RenamePLayerController();

class RenamePlayerController extends ParentClass implements IController, ISomethingElse {
*/
class RenamePlayerController implements IController {
    private Scanner scanner;

    public RenamePlayerController(Scanner scanner) {
        this.scanner = scanner;
    }

    public void execute(Player player) {
        System.out.println("Player-Namen ändern");
        System.out.println("-------------------");
        System.out.println("Bisheriger Name: " + player.getName());
        System.out.println("Neuer Name: ");
        player.setName(this.scanner.next());
        System.out.println("Name geändert!");
    }
}