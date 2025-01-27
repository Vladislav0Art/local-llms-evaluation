package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.nio.charset.Charset;

public class GeneratedTestCreateShell_EmptyBaseUri {

    @Test
    public void testCreateShell_EmptyBaseUri() {
        String baseUri = "";
        assertThrows(NullPointerException.class, () -> Document.createShell(baseUri));
    }

}