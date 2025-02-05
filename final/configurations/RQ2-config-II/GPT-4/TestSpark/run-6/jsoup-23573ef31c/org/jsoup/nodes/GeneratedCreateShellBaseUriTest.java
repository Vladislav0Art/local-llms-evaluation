package org.jsoup.nodes;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.util.List;

import static org.mockito.Mockito.when;

public class GeneratedCreateShellBaseUriTest {

    @Test
    public void createShellBaseUriTest() {
        Document document = Document.createShell("http://localhost");
        Assert.assertNotNull(document);
    }

}