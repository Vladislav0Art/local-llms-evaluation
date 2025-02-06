package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

public class GeneratedLocation_LocationReturnsBaseUri {

    @Test
    public void location_LocationReturnsBaseUri() {
        String baseUri = "https://example.com";
        Connection connection = Jsoup.connect(baseUri);
        Document document = Document.createShell(connection);
        assertEquals(baseUri, document.location());
    }

}