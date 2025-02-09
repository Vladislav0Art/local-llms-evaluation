package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDataNullValueTest {

    @Test
    public void dataNullValueTest() {
        HttpConnection conn = new HttpConnection();
        conn.data("name", null);
    }

}