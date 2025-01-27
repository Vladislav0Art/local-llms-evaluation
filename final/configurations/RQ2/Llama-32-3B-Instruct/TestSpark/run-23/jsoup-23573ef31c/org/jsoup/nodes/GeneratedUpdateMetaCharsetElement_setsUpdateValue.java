package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GeneratedUpdateMetaCharsetElement_setsUpdateValue {

    @Test
    public void updateMetaCharsetElement_setsUpdateValue() {
        boolean updateValue = true;
        Document document = new Document("https://example.com");
        document.updateMetaCharsetElement(updateValue);
        assertTrue(document.updateMetaCharsetElement());
    }

}