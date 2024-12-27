package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.mockito.Mockito;

public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        Document document = new Document("http://baseUri");
        document.charset(Charset.forName("UTF-8"));
        assertEquals(Charset.forName("UTF-8"), document.charset());
    }

}