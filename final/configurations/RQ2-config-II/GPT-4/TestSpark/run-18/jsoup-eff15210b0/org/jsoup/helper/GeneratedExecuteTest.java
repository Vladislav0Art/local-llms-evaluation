package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GeneratedExecuteTest {

    @Test
    public void executeTest() throws IOException {
        Connection.Response response = new HttpConnection().url("https://jsoup.org/").execute();
        Assert.assertNotNull(response);
    }

}