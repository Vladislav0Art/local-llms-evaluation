package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedFormsTest {

    @Test
    public void formsTest() {
        Document document = Document.createShell("http://example.com");
        assertEquals(document.forms().size(), 0);
    }

}