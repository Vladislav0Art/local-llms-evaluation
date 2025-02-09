package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.Jsoup;

public class GeneratedCreateElement_CreatesNewElement {

    @Test
    public void createElement_CreatesNewElement() {
        Document document = new Document("https://www.example.com");
        Element element = document.createElement("div");
        assertNotNull(element);
    }

}