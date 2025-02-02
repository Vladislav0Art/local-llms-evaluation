package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedGetTextNodeBlankTest {

    @Test
    public void getTextNodeBlankTest() throws IOException {
        String text = "";
        Document doc = new Document(text);
        TextNode textNode = doc.getNodes().get(0);
        assertTrue(textNode.isBlank());
    }

}