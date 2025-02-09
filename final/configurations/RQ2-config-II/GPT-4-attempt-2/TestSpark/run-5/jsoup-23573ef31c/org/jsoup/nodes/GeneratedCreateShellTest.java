package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.Assert;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.mockito.Mockito.*;

public class GeneratedCreateShellTest {

    @Test
    public void createShellTest() {
        Document doc = Document.createShell("http://example.com");
        Assert.assertNotNull(doc);
    }

}