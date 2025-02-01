package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.select.Selector;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedCreateShellTest {

    @Test
    public void createShellTest() {
        String baseUri = "http://example.com";
        Document shell = Document.createShell(baseUri);
        assertEquals("<html>\n <head></head>\n <body></body>\n</html>", shell.html());
    }

}