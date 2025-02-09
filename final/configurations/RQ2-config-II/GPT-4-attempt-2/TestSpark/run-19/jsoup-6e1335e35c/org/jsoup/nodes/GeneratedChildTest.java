package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.Collections;

public class GeneratedChildTest {

    @Test
    public void childTest() {
        Element parent = new Element("parent");
        Element child = new Element("child");
        parent.appendChild(child);
        assertEquals(child, parent.child(0));
    }

}