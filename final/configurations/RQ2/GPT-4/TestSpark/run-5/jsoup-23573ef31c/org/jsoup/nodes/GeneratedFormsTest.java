package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedFormsTest {

    @Test
    public void formsTest() {
        Document document = new Document("http://example.com");
        List<FormElement> forms = document.forms();
        assertNotNull(forms);
        assertTrue(forms.isEmpty());
    }

}