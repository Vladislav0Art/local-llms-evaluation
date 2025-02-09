package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.Collections;

public class GeneratedIsBlockTest {

    @Test
    public void isBlockTest() {
        Element blockElement = new Element("div");
        assertTrue(blockElement.isBlock());
        Element inlineElement = new Element("span");
        assertFalse(inlineElement.isBlock());
    }

}