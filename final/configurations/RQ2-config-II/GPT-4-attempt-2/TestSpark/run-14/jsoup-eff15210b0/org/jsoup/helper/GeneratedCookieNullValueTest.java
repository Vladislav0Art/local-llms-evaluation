package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCookieNullValueTest {

    @Test
    public void cookieNullValueTest() {
        HttpConnection conn = new HttpConnection();
        conn.cookie("name", null);
    }

}