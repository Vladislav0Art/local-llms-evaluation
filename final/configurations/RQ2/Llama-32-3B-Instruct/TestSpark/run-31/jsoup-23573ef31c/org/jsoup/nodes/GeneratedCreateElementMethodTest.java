package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCreateElementMethodTest {

    @Test
    public void createElementMethodTest() throws IOException {
        Document document = new Document();
        Element element = document.createElement("div").element();
        assertNotNull(element);
    }

}