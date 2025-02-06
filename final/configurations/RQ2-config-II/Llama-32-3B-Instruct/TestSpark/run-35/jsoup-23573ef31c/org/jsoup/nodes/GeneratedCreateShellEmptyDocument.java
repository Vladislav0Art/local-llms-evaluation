package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedCreateShellEmptyDocument {

    @Test
    public void createShellEmptyDocument() {
        String baseUri = "";
        Document document = Document.createShell(baseUri);
        assertEquals("", document.outerHtml());
    }

}