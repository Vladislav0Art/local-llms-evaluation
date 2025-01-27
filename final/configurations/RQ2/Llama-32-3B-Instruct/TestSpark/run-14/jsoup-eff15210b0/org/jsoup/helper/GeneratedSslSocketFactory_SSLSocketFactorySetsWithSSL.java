package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.URL;
import java.util.List;

public class GeneratedSslSocketFactory_SSLSocketFactorySetsWithSSL {

    @Test
    public void sslSocketFactory_SSLSocketFactorySetsWithSSL() {
        SSLSocketFactory factory = new SSLSocketFactory();
        Connection connection = HttpConnection.sslSocketFactory(factory);
        assertNotNull(connection);
    }

}