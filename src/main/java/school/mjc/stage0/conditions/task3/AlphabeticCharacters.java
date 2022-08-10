package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public static void vowelDeterminer(char character) {
        switch (character) {
            case 'a':
            case 'o':
            case 'i':
            case 'e':
            case 'u':
            case 'y':
                System.out.println("Vowel");
                break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'w':
            case 'x':
            case 'z':
                System.out.println("Consonant");
                break;
        
        default: {
            System.out.println("wrong alphabet!");
        }
        
        }
    }
    public static void main(String[] args) {
        vowelDeterminer('a');
    }
}
