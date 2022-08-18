package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public static void vowelDeterminer(char character) {
        switch (character) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                System.out.println("English");
                break;
        
        default: {
            System.out.println("Non English");
        }
        
        }
    }
    public static void main(String[] args) {
        vowelDeterminer('a');
    }
}
