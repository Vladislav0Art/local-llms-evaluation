package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedDocumentExpectForm {

    @Test
    public void documentExpectForm() {
        Document document = Document.createShell("https://www.example.com");
        FormElement form = new FormElement();
        assertEquals(form, document.expectForm(".form"));
    }

}