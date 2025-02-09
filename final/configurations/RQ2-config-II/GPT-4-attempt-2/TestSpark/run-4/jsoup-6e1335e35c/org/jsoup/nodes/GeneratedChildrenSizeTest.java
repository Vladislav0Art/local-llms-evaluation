package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedChildrenSizeTest {

    @Test
    public void childrenSizeTest() {
        Element element = new Element("div");
        element.appendChild(new Element("p"));
        assertSame(1, element.childrenSize());
    }

}