package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValTest {

    @Test
    public void valTest() {
        Element e = new Element("input");
        e.val("test");
        assertEquals("test", e.val());
    }

}