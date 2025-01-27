package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedCreateDocumentFromShell_shellCreationTest {

    @Test
    public void createDocumentFromShell_shellCreationTest() {
        String baseUri = "https://www.example.com";
        Document document = Document.createShell(baseUri);
        assertNotNull(document);
    }

}