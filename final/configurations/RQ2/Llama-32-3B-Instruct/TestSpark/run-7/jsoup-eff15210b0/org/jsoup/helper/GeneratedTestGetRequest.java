package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestGetRequest {

    @Test
    public void testGetRequest() throws Exception {
        Document document = Jsoup.connect("http://www.example.com").get();
        assertEquals(200, document.statusCode());
    }

}