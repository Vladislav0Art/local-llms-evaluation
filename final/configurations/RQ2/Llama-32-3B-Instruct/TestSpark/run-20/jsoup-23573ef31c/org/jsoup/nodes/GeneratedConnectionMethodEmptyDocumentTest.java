package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedConnectionMethodEmptyDocumentTest {

    @Test
    public void connectionMethodEmptyDocumentTest() {
        Document document = Document.createShell("https://www.example.com");
        assertNull(document.connection());
    }

}