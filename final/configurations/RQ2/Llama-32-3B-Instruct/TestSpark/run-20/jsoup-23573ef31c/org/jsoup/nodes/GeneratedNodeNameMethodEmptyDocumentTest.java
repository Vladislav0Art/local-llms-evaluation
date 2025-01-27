package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedNodeNameMethodEmptyDocumentTest {

    @Test
    public void nodeNameMethodEmptyDocumentTest() {
        Document document = Document.createShell("https://www.example.com");
        String node = document.nodeName();
        assertTrue(node.isEmpty());
    }

}