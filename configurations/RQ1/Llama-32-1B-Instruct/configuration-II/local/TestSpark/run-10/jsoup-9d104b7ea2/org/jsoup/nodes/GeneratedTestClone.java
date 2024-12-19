package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        TextNode text = new TextNode("");
        TextNode clone = (TextNode) text.clone();

        assertNotNull(clone);

        String originalText = text.text();
        String clonedText = clone.text();

        assertEquals(originalText, clonedText);
    }

    public Document newDocument() throws IOException {
        return newDocumentBuilder().build();
    }

    private Document documentBuilder() throws IOException {
        return new JsoupDocumentBuilder("Test HTML Document")
                .setRootElement("#root");
    }

}