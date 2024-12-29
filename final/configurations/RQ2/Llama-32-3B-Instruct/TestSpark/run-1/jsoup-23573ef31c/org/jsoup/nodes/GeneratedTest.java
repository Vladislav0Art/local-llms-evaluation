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
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;

import javax.annotation.Nullable;

public class GeneratedTest {

    @Test
    public void createShell_[
    EmptyDocument]

    Test() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertNotNull(document);
    }

    @Test
    public void createShell_[
    AlreadyExistingConnection]

    Test() {
        String baseUri = "https://example.com";
        Connection connection = Jsoup.connect(baseUri).get();
        Document document = Document.createShell(connection);
        assertEquals(connection, document.connection());
    }

    @Test
    public void location_[
    DocumentWithoutLocation]

    Test() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertNull(document.location());
    }

    @Test
    public void connection_[
    EmptyConnection]

    Test() {
        Connection connection = Jsoup.connect();
        Document document = Document.connection(connection);
        assertNotNull(document);
        assertEquals(connection, document.connection());
    }

    @Test
    public void documentType_[
    NoDocumentType]

    Test() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertNull(document.documentType());
    }

    @Test
    public void head_[
    EmptyHead]

    Test() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        Element head = document.head();
        assertTrue(head != null && head.tagName().equals("head"));
    }

    @Test
    public void body_[
    EmptyBody]

    Test() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        Element body = document.body();
        assertTrue(body != null && body.tagName().equals("body"));
    }

    @Test
    public void forms_[
    NoForms]

    Test() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        List<FormElement> forms = document.forms();
        assertTrue(forms.isEmpty());
    }

    @Test
    public void expectForm_[
    EmptyFormQuery]

    Test() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        FormElement form = document.expectForm("");
        assertNotNull(form);
    }

    @Test
    public void title_[
    NoTitle]

    Test() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        String title = document.title();
        assertNull(title);
    }

    @Test
    public void createElement_[
    EmptyTagName]

    Test() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        Element element = document.createElement("");
        assertNotNull(element);
        assertTrue(element.tagName().equals(""));
    }

    @Test
    public void outerHtml_[
    EmptyDocument]

    Test() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        String html = document.outerHtml();
        assertTrue(html.isEmpty());
    }

    @Test
    public void text_[
    NoText]

    Test() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        String text = document.text("");
        assertTrue(text.isEmpty());
    }

    @Test
    public void nodeName_[
    EmptyNodeName]

    Test() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        String node = document.nodeName();
        assertTrue(node.isEmpty());
    }

    @Test
    public void charset_[
    NoCharset]

    Test() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        Charset charset = document.charset();
        assertNull(charset);
    }

    @Test
    public void updateMetaCharsetElement_[
    False]

    Test() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        boolean update = document.updateMetaCharsetElement();
        assertFalse(update);
    }

    @Test
    public void outputSettings_[
    NoOutputSettings]

    Test() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        OutputSettings settings = document.outputSettings();
        assertNull(settings);
    }

    @Test
    public void quirksMode_[
    DefaultQuirksMode]

    Test() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        QuirksMode mode = document.quirksMode();
        assertEquals(QuirksMode.CRUSH, mode);
    }

    @Test
    public void parser_[
    DefaultParser]

    Test() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        Parser parser = document.parser();
        assertNotNull(parser);
        assertTrue(parser instanceof org.jsoup.parser.Parser);
    }

}