package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.mockito.Mockito.*;

public class GeneratedTitleTest {

    @Test
    public void titleTest() {
        Document document = Document.createShell("http://test.com");
        document.title("Test Title");
        Assert.assertEquals("Test Title", document.title());
    }

}