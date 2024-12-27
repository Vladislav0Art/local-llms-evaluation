package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetElementsByClass_test {

    @Test
    public void getElementsByClass_test() {
        Element element = new Element("test");
        element.addClass("class1");
        assertEquals(1, element.getElementsByClass("class1").size());
    }

}