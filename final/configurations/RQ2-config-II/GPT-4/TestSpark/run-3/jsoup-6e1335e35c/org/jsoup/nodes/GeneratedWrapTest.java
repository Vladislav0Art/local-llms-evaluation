package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedWrapTest {

    @Test
    public void wrapTest() {
        Element element = new Element("div");
        element.wrap("<span></spam>");  // invalid HTML
    }

}