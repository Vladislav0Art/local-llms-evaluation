package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedTitleManipulationTest {

    @Test
    public void titleManipulationTest() {
        Document doc = new Document("http://example.com");
        doc.title("Test title");
        assertEquals("Test title", doc.title());
    }

}