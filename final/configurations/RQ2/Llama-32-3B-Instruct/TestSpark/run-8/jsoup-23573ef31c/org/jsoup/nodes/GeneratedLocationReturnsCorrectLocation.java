package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedLocationReturnsCorrectLocation {

    @Test
    public void locationReturnsCorrectLocation() {
        Document document = new Document("http://example.com");
        assertEquals("http://example.com", document.location());
    }

}