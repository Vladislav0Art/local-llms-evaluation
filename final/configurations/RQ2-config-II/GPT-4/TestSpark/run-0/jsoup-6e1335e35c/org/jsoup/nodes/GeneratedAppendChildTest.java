package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedAppendChildTest {

    @Test
    public void appendChildTest() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("span"), "");
        parent.appendChild(child);

        assertEquals(1, parent.children().size());
        assertEquals(child, parent.child(0));
    }

}