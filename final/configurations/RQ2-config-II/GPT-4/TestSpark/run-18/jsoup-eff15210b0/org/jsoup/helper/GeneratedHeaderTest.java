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

public class GeneratedHeaderTest {

    @Test
    public void headerTest() {
        Assert.assertEquals("value", new HttpConnection().header("name", "value").request().headers().get("name"));
    }

}