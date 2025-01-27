package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;

public class GeneratedUpdateMetaCharsetElementUpdatesCharsetCorrectly {

    @Test
    public void updateMetaCharsetElementUpdatesCharsetCorrectly() {
        boolean update = true;
        Document doc = new Document();
        doc.updateMetaCharsetElement(update);
        assertTrue(doc.updateMetaCharsetElement());
    }

}