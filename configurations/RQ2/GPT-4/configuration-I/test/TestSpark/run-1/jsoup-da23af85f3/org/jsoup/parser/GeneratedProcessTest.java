package org.jsoup.parser;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedProcessTest {

    @Test
    public void processTest() {
        HtmlTreeBuilder treeBuilder = new HtmlTreeBuilder();
        Token.StartTag token = new Token.StartTag();
        token.nameAttr("test", new Attributes());
        assertTrue(treeBuilder.process(token));
    }

}