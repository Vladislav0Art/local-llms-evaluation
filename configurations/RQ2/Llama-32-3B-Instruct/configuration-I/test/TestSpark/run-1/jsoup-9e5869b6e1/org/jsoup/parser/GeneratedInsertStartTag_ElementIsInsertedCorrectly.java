package org.jsoup.parser;

import org.jsoup.parser.HtmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedInsertStartTag_ElementIsInsertedCorrectly {

    @Test
    public void insertStartTag_ElementIsInsertedCorrectly() {
        HtmlTreeBuilder builder = new HtmlTreeBuilder();
        Element element = new Element();
        assertEquals(element, builder.insertStartTag("tag"));
    }

}