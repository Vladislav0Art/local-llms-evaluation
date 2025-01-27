package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.nio.charset.Charset;

public class GeneratedTestSetTitle_Present {

    @Test
    public void testSetTitle_Present() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        document.setTitle("Test Title");
        assertEquals("Test Title", document.title());
    }

}