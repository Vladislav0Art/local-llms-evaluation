package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedLocation {

    @Test
    public void location() {
        String baseUri = "";
        Document document = new Document(baseUri);
        assertEquals("", document.location());
    }

}