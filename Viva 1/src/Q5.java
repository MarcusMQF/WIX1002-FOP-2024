import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mode;
        do {
            System.out.print("""
                    Please select a mode
                    enter [1] to create a remixed song title
                    enter [2] to find original song
                    enter [3] to quit
                    Mode:  """);
            mode = sc.nextInt();
            sc.nextLine();
            switch (mode) {
                case 1: {
                    System.out.print("Enter the original song's title: ");
                    String title = sc.nextLine();
                    String titleUp = title.toUpperCase();
                    boolean checkBlank = titleUp.isBlank();
                    boolean checkRemix = titleUp.matches("(.*)REMIX(.*)");
                    int length = titleUp.length();
                    if (!checkBlank && !checkRemix && length <= 200) {
                        System.out.print("Enter a number of \"REMIX\" inserted BEFORE the title: ");
                        int numF = sc.nextInt();
                        System.out.print("Enter a number of \"REMIX\" inserted AFTER the title: ");
                        int numL = sc.nextInt();
                        System.out.print("Enter the number of \"REMIX\" inserted between words: ");
                        int numB = sc.nextInt();
                        System.out.print("The remixed song title: ");
                        for (int i = 0; i < numF; i++) {
                            System.out.print("REMIX");
                        }
                        String[] words = titleUp.split(" ");
                        for (int i = 0; i < words.length; i++) {
                            System.out.print(words[i]);
                            if (i < words.length - 1) {
                                for (int j = 0; j < numB; j++) {
                                    System.out.print("REMIX");
                                }
                            }
                        }
                        for (int i = 0; i < numL; i++) {
                            System.out.print("REMIX");
                        }
                        System.out.println();
                    } else {
                        System.out.println("Please try again");
                        System.out.println();
                    }
                    break;
                }
                case 2: {
                    System.out.print("Enter the remixed song's title: ");
                    String remixTitle = sc.nextLine();
                    String remixTitleUp = remixTitle.toUpperCase();
                    String remixNoSpace = remixTitleUp.replaceAll(" ", "");
                    boolean checkRemix = remixNoSpace.matches("(.*)REMIX(.*)");
                    String ori;
                    String regex = "\\s+";
                    if (checkRemix) {
                        ori = remixNoSpace.replaceAll("REMIX", " ");
                        ori = ori.replaceAll(regex, " ");
                        ori = ori.trim();
                        System.out.print("The original song: " + ori);
                        System.out.println();
                    } else {
                        System.out.println("It is an original song");
                        System.out.println();
                    }
                    break;
                }
                case 3: {
                    System.out.println("Exiting...");
                    break;
                }
                default: {
                    System.out.println("Invalid input.");
                    break;
                }
            }
            System.out.println();
        } while (mode != 3);
        sc.close();
    }
}