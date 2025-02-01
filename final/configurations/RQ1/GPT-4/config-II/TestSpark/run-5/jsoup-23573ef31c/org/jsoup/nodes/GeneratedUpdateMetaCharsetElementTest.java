package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.mockito.Mockito.*;

public class GeneratedUpdateMetaCharsetElementTest {

    @Test
    public void updateMetaCharsetElementTest() {
        Document document = new Document("www.google.com");
        assertFalse(document.updateMetaCharsetElement());
        document.updateMetaCharsetElement(true);
        assertTrue(document.updateMetaCharsetElement());
    }

}