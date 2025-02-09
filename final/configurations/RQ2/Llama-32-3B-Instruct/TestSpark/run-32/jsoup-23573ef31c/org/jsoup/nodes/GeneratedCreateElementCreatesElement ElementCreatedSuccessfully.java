package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedCreateElementCreatesElement ElementCreatedSuccessfully {

    @Test
    public void createElementCreatesElement

    ElementCreatedSuccessfully() {
        Document document = new Document("https://example.com");
        String tagName = "div";
        Element element = document.createElement(tagName);
        assertNotNull(element);
    }

}