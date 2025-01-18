package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;
import org.jsoup.parser.Tag;

import java.util.Collections;

import static org.junit.Assert.*;

public class GeneratedAppendTest {

    @Test
    public void appendTest() {
        Element element = new Element(Tag.valueOf("p"), "http://www.test.com");
        Element result = element.append("<span>Test</span>");
        assertEquals("<p><span>Test</span></p>", result.toString());
    }

}