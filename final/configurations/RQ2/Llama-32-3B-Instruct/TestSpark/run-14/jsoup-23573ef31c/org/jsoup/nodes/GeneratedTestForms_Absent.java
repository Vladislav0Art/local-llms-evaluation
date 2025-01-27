package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.nio.charset.Charset;

public class GeneratedTestForms_Absent {

    @Test
    public void testForms_Absent() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertThrows(NullPointerException.class, () -> document.forms());
    }

}