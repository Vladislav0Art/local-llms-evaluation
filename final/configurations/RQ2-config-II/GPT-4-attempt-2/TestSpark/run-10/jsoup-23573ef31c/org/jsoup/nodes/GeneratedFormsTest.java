package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFormsTest {

    @Test
    public void formsTest() {
        Document document = new Document("Test");
        assertTrue(document.forms().isEmpty());
    }

}