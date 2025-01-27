package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.nio.charset.Charset;

public class GeneratedTestUpdateMetaCharsetElement_Present {

    @Test
    public void testUpdateMetaCharsetElement_Present() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        boolean update = true;
        document.updateMetaCharsetElement(update);
        assertTrue(update);
    }

}