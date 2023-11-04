public class command {
    public static void main(String[] args) {
        String input = "";
while (!input.equals("exit")) {
  System.out.println("Enter a command:");
  input = scanner.nextLine();

  if (input.equals("help")) {
    System.out.println("List of commands:");
    System.out.println("exit - quit the program");
    System.out.println("help - display this list of commands");
  }
}
}