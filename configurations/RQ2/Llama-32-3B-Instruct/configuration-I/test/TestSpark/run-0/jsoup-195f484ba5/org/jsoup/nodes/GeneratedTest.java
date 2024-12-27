package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void tagName_TagNameTest() {
        Element element = new Element("tag");
        assertEquals("tag", element.tagName());
    }

    @Test
    public void tagName_NameTag() {
        Element element = new Element();
        assertNull(element.tagName());
    }

    @Test
    public void text_Text() {
        Element element = new Element();
        assertEquals("", element.text());
    }

    @Test
    public void text_TextWithValue() {
        Element element = new Element();
        element.text("value");
        assertEquals("value", element.text());
    }

    @Test
    public void wholeText_WholeText() {
        Element element = new Element();
        element.append("before");
        element.append("after");
        assertEquals("beforeafter", element.wholeText());
    }

    @Test
    public void append_AppendElement() {
        Element element = new Element();
        Elements elements = new Elements();
        elements.add(element);
        element.append(elements);
        assertNotNull(element.children().get(0));
    }

    @Test
    public void append_AppendText() {
        Element element = new Element();
        element.append("text");
        assertEquals("text", element.text());
    }

    @Test
    public void html_Html() {
        Element element = new Element();
        element.html("<div>test</div>");
        assertEquals("<div>test</div>", element.html());
    }

    @Test
    public void outerHtmlTail_OuterHtmlTail() throws IOException {
        Element element = new Element();
        Appendable appendable = new StringBuilder();
        element.outerHtmlHead(appendable, 0, null);
        element.outerHtmlTail(appendable, 1, null);
        assertEquals("<div>test</div>", appendable.toString());
    }

    @Test
    public void outerHtmlHead_OuterHtmlHead() throws IOException {
        Element element = new Element();
        Appendable appendable = new StringBuilder();
        element.outerHtmlHead(appendable, 0, null);
        assertEquals("<html><body></body></html>", appendable.toString());
    }

    @Test
    public void clone_CloneElement() {
        Element element = new Element();
        Element cloned = element.clone();
        assertNotNull(cloned);
    }

    @Test
    public void shallowClone_ShallowCloneElement() {
        Element element = new Element();
        Element cloned = element.shallowClone();
        assertNotNull(cloned);
    }

}