package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedElementAppendTextTest {

    @Test
    public void ElementAppendTextTest() {
        Element element = new Element("div");
        element.appendText("Hello World");
        assertEquals("Hello World", element.text());
    }

}