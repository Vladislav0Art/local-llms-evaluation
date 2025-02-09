package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAppendTextTest {

    @Test
    public void appendTextTest() {
        Element element = new Element("div");
        element.appendText("example text");
        assertEquals("example text", element.text());
    }

}