package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void createShell_[
    Scenario]

    Test() {
        Document document = Document.createShell("https://example.com");
        assertNotNull(document);
    }

    @Test
    public void connection_[
    Scenario]

    Test() {
        Connection connection = Mockito.mock(Connection.class);
        Document document = Document.connection(connection);
        assertTrue(document != null);
    }

    @Test
    public void location_[
    Scenario]

    Test() {
        String html = "<html><body>Hello World!</body></html>";
        Document document = Document.parse(html);
        assertEquals("https://example.com", document.location());
    }

    @Test
    public void head_[
    Scenario]

    Test() {
        String html = "<html><head><title>Example</title></head><body>Hello World!</body></html>";
        Document document = Document.parse(html);
        assertNotNull(document.head());
    }

    @Test
    public void body_[
    Scenario]

    Test() {
        String html = "<html><body>Hello World!</body></html>";
        Document document = Document.parse(html);
        assertNotNull(document.body());
    }

    @Test
    public void forms_[
    Scenario]

    Test() {
        String html = "<html><form></form><body>Hello World!</body></html>";
        Document document = Document.parse(html);
        assertNotNull(document.forms());
    }

    @Test
    public void expectForm_[
    Scenario]

    Test() {
        Document document = Document.createShell("https://example.com");
        FormElement form = document.expectForm("form");
        assertNotNull(form);
    }

    @Test
    public void title_[
    Scenario]

    Test() {
        String html = "<html><head><title>Example</title></head><body>Hello World!</body></html>";
        Document document = Document.parse(html);
        assertEquals("Example", document.title());
    }

    @Test
    public void createElement_[
    Scenario]

    Test() {
        Element element = Document.createElement("p");
        assertNotNull(element);
    }

    @Test
    public void outerHtml_[
    Scenario]

    Test() {
        String html = "<html><body>Hello World!</body></html>";
        Document document = Document.parse(html);
        assertEquals("<html><body>Hello World!</body></html>", document.outerHtml());
    }

    @Test
    public void text_[
    Scenario]

    Test() {
        Document document = Document.createShell("https://example.com");
        String text = document.text("Hello World!");
        assertEquals("Hello World!", text);
    }

    @Test
    public void nodeName_[
    Scenario]

    Test() {
        Element element = new Element();
        assertEquals("Element", element.nodeName());
    }

    @Test
    public void charset_[
    Scenario]

    Test() {
        Charset charset = Charset.forName("UTF-8");
        Document document = Document.createShell("https://example.com");
        document.charset(charset);
        assertEquals(charset, document.charset());
    }

    @Test
    public void updateMetaCharsetElement_[
    Scenario]

    Test() {
        Document document = Document.createShell("https://example.com");
        boolean updated = document.updateMetaCharsetElement();
        assertTrue(updated);
    }

}