package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedPostDataCharsetTest {

    @Test
    public void postDataCharsetTest() {
        HttpConnection connection = new HttpConnection();
        Connection updatedConnection = connection.postDataCharset("UTF-8");
        assertNotNull(updatedConnection);
    }

}