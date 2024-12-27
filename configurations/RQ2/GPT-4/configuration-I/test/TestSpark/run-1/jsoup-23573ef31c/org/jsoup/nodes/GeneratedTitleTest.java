package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.mockito.Mockito;

public class GeneratedTitleTest {

    @Test
    public void titleTest() {
        Document document = new Document("http://baseUri");
        document.title("Title");
        assertEquals("Title", document.title());
    }

}