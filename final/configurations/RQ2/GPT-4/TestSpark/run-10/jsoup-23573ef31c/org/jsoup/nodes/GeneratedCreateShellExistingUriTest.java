package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedCreateShellExistingUriTest {

    @Test
    public void createShellExistingUriTest() {
        Document document = Document.createShell("https://www.google.com");
        Assert.assertNotNull(document);
    }

}