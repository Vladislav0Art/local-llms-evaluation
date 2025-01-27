package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class GeneratedTitleWorksCorrectly {

    @Test
    public void titleWorksCorrectly() {
        Document document = Document.createShell("http://example.com");
        assertEquals("", document.title());
    }

}