package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedShallowCloneMethodEmptyDocumentTest {

    @Test
    public void shallowCloneMethodEmptyDocumentTest() {
        Document document = Document.createShell("https://www.example.com");
        Document clonedDocument = document.shallowClone();
        assertNotNull(clonedDocument);
    }

}