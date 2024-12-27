package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Tag;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.DataNode;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Range;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class GeneratedTest {

    @Test
    public void tagNameTest() {
        Element element = new Element(Tag.valueOf("div"));
        assertEquals("div", element.tagName());
    }

    @Test
    public void tagNameTest_SetTagName() {
        Element element = new Element(Tag.valueOf("div"));
        element.tagName("span");
        assertEquals("span", element.tagName());
    }

    @Test
    public void normalNameTest() {
        Element element = new Element(Tag.valueOf("div"));
        assertEquals("div", element.normalName());
    }

    @Test
    public void isBlockTest() {
        Element element = new Element(Tag.valueOf("div"));
        assertFalse(element.isBlock());
    }

    @Test
    public void idTest() {
        Element element = new Element(Tag.valueOf("div"));
        assertNull(element.id());
    }

    @Test
    public void idTest_SetId() {
        Element element = new Element(Tag.valueOf("div"));
        element.id("myId");
        assertEquals("myId", element.id());
    }

    @Test
    public void attrTest() {
        Element element = new Element(Tag.valueOf("div"));
        assertNull(element.attr("class"));
    }

    @Test
    public void attrTest_SetAttr() {
        Element element = new Element(Tag.valueOf("div"));
        element.attr("class", "myClass");
        assertEquals("myClass", element.attr("class"));
    }

    @Test
    public void attrTest_SetAttrBoolean() {
        Element element = new Element(Tag.valueOf("div"));
        element.attr("checked", true);
        assertTrue(element.attr("checked"));
    }

    @Test
    public void datasetTest() {
        Element element = new Element(Tag.valueOf("div"));
        assertNull(element.dataset());
    }

    @Test
    public void parentTest() {
        Element element = new Element(Tag.valueOf("div"));
        assertNull(element.parent());
    }

}