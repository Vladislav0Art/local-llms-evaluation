package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.Jsoup;

public class GeneratedUpdateMetaCharsetElement ReturnsBooleanValue {

    @Test
    public void updateMetaCharsetElement

    ReturnsBooleanValue() {
        Document document = new Document("https://www.example.com");
        boolean result = document.updateMetaCharsetElement();
        assertTrue(result);
    }

}