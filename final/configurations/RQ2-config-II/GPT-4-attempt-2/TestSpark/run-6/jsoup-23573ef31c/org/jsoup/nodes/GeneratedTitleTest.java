package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTitleTest {

    @Test
    public void titleTest() {
        Document document = Document.createShell("https://sample.com");
        assertEquals("", document.title());
    }

}