package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveAttr_test {

    @Test
    public void removeAttr_test() {
        Element element = new Element("test");
        assertEquals(null, element.removeAttr("attr"));
    }

}