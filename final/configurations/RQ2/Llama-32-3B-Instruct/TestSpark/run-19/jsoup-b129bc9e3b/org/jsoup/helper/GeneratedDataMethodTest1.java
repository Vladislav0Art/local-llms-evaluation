package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.ByteArrayInputStream;

public class GeneratedDataMethodTest1 {

    @Test
    public void dataMethodTest1() {
        String key = "key";
        String value = "value";
        Connection.Request request = new Request();
        request.data(key, value);
        assertNotNull(request);
    }

}