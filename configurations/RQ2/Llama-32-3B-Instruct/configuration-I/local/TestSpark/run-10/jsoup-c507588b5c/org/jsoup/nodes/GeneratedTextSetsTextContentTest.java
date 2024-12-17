package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedTextSetsTextContentTest {

    @Test
    public void textSetsTextContentTest() {
        String text = "new test";
        TextNode node = new TextNode("old");
        node.text(text);
        assertNotNull(node.text());
        assertEquals(text, node.getWholeText());
    }

}