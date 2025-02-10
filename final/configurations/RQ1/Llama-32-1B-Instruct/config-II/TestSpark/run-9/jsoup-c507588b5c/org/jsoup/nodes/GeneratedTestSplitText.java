package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Set;

public class GeneratedTestSplitText {

    private static Document document;

    @BeforeClass
    public static void init() throws IOException {
        document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new java.io.File("path_to_your_file.html"));
    }

    @Test
    public void testSplitText() {
        String text = "Hello World";
        TextNode result = textNode.splitText(6);
        assertEquals("Hello", result.text("Hello"));
        assertNotNull(result.siblingIndex());
        assertEquals(1, result.siblingIndex() + 1);
    }

}