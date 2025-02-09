package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedChildTest {

    @Test
    public void childTest() {
        Element element = new Element("div");
        Element child = new Element("p");
        element.appendChild(child);
        assertSame(child, element.child(0));
    }

}