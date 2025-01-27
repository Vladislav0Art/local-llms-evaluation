package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedSetText {

    @Test
    public void setText() {
        Document document = new Document("https://www.example.com");
        String text = "Hello World";
        Element element = document.text(text);
        assertNotNull(element);
        assertEquals(text, element.data());
    }

}