package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;
import org.jsoup.parser.Tag;

import java.util.Collections;

import static org.junit.Assert.*;

public class GeneratedInsertChildrenTest {

    @Test
    public void insertChildrenTest() {
        Element parent = new Element(Tag.valueOf("div"), "http://www.test.com");
        Element child1 = new Element(Tag.valueOf("p"), "http://www.test.com");
        Element child2 = new Element(Tag.valueOf("span"), "http://www.test.com");
        parent.insertChildren(0, Collections.singletonList(child1));
        parent.insertChildren(0, Collections.singletonList(child2));
        assertEquals("<div><span></span><p></p></div>", parent.toString());
    }

}