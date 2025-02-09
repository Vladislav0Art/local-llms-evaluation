package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedTitleTest {

    @Test
    public void titleTest() {
        String baseUri = "http://example.com";
        Document doc = new Document(baseUri);
        String expectedTitle = "Test Title";
        doc.title(expectedTitle);

        assertEquals(expectedTitle, doc.title());
    }

}