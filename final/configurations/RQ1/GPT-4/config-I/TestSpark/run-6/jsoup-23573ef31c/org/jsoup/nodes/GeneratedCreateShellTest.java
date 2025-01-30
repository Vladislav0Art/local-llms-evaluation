package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedCreateShellTest {

    private static final String BASE_URI = "http://example.com/";

    @Test
    public void createShellTest() {
        Document document = Document.createShell(BASE_URI);
        assertNotNull(document);
        assertEquals(document.location(), BASE_URI);
    }

}