package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedBody_ReturnsCorrectBodyElement {

    @Test
    public void body_ReturnsCorrectBodyElement() {
        String baseUri = "https://example.com";
        Document document = new Document(baseUri);
        Element body = document.body();
        assertNotNull(body);
    }

}