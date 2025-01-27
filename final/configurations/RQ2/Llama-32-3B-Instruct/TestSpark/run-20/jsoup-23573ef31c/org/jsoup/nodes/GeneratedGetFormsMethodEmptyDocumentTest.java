package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedGetFormsMethodEmptyDocumentTest {

    @Test
    public void getFormsMethodEmptyDocumentTest() {
        Document document = Document.createShell("https://www.example.com");
        List<FormElement> forms = document.forms();
        assertTrue(forms.isEmpty());
    }

}