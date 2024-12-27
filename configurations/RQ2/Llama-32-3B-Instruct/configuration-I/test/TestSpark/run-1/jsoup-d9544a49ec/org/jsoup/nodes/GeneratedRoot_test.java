package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRoot_test {

    @Test
    public void root_test() {
        Element element = new Element("test");
        assertEquals(element, element.root());
    }

}