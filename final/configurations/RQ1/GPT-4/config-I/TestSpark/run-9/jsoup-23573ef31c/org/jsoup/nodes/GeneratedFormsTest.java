package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class GeneratedFormsTest {

    @Test
    public void formsTest() {
        Document doc = Document.createShell("http://example.com");
        Element form = doc.body().appendElement("form");
        form.attr("name", "testForm");
        List<FormElement> forms = doc.forms();
        assertEquals(forms.size(), 1);
    }

}