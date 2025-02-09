package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedCreateTextFromEncoded_WithInvalidEncodedText_ThrowsIOException {

    @Test
    public void createTextFromEncoded_WithInvalidEncodedText_ThrowsIOException() {
        String invalidEncodedText = "Invalid encoded text";
        java.io.IOException e = null;
        try {
            Document.createTextNode(invalidEncodedText);
            fail("IOException was not thrown");
        } catch (java.io.IOException ex) {
            assertEquals(0, ex.getMessage().length());
        }
    }

}