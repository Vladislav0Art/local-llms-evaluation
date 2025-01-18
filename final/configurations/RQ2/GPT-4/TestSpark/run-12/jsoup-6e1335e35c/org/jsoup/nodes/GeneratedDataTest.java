package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedDataTest {

    @Test
    public void dataTest() {
        Element element = new Element("div");
        String data = "Test data";
        element.text(data);
        assertEquals(data, element.data());
    }

}