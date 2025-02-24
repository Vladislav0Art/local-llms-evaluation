package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.Connection;
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

    private Document document;

    @Before
    public void setUp() {
        document = new Document("http://example.com/");
    }

    @Test
    public void testLocation() {
        assertEquals("http://example.com/", document.location());
    }

    @Test
    public void testConnection() {
        assertEquals(null, document.connection());
    }

    @Test
    public void testDocumentType() {
        assertEquals(null, document.documentType());
    }

    @Test
    public void testHead() {
        Element head = document.head();
        assertEquals("head", head.tagName());
    }

    @Test
    public void testBody() {
        Element body = document.body();
        assertEquals("body", body.tagName());
    }

    @Test
    public void testForms() {
        List<FormElement> forms = document.forms();
        assertTrue(forms.isEmpty());
    }

    @Test
    public void testExpectForm() {
        document.expectForm("");
    }

    @Test
    public void testTitle() {
        assertEquals("", document.title());
    }

}