package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedElementSelectTest {

    @Test
    public void ElementSelectTest() {
        Element parent = new Element("div");
        Element child = new Element("p");
        parent.appendChild(child);
        Elements elements = parent.select("p");
        assertEquals(1, elements.size());
    }

}