package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTitleSetterTest {

    @Test
    public void titleSetterTest() {
        Document document = Document.createShell("https://sample.com");
        document.title("Sample Title");
        assertEquals("Sample Title", document.title());
    }

}