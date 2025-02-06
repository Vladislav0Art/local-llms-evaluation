package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;

public class GeneratedTest {

    @Test
    public void createShell[]

    Test() {
        Document doc = Document.createShell("https://jsoup.org/");
        assertNotNull(doc);
    }

    @Test
    public void createShellEmptyBaseUri[]

    Test() {
        Document doc = Document.createShell("");
        assertNull(doc);
    }

    @Test
    public void location[]

    Test() {
        Document doc = Jsoup.connect("https://jsoup.org/").get();
        assertNotNull(doc.location());
    }

    @Test
    public void connection[]

    Test() {
        Connection conn = Jsoup.connect("https://jsoup.org/");
        assertSame(conn, ((Document) conn).connection());
    }

    @Test
    public void documentType[]

    Test() {
        Document doc = Jsoup.connect("https://jsoup.org/").get();
        assertNotNull(doc.documentType());
    }

    @Test
    public void head[]

    Test() {
        Document doc = Jsoup.connect("https://jsoup.org/").get();
        assertNotNull(doc.head());
    }

    @Test
    public void body[]

    Test() {
        Document doc = Jsoup.connect("https://jsoup.org/").get();
        assertNotNull(doc.body());
    }

    @Test
    public void forms[]

    Test() {
        Document doc = Jsoup.connect("https://jsoup.org/").get();
        List<FormElement> forms = doc.forms();
        assertTrue(forms != null);
    }

    @Test
    public void expectForm[]

    Test() {
        Document doc = Jsoup.connect("https://jsoup.org/").get();
        FormElement form = doc.expectForm("form");
        assertNotNull(form);
    }

    @Test
    public void title[]

    Test() {
        Document doc = Jsoup.connect("https://jsoup.org/").get();
        String title = doc.title();
        assertNotNull(title);
    }

    @Test
    public void titleSet[]

    Test() {
        Document doc = Jsoup.connect("https://jsoup.org/").get();
        doc.title("New Title");
        assertEquals("New Title", doc.title());
    }

    @Test
    public void createElement[]

    Test() {
        Document doc = Jsoup.connect("https://jsoup.org/").get();
        Element element = doc.createElement("div");
        assertNotNull(element);
    }

    @Test
    public void outerHtml[]

    Test() {
        String html = "<html><body>Hello World!</body></html>";
        Document doc = Jsoup.parse(html).getDocument();
        assertEquals(html, doc.outerHtml());
    }

    @Test
    public void text[]

    Test() {
        String html = "<p>Hello World!</p>";
        Document doc = Jsoup.parse(html).getDocument();
        Element element = doc.text("Hello");
        assertNotNull(element);
        assertEquals("<p>Hello World!</p>", element.outerHtml());
    }

    @Test
    public void nodeName[]

    Test() {
        Document doc = Jsoup.connect("https://jsoup.org/").get();
        String nodeName = doc.nodeName();
        assertNotNull(nodeName);
    }

    @Test
    public void charsetSet[]

    Test() {
        Document doc = Jsoup.connect("https://jsoup.org/").get();
        Charset charset = Charset.forName("UTF-8");
        doc.charset(charset);
        assertEquals(charset, doc.charset());
    }

    @Test
    public void updateMetaCharsetElement[]

    Test() {
        Document doc = Jsoup.connect("https://jsoup.org/").get();
        boolean updated = doc.updateMetaCharsetElement();
        assertTrue(updated);
    }

    @Test
    public void clone[]

    Test() {
        Document original = Jsoup.connect("https://jsoup.org/").get();
        Document cloned = original.clone();
        assertNotNull(cloned);
        assertEquals(original, cloned);
    }

    @Test
    public void shallowClone[]

    Test() {
        Document original = Jsoup.connect("https://jsoup.org/").get();
        Document cloned = original.shallowClone();
        assertNotNull(cloned);
        assertEquals(original, cloned);
    }

}