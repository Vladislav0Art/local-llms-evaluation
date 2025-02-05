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

public class GeneratedPostDataCharsetTest {

    @Test
    public void postDataCharsetTest() {
        Assert.assertEquals("UTF-8", new HttpConnection().postDataCharset("UTF-8").request().postDataCharset());
    }

}