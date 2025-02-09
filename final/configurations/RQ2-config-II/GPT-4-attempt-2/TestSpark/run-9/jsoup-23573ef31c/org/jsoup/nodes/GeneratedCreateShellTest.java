package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.*;
import org.junit.Assert;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedCreateShellTest {

    @Test
    public void createShellTest() {
        Document document = Document.createShell("http://test.com");
        Assert.assertEquals("<html>\n <head></head>\n <body></body>\n</html>", document.toString());
    }

}