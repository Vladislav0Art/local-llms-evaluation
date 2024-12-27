package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetElementsByTag_test {

    @Test
    public void getElementsByTag_test() {
        Element element = new Element("test");
        assertEquals(1, element.getElementsByTag("tag").size());
    }

}