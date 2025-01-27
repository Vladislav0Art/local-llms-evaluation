package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedLocationMethodEmptyDocumentTest {

    @Test
    public void locationMethodEmptyDocumentTest() {
        Document document = Document.createShell("https://www.example.com");
        assertEquals("", document.location());
    }

}