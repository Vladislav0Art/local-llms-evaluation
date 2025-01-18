package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPrependChildTest {

    @Test
    public void prependChildTest() {
        Element e = new Element("div");
        Element p = new Element("p");
        e.prependChild(p);
        assertSame(p, e.child(0));
    }

}