package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedCreateShellValidInputTest {

    @Test
    public void createShellValidInputTest() {
        Document doc = Document.createShell("http://test.com");
        Assert.assertNotNull(doc);
    }

}