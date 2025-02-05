package org.jsoup.nodes;

import org.jsoup.helper.AttributeChangeListener;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedAppendChildrenTest {

    @Test
    public void appendChildrenTest() {
        Element parent = new Element("div");
        Element child1 = new Element("p");
        Element child2 = new Element("span");
        parent.appendChildren(Arrays.asList(child1, child2));
        assertTrue(parent.childNodeSize() == 2);
        assertEquals(parent.child(0), child1);
        assertEquals(parent.child(1), child2);
    }

}