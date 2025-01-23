package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.DataNode;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeVisitor;
import org.jsoup.select.QueryParser;
import org.jsoup.select.Selector;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void tagNameTest() {
        Element element = new Element("div");
        assertEquals("div", element.tagName());
    }

    @Test
    public void tagNameTest_TagNameProvided() {
        Element element = new Element("div");
        element.tagName("newTagName");
        assertEquals("newTagName", element.tagName());
    }

    @Test
    public void isBlockTest() {
        Element element = new Element("div");
        assertFalse(element.isBlock());
    }

    @Test
    public void idTest() {
        Element element = new Element("div");
        assertEquals("", element.id());
    }

    @Test
    public void idTest_IdProvided() {
        Element element = new Element("div");
        element.id("newId");
        assertEquals("newId", element.id());
    }

    @Test
    public void attrTest() {
        Element element = new Element("div");
        element.attr("key", "value");
        assertEquals("value", element.attr("key"));
    }

    @Test
    public void attrTest_BooleanValue() {
        Element element = new Element("div");
        element.attr("key", "true");
        assertTrue(Boolean.parseBoolean(element.attr("key")));
    }

    @Test
    public void datasetTest() {
        Element element = new Element("div");
        Map<String, String> dataset = element.dataset();
        assertNotNull(dataset);
    }

}