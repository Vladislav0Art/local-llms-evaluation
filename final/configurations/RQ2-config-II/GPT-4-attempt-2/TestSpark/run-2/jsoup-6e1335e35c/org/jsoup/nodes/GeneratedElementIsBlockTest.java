package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedElementIsBlockTest {

    @Test
    public void ElementIsBlockTest() {
        Element element = new Element("div");
        assertTrue(element.isBlock());
    }

}