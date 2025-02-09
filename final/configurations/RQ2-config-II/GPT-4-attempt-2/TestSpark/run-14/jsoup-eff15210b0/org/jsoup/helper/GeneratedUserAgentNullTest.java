package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedUserAgentNullTest {

    @Test
    public void userAgentNullTest() {
        HttpConnection conn = new HttpConnection();
        conn.userAgent(null);
    }

}