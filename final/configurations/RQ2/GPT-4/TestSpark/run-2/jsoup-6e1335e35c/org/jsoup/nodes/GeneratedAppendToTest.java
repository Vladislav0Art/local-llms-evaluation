package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAppendToTest {

    @Test
    public void appendToTest() {
        Element e1 = new Element("div");
        Element e2 = new Element("p");
        e2.appendTo(e1);
        assertSame(e2, e1.child(0));
    }

}