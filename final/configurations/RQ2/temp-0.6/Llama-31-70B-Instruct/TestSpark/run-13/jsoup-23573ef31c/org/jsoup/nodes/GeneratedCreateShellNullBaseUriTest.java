package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedCreateShellNullBaseUriTest {

    @Test
    public void createShellNullBaseUriTest() {
        Document document = Document.createShell(null);
        assertNotNull(document);
        assertEquals("", document.location());
        assertEquals("", document.html());
    }

}