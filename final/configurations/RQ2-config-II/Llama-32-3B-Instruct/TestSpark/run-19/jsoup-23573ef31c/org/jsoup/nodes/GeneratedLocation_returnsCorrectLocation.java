package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedLocation_returnsCorrectLocation {

    @Test
    public void location_returnsCorrectLocation() {
        Document document = new Document("http://example.com");
        assertEquals("http://example.com", document.location());
    }

}