package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedLocation_ReturnsCorrectLocation {

    @Test
    public void location_ReturnsCorrectLocation() {
        String baseUri = "https://example.com";
        Document document = new Document(baseUri);
        assertEquals(baseUri, document.location());
    }

}