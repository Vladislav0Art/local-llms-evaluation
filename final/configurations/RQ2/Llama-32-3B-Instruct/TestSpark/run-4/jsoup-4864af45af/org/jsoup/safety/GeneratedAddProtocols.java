package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedAddProtocols {

    @Test
    public void addProtocols() {
        Safelist basicWithImg = Safelist.addTags(Safelist.basicWithImages(), "img");
        Safelist withHttpOnly = Safelist.addProtocols(basicWithImg, "onload", "http-only;");
        assertEquals("http-only;", ((Attributes) withHttpOnly.getEnforcedAttributes("img")).getValue("onload"));
    }

}