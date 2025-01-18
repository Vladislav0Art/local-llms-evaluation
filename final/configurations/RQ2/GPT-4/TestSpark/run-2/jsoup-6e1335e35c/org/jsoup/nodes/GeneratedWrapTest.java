package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedWrapTest {

    @Test
    public void wrapTest() {
        Element e = new Element("p");
        e.wrap("<div></div>");
        assertEquals("<div><p></p></div>", e.outerHtml());
    }

}