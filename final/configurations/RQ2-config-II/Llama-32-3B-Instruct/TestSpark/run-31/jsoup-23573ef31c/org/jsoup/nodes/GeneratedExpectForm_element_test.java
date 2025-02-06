package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedExpectForm_element_test {

    @Test
    public void expectForm_element_test() {
        Document document = Document.createShell("http://example.com");
        FormElement form = document.expectForm("*");
        assertNotNull(form);
        assertTrue(form instanceof FormElement);
    }

}