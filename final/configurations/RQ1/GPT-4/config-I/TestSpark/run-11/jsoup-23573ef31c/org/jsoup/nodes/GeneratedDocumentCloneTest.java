package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedDocumentCloneTest {

    @Test
    public void DocumentCloneTest() {
        String baseUri = "http://www.google.com";
        Document doc = Document.createShell(baseUri);
        Document docCloned = doc.clone();
        Assert.assertEquals(doc.outerHtml(), docCloned.outerHtml());
    }

}