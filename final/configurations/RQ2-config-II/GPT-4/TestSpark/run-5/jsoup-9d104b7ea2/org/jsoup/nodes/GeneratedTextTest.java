package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("initial");
        String updatedText = "updated";
        textNode.text(updatedText);

        assertEquals(updatedText, textNode.text());
    }

}