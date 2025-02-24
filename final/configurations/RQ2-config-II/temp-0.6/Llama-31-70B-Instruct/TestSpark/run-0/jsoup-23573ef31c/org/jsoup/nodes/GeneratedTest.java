package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.select.Elements;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import java.nio.charset.Charset;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void createShellReturnsDocumentWithSpecifiedBaseUriTest() {
        String baseUri = "http://jsoup.org";
        Document document = Document.createShell(baseUri);
        assertEquals(baseUri, document.location());
    }

    @Test
    public void createShellReturnsDocumentWithNullDocumentTypeTest() {
        Document document = Document.createShell("http://jsoup.org");
        assertNull(document.documentType());
    }

    @Test
    public void createShellReturnsDocumentWithHeadAndBodyElementsTest() {
        Document document = Document.createShell("http://jsoup.org");
        assertEquals("head", document.head().nodeName());
        assertEquals("body", document.body().nodeName());
    }

    @Test
    public void createShellReturnsDocumentWithEmptyTitleTest() {
        Document document = Document.createShell("http://jsoup.org");
        assertEquals("", document.title());
    }

    @Test
    public void createShellReturnsDocumentWithEmptyCharsetTest() {
        Document document = Document.createShell("http://jsoup.org");
        assertNull(document.charset());
    }

}