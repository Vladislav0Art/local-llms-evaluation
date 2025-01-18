package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedTest {

    @Test
    public void createShellExistingUriTest() {
        Document document = Document.createShell("https://www.google.com");
        Assert.assertNotNull(document);
    }

    @Test
    public void locationTest() {
        Document document = new Document("https://www.google.com");
        String location = document.location();
        Assert.assertEquals("https://www.google.com", location);
    }

    @Test
    public void connectionTest() {
        Document document = new Document("https://www.google.com");
        Connection connection = document.connection();
        Assert.assertNotNull(connection);
    }

    @Test
    public void documentTypeTest() {
        Document document = new Document("https://www.google.com");
        DocumentType documentType = document.documentType();
        Assert.assertNull(documentType);
    }

    @Test
    public void headElementTest() {
        Document document = new Document("https://www.google.com");
        Element head = document.head();
        Assert.assertNull(head);
    }

    @Test
    public void bodyElementTest() {
        Document document = new Document("https://www.google.com");
        Element body = document.body();
        Assert.assertNull(body);
    }

    @Test
    public void formsTest() {
        Document document = new Document("https://www.google.com");
        List<FormElement> forms = document.forms();
        Assert.assertTrue(forms.isEmpty());
    }

    @Test
    public void titleTest() {
        Document document = new Document("https://www.google.com");
        String title = document.title();
        Assert.assertEquals("", title);
    }

    @Test
    public void createElementTest() {
        Document document = new Document("https://www.google.com");
        Element element = document.createElement("div");
        Assert.assertEquals("<div></div>", element.toString());
    }

    @Test
    public void charsetTest() {
        Document document = new Document("https://www.google.com");
        document.charset(StandardCharsets.UTF_8);
        Assert.assertEquals(StandardCharsets.UTF_8, document.charset());
    }

    @Test
    public void outputSettingsTest() {
        Document document = new Document("https://www.google.com");
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        document.outputSettings(outputSettings);
        Assert.assertEquals(outputSettings, document.outputSettings());
    }

    @Test
    public void cloneTest() {
        Document document = new Document("https://www.google.com");
        Document clone = document.clone();
        Assert.assertEquals(document.outerHtml(), clone.outerHtml());
    }

}