package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedDocumentLocation {

    @Test
    public void documentLocation() {
        Document document = Document.createShell("https://www.example.com");
        assertEquals("https://www.example.com", document.location());
    }

}