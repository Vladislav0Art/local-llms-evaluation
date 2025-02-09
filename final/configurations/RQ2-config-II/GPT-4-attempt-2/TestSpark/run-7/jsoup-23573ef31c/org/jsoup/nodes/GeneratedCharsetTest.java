package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedCharsetTest {

    // Test constructor

    @Test
    public void charsetTest() {
        Document document = new Document("http://localhost");
        document.charset(StandardCharsets.UTF_8);
        assertEquals(StandardCharsets.UTF_8, document.charset());
    }

}