package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedElementCloneTest {

    @Test
    public void ElementCloneTest() {
        Element element = new Element(Tag.valueOf("div"), "");
        Element clone = element.clone();
        assertEquals(clone, element);
    }

}