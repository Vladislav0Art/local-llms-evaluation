package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedCreateShellTest {

    @Test
    public void createShellTest() {
        Document shell = Document.createShell("https://example.com");
        assertNotNull(shell);
    }

}