package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.nio.charset.Charset;

public class GeneratedTest {

    @Test
    public void testCreateShell_EmptyBaseUri() {
        String baseUri = "";
        assertThrows(NullPointerException.class, () -> Document.createShell(baseUri));
    }

    @Test
    public void testLocation_Absent() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertNull(document.location());
    }

    @Test
    public void testConnection_Absent() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertNull(document.connection());
    }

    @Test
    public void testHead_Absent() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertNull(document.head());
    }

    @Test
    public void testBody_Absent() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertNull(document.body());
    }

    @Test
    public void testForms_Absent() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertThrows(NullPointerException.class, () -> document.forms());
    }

    @Test
    public void testSetTitle_Present() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        document.setTitle("Test Title");
        assertEquals("Test Title", document.title());
    }

    @Test
    public void testCreateElement_Absent() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertThrows(NullPointerException.class, () -> document.createElement(""));
    }

    @Test
    public void testOuterHtml_Absent() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertNull(document.outerHtml());
    }

    @Test
    public void testText_Ansent() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertNull(document.text(""));
    }

    @Test
    public void testNodeName_Absent() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertNull(document.nodeName());
    }

    @Test
    public void testCharset_Ansent() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertThrows(NullPointerException.class, () -> document.charset(null));
    }

    @Test
    public void testUpdateMetaCharsetElement_Present() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        boolean update = true;
        document.updateMetaCharsetElement(update);
        assertTrue(update);
    }

    @Test
    public void testShallowClone_Absent() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertThrows(NullPointerException.class, () -> document.shallowClone());
    }
}

}