package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetTitleTest {

    @Test
    public void setTitleTest() {
        Document document = new Document("http://localhost");
        document.title("Test Title");
        assertEquals("Test Title", document.title());
    }

}