package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.*;

public class GeneratedCreateFromEncoded_CreatesTextNodeFromEncodedText {

    @Test
    public void createFromEncoded_CreatesTextNodeFromEncodedText() throws IOException {
        String encodedText = "text";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals(encodedText, textNode.getWholeText());
    }
}

class Document {
    class OutputSettings {
        // default settings
    }

}