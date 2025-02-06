package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedLocationMethodReturnsCorrectLocation {

    @Test
    public void locationMethodReturnsCorrectLocation() {
        String baseUri = "https://www.example.com";
        Document document = new Document(baseUri);
        assertEquals("https://www.example.com", document.location());
    }

}