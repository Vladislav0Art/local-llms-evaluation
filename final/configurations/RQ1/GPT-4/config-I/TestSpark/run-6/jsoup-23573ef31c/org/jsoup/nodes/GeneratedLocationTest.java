package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedLocationTest {

    private static final String BASE_URI = "http://example.com/";

    @Test
    public void locationTest() {
        Document document = new Document(BASE_URI);
        assertEquals(document.location(), BASE_URI);
    }

}