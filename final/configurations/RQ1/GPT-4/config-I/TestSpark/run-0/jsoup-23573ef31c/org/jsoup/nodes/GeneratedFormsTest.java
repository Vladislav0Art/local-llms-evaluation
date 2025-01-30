package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedFormsTest {

    @Test
    public void formsTest() {
        Document doc = new Document("");
        List<Document.FormElement> forms = doc.forms();

        assertNotNull(forms);
        assertTrue(forms.isEmpty());
    }

}