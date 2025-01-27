package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;

import javax.annotation.Nullable;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;

public class GeneratedTest {

    public static void main(String[] args) {
        System.out.println("Running " + new java.util.Scanner(System.in).nextLine());
    }

    @Test
    public void createShell_SimpleDocument() {
        Document document = Document.createShell("https://example.com");
        assertNotNull(document);
    }

    @Test
    public void location_EmptyDocument() {
        Document document = Document.createShell("");
        assertNull(document.location());
    }

    @Test
    public void connection_NullConnection() {
        Connection connection = null;
        Document document = Document.createShell("https://example.com");
        document.connection(connection);
    }

    @Test
    public void createElement_NonEmptyTag() {
        Element element = new Element();
        Document document = new Document();
        Element createdElement = document.createElement("div");
        assertNotNull(createdElement);
    }

    @Test
    public void createElement_InvalidTag() {
        try {
            Document document = new Document();
            Element createdElement = document.createElement(":tag");
            fail("Expected exception");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void text_EmptyText() {
        Document document = new Document();
        Element element = document.createElement("p");
        assertEquals("", element.text());
    }

    @Test
    public void title_NullTitle() {
        Document document = new Document();
        document.title(null);
    }

    @Test
    public void charset_NullCharset() {
        Charset charset = null;
        Document document = new Document();
        document.charset(charset);
    }

    @Test
    public void expectForm_EmptyQuery() {
        Document document = new Document();
        FormElement form = document.forms().get(0);
        assertNull(form.expectForm(""));
    }

    @Test
    public void createElement_NegativeTagName() {
        try {
            Document document = new Document();
            Element createdElement = document.createElement(-1);
            fail("Expected exception");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void createElement_InvalidCharacterInTag() {
        String invalidChar = "";
        try {
            Document document = new Document();
            Element createdElement = document.createElement(invalidChar);
            fail("Expected exception");
        } catch (Exception e) {
            // expected
        }
    }

    @Test
    public void outerHtml_EmptyDocument() {
        Document document = new Document();
        assertEquals("", document.outerHtml());
    }

    @Test
    public void createElement_EmptyTextContent() {
        Element element = document.createElement("p");
        assertEquals("", element.text());
    }

    @Test
    public void createElement_NonEmptyTextContent() {
        String text = "Hello World";
        Element element = new Document().createElement();
        assertNotNull(element);
        element.text(text);
    }

    @Test
    public void createElement_NonEmptyAttributes() {
        Element element = document.createElement("a");
        assertEquals(0, element.attributes().size());
    }
}

public class FormElement extends org.jsoup.nodes.Element {

    public FormElement() {
    }

    public String expectForm(String cssQuery) {
        return null;
    }
}

}