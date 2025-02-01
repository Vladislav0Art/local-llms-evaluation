package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedCreateShellTest {

    private static final String BASE_URI = "https://google.com";

    @Test
    public void createShellTest() {
        Document shell = Document.createShell(BASE_URI);
        Assert.assertEquals("<html>\n <head></head>\n <body></body>\n</html>", shell.html());
    }

}