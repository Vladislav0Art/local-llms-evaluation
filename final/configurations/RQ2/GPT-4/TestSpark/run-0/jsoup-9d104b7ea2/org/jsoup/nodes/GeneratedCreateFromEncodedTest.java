package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        String encodedText = "Test Text with encoded &quot;text&quot;";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals("Test Text with encoded \"text\"", node.getWholeText());
    }

}