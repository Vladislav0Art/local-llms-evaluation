package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedCreateShellDocument_test {

    @Test
    public void createShellDocument_test() {
        Document document = Document.createShell("http://example.com");
        assertNotNull(document);
        assertTrue(document instanceof Document);
    }

}