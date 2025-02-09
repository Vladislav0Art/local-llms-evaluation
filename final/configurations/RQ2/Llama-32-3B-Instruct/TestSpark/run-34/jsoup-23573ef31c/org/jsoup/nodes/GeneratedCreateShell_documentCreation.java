package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

@RunWith(JUnit4.class)
public class GeneratedCreateShell_documentCreation {

    @Test
    public void createShell_documentCreation() {
        Document document = Document.createShell("https://example.com");
        assertNotNull(document);
    }

}