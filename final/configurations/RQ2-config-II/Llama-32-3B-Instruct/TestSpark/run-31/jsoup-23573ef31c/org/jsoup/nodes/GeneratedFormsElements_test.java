package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedFormsElements_test {

    @Test
    public void formsElements_test() {
        Document document = Document.createShell("http://example.com");
        List<FormElement> forms = document.forms();
        assertFalse(forms.isEmpty());
        assertTrue(forms.size() > 0);
    }

}