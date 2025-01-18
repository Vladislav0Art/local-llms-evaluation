package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedDataStringStringInputStreamTest {

    @Test
    public void dataStringStringInputStreamTest() {
        HttpConnection httpConnection = new HttpConnection();
        InputStream dummyStream = new ByteArrayInputStream("dummyStream".getBytes());
        httpConnection.data("key", "fileName", dummyStream);
    }

}