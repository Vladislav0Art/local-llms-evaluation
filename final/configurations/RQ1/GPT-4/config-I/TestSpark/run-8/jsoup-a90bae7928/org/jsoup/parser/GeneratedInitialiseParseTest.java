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

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() throws NoSuchFieldException, IllegalAccessException {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.initialiseParse(new StringReader("<test>Test Content</test>"), "http://example.com", Parser.xmlParser());
        Field stackField = TreeBuilder.class.getDeclaredField("stack");
        stackField.setAccessible(true);
        @SuppressWarnings("unchecked")
        List<Element> stack = (List<Element>) stackField.get(treeBuilder);
        assertTrue(stack.contains(treeBuilder.getDocument()));
    }

}