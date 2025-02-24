package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedFormsTest {

    @Test
    public void formsTest() {
        Document document = Document.createShell("www.example.com");
        List<FormElement> forms = mock(ArrayList.class);
        when(document.forms()).thenReturn(forms);
        assertEquals(forms, document.forms());
    }

}