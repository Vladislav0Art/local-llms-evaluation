package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCreateFromEncoded_readsCorrectly {

    @Test
    public void createFromEncoded_readsCorrectly() {
        String encodedText = "<p class=\"result\">test</p>";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertNotNull(node);
        assertEquals(encodedText, node.text());
    }

}