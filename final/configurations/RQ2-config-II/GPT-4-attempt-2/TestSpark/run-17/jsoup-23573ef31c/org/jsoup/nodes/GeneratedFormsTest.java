package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedFormsTest {

    @Test
    public void formsTest() {
        Document doc = new Document("http://google.com");
        assertTrue(doc.forms().isEmpty());
    }

}