package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedFormsTest {

    @Test
    public void formsTest() {
        Document document = new Document("http://example.com");
        List<FormElement> forms = document.forms();
        assertNotNull(forms);
        assertTrue(forms.isEmpty());
    }

}