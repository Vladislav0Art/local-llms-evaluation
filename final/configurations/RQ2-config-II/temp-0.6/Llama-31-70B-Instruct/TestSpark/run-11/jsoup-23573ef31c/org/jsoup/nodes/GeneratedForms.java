package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedForms {

    @Test
    public void forms() {
        String baseUri = "";
        Document document = new Document(baseUri);
        assertNotNull(document.forms());
    }

}