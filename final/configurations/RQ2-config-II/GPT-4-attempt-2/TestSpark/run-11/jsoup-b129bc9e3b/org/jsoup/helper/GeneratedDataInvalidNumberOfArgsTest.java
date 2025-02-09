package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.InputStream;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDataInvalidNumberOfArgsTest {

    @Test
    public void dataInvalidNumberOfArgsTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.data("key1", "value1", "key2");
    }

}