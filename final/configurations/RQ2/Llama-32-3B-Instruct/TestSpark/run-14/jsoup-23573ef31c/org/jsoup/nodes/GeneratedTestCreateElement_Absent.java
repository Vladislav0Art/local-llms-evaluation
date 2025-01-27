package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.nio.charset.Charset;

public class GeneratedTestCreateElement_Absent {

    @Test
    public void testCreateElement_Absent() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertThrows(NullPointerException.class, () -> document.createElement(""));
    }

}