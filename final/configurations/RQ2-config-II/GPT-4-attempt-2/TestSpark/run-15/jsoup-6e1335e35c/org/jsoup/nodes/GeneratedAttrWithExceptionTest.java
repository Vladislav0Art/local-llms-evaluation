package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAttrWithExceptionTest {

    @Test
    public void attrWithExceptionTest() {
        Element element = new Element("div");
        element.attr(null, null);
    }

}