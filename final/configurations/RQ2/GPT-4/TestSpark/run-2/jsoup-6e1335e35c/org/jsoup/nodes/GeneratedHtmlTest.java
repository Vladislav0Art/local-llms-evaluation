package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHtmlTest {

    @Test
    public void htmlTest() {
        Element e = new Element("div");
        e.html("<p>test</p>");
        assertEquals("<p>test</p>", e.html());
    }

}