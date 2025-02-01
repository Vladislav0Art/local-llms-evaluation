package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.select.Selector;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedUpdateMetaCharsetElementTest {

    @Test
    public void updateMetaCharsetElementTest() {
        Document doc = new Document("");
        assertFalse(doc.updateMetaCharsetElement());
        doc.updateMetaCharsetElement(true);
        assertTrue(doc.updateMetaCharsetElement());
    }

}