package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedDataKeyValTest {

    @Test
    public void dataKeyValTest() {
        HttpConnection httpConnection = new HttpConnection();

        httpConnection.data("key", "value");

        assertEquals("value", httpConnection.request().data().get(0).value());
    }

}