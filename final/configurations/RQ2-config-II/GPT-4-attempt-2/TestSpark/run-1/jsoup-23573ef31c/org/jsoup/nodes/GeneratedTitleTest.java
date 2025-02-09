package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTitleTest {

    @Test
    public void titleTest() {
        Document document = new Document("");
        document.title("Test title");
        assertEquals("Test title", document.title());
    }

}