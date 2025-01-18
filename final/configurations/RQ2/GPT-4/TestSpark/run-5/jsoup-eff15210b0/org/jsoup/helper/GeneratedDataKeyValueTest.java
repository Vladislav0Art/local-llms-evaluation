package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedDataKeyValueTest {

    @Test
    public void dataKeyValueTest() {
        HttpConnection httpConnection = new HttpConnection();
        String key = "key";
        String value = "value";
        Connection.KeyVal data = httpConnection.data(key, value).request().data().iterator().next();
        assertEquals(key, data.key());
        assertEquals(value, data.value());
    }

}