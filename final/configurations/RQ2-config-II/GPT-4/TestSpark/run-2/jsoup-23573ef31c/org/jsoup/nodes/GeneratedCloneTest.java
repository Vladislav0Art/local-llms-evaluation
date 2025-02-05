package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.nodes.*;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Document document = Document.createShell("http://example.com");
        Document clonedDocument = document.clone();
        Assert.assertNotSame(document, clonedDocument);
    }

}