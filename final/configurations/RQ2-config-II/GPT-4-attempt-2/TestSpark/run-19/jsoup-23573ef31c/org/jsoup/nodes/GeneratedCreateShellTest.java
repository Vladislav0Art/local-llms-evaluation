package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;

import static org.junit.Assert.*;

import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedCreateShellTest {

    @Test
    public void createShellTest() {
        Document shell = Document.createShell("http://exampleShell.com");
        assertEquals("http://exampleShell.com", shell.location());
    }

}