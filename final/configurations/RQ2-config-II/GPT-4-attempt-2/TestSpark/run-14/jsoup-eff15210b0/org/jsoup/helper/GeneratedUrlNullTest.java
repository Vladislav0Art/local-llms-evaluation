package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedUrlNullTest {

    @Test
    public void urlNullTest() {
        HttpConnection conn = new HttpConnection();
        conn.url((URL) null);
    }

}