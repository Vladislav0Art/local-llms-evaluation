package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

public class GeneratedLocationMethodNotNullFound {

    @Test
    public void locationMethodNotNullFound() {
        Document document = new Document("http://example.com");
        String location = document.location();
        assertNotNull(location);
    }

}