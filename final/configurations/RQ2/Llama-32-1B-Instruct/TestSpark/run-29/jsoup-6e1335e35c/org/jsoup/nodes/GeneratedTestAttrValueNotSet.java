package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestAttrValueNotSet {

    @Test
    public void testAttrValueNotSet() {
        Element element = new Element();
        assertNull(element.attrValue("non-existentAttribute"));
    }

}