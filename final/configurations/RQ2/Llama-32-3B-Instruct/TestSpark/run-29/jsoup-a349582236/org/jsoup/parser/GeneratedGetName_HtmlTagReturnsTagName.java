package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGetName_HtmlTagReturnsTagName {

    @Test
    public void getName_HtmlTagReturnsTagName() {
        String name = new Tag("<div>").getName();
        assertEquals("div", name);
    }

}