package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.nodes.*;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedTitleTest {

    @Test
    public void titleTest() {
        Document document = Document.createShell("http://example.com");
        document.title("testTitle");
        Assert.assertEquals("testTitle", document.title());
    }

}