package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedEmptyTest {

    @Test
    public void emptyTest() {
        Element parent = new Element(Tag.valueOf("div"), "");
        Element child = new Element(Tag.valueOf("span"), "");
        parent.appendChild(child);

        parent.empty();

        assertEquals(0, parent.children().size());
    }

}