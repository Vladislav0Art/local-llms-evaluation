package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedOuterHtmlMethodEmptyDocumentTest {

    @Test
    public void outerHtmlMethodEmptyDocumentTest() {
        Document document = Document.createShell("https://www.example.com");
        String html = document.outerHtml();
        assertTrue(html.isEmpty());
    }

}