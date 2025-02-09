package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTextSetsAndGetsText SetsAndGetsText DocumentWithText {

    @Test
    public void textSetsAndGetsText

    SetsAndGetsText DocumentWithText() {
        Document document = new Document("https://example.com");
        String text = "Example Text";
        document.text(text);
        assertEquals(text, document.text());
    }

}