package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedFormsTest {

    private static final String BASE_URI = "http://example.com/";

    @Test
    public void formsTest() {
        Document document = new Document(BASE_URI);
        List<FormElement> forms = document.forms();
        assertTrue(forms.isEmpty());
    }

}