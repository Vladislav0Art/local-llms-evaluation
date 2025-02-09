package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedCreateShellWithValidBaseUri_ReturnsDocument {

    @Test
    public void createShellWithValidBaseUri_ReturnsDocument() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertNotNull(document);
    }

}