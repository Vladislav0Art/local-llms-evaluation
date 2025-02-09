package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedCreateShellTest {

    // Test constructor

    @Test
    public void createShellTest() {
        Document shell = Document.createShell("http://localhost");
        assertNotNull(shell);
    }

}