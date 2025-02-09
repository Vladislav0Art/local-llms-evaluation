package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;

import static org.junit.Assert.*;

import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedUpdateMetaCharsetElementGetterSetterTest {

    @Test
    public void updateMetaCharsetElementGetterSetterTest() {
        Document document = new Document("http://example.com");
        document.updateMetaCharsetElement(true);
        assertTrue(document.updateMetaCharsetElement());
    }

}