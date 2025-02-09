package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedElementHtmlTest {

    @Test
    public void ElementHtmlTest() {
        Element pTag = new Element("p");
        pTag.append("Hello world");
        Element divTag = new Element("div");
        divTag.appendChild(pTag);
        String expected = "<p>Hello world</p>";
        assertEquals(expected, divTag.html());
    }

}