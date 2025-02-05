package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Element original = new Element(Tag.valueOf("div"), "");
        Element clone = original.clone();

        assertNotSame(original, clone);
        assertEquals(original.outerHtml(), clone.outerHtml());
    }

}