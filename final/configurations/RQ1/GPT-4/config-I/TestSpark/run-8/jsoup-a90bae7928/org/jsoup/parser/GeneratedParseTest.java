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

public class GeneratedParseTest {

    @Test
    public void parseTest() throws Exception {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document doc = treeBuilder.parse("<test>Test Content</test>", "Base url.");
        assertEquals("<test>Test Content</test>", doc.body().html());
    }

}