package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedChildNodeSizeTest {

    @Test
    public void childNodeSizeTest() {
        Element element = new Element("div");
        Element child = new Element("p");
        element.appendChild(child);
        assertSame(1, element.childNodeSize());
    }

}