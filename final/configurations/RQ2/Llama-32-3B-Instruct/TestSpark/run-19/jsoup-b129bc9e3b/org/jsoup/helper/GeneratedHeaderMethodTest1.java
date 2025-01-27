package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.ByteArrayInputStream;

public class GeneratedHeaderMethodTest1 {

    @Test
    public void headerMethodTest1() {
        String name = "name";
        String value = "value";
        Connection.Request request = new Request();
        request.header(name, value);
        assertNotNull(request);
    }

}