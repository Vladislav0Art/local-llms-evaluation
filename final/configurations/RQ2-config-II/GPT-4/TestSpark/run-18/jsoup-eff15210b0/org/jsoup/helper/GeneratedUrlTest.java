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

public class GeneratedUrlTest {

    @Test
    public void urlTest() throws Exception {
        Assert.assertEquals("http://localhost", new HttpConnection().url("http://localhost").request().url().toString());
    }

}