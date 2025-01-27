package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedLocationMethodNonEmptyDocumentTest {

    @Test
    public void locationMethodNonEmptyDocumentTest() {
        Document document = Jsoup.connect("https://www.example.com").get().body();
        assertNotNull(document);
        String expectedLocation = "about:blank";
        assertEquals(expectedLocation, document.location());
    }

}