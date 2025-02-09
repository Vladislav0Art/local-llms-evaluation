package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDataTest {

    @Test
    public void dataTest() {
        Element element = new Element("div");
        element.append("data");
        assertEquals("data", element.data());
    }

}