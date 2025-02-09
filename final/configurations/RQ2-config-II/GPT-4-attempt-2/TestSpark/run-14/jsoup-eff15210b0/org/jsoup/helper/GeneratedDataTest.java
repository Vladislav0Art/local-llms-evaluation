package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDataTest {

    @Test
    public void dataTest() {
        HttpConnection conn = new HttpConnection();
        conn.data("name", "value");
        assertEquals("value", conn.request().data().get(0).value());
    }

}