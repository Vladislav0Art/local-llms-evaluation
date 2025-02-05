package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedLocationTest {

    @Test
    public void locationTest() {
        Document doc = new Document("http://www.google.com");
        assertEquals("http://www.google.com", doc.location());
    }

}