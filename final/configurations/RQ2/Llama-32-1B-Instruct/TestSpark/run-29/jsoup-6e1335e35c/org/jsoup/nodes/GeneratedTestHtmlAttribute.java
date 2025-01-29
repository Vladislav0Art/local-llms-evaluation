package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestHtmlAttribute {

    @Test
    public void testHtmlAttribute() {
        Element element = new Element();
        element.setAttribute("href", "https://www.example.com");
        assertEquals("https://www.example.com", element.attrValue("href"));
    }

}