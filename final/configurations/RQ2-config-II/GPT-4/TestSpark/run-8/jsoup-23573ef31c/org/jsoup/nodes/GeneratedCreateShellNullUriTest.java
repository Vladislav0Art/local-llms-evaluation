package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedCreateShellNullUriTest {

    @Test
    public void createShellNullUriTest() {
        Document doc = Document.createShell(null);
        assertNull(doc.location());
    }

}