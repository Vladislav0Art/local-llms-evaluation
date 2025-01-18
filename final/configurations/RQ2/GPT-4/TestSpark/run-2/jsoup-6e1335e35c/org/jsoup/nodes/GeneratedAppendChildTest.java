package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAppendChildTest {

    @Test
    public void appendChildTest() {
        Element e = new Element("div");
        Element p = new Element("p");
        e.appendChild(p);
        assertSame(p, e.child(0));
    }

}