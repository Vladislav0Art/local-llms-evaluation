package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedElementAppendChildTest {

    @Test
    public void ElementAppendChildTest() {
        Element element = new Element("div");
        Element child = new Element("p");
        element.appendChild(child);
        assertEquals(1, element.childrenSize());
    }

}