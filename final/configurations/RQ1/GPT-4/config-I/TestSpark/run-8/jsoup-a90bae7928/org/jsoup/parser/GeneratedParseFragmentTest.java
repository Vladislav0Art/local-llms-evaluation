package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.*;
import org.junit.Assert;

import static org.junit.Assert.*;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.List;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() throws Exception {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        List<Node> nodes = treeBuilder.parseFragment("<fruit>Apple</fruit>", "Base url.", Parser.xmlParser());
        Document expected = Parser.xmlParser().parseInput("<fruit>Apple</fruit>", "Base url.");
        assertEquals(expected.child(0).outerHtml(), nodes.get(0).outerHtml());
    }

}