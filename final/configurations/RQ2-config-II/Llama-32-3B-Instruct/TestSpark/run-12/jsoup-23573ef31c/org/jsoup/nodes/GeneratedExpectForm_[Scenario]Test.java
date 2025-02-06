package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedExpectForm_[Scenario]

Test {

    @Test
    public void expectForm_[ Scenario]Test() {
        Document document = Document.createShell("https://example.com");
        FormElement form = document.expectForm("form");
        assertNotNull(form);
    }

}