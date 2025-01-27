package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedConstructorWithBaseUriIsCreatedCorrectly {

    @Test
    public void constructorWithBaseUriIsCreatedCorrectly() {
        String baseUri = "http://example.com";
        Document document = new Document(baseUri);
        assertNotNull(document);
        assertEquals(baseUri, document.baseUri());
    }

}