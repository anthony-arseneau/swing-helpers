import java.awt.*;
import java.io.*;

/**
 * This class is for importing new fonts that are already downloaded. Just need
 * to pass in the file path as a string to access the font.
 * @author Anthony Arseneau
 * @version March 5, 2024
 * Networks project
 */
public class FontImport {
    // Instance variables
    Font newFont;

    /**
     * Constructor
     * @param filePath the file path to the font
     */
    public FontImport(String filePath) {
        // Import font
        try {
            newFont = Font.createFont(Font.TRUETYPE_FONT, new File(filePath)).deriveFont(18f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(filePath)));
        } catch (IOException|FontFormatException e) {
            // Error handling
            e.printStackTrace();
        }
    }

    /**
     * Getter method to access the imported font
     * @return the font that was imported
     */
    public Font getFont() {
        return newFont;
    }
}
