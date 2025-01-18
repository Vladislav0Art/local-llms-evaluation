package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.helper.HttpConnection;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.URL;

public class GeneratedConnectInvalidStringUrlTest {

    @Test
    public void connectInvalidStringUrlTest() {
        HttpConnection.connect("invalid");
    }

}