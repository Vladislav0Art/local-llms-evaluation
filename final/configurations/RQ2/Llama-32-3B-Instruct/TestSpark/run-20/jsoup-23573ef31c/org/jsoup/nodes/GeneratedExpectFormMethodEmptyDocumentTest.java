package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedExpectFormMethodEmptyDocumentTest {

    @Test
    public void expectFormMethodEmptyDocumentTest() {
        Document document = Document.createShell("https://www.example.com");
        FormElement form = document.expectForm("");
        assertNotNull(form);
        assertFalse(form.matches(""));
    }

}