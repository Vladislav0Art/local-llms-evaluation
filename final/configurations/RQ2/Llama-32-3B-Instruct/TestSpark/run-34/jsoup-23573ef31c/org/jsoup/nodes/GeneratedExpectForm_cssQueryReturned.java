package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

@RunWith(JUnit4.class)
public class GeneratedExpectForm_cssQueryReturned {

    @Test
    public void expectForm_cssQueryReturned() {
        Document document = Document.createShell("https://example.com");
        FormElement form = document.expectForm("form");
        assertNotNull(form);
    }

}