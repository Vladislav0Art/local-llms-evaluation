package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.io.IOException;
import java.net.URL;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import java.io.InputStream;
import java.net.Proxy;
import java.util.*;

import static org.junit.Assert.assertEquals;

public class GeneratedTimeoutTest {

    @Test
    public void timeoutTest() {
        HttpConnection connection = new HttpConnection();
        connection.timeout(5000);
        assertEquals(5000, connection.request().timeout());
    }

}