package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSelectTest {

    @Test
    public void selectTest() {
        Element e = new Element("div");
        Element p = new Element("p");
        e.appendChild(p);
        Elements result = e.select("p");
        assertSame(p, result.get(0));
    }

}