package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedFormsTest {

    @Test
    public void formsTest() {
        String baseUri = "http://example.com";
        Document doc = new Document(baseUri);
        List<FormElement> forms = doc.forms();

        assertEquals(0, forms.size());
    }

}