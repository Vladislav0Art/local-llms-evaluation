package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.junit.Test;
import org.mockito.Mockito;

import javax.net.ssl.SSLSocketFactory;
import java.io.InputStream;
import java.io.IOException;
import java.net.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedReferrerTest {

    @Test
    public void referrerTest() {
        HttpConnection connection = new HttpConnection();
        Connection returnedConnection = connection.referrer("https://google.com");
        assertNotNull(returnedConnection);
    }

}