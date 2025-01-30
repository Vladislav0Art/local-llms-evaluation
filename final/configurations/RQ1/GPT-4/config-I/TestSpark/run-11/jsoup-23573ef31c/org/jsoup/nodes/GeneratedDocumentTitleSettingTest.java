package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedDocumentTitleSettingTest {

    @Test
    public void DocumentTitleSettingTest() {
        String baseUri = "http://www.google.com";
        Document doc = Document.createShell(baseUri);
        String titleContent = "Google";
        doc.title(titleContent);
        Assert.assertEquals(doc.title(), titleContent);
    }

}