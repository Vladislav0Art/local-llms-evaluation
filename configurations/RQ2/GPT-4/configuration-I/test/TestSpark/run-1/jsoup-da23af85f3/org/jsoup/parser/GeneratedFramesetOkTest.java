package org.jsoup.parser;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedFramesetOkTest {

    @Test
    public void framesetOkTest() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        treeBuilder.framesetOk(true);
        assertTrue(treeBuilder.framesetOk());
    }

}