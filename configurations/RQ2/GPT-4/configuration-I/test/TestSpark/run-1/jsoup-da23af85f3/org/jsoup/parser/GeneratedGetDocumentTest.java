package org.jsoup.parser;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedGetDocumentTest {

    @Test
    public void getDocumentTest() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        assertNotNull(treeBuilder.getDocument());
    }

}