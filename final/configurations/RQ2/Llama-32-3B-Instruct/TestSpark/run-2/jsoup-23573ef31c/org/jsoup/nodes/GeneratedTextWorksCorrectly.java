package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class GeneratedTextWorksCorrectly {

    @Test
    public void textWorksCorrectly() {
        Document document = Document.createShell("http://example.com");
        document.text("Hello World!");
        assertEquals("Hello World!", document.text());
    }

}