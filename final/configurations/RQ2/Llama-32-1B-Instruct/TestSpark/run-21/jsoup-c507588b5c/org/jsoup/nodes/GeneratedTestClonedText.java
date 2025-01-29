package org.jsoup.nodes;

import org.jsoup.nodes.Document;

import static org.jsoup.nodes.Document.Builder.a;
import static org.junit.Assert.*;

public class GeneratedTestClonedText {

    public static String cloneText(String text) {
        Document doc = a().text(text).trim();
        return a(doc.text()).html();
    }
}

@Test
public void testClonedText() {
    String text = "Hello World";
    String clonedText = TextNode.cloneText(text);
    assertTrue(clonedText.contains("Hello"));
    assertFalse(clonedText.contains("World"));
}

}