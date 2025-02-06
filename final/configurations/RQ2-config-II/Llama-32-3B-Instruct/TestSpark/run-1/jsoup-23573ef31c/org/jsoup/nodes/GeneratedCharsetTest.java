package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

import java.util.ArrayList;

import org.jsoup.Connection;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertEquals("UTF-8", document.charset());
        document.charset(Charset.forName("iso-8859-1"));
        assertEquals(Charset.forName("iso-8859-1"), document.charset());
    }

}