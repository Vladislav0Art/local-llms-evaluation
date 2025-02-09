package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateElementTest {

    @Test
    public void createElementTest() {
        Document doc = new Document("Test");
        assertNotNull(doc.createElement("div"));
    }

}