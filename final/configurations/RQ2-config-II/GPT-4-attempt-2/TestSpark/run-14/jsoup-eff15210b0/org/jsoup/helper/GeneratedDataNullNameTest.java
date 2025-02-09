package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDataNullNameTest {

    @Test
    public void dataNullNameTest() {
        HttpConnection conn = new HttpConnection();
        conn.data(null, "value");
    }

}