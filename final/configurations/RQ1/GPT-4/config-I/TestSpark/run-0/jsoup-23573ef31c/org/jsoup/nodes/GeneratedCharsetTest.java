package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.nio.charset.Charset;

public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        Document doc = new Document("");
        doc.charset(Charset.forName("ISO-8859-1"));

        assertEquals(Charset.forName("ISO-8859-1"), doc.charset());
    }

}