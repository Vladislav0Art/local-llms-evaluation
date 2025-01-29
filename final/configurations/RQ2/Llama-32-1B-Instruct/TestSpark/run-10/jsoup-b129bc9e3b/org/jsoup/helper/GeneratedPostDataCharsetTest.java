package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedPostDataCharsetTest {

    public static void main(String[] args) {
        HttpConnection.create("http://example.com");
    }

    @Test
    public void postDataCharsetTest() {
        HttpConnection connection = new HttpConnection();
        String charset = "UTF-8";
        assertEquals(charset, connection.postDataCharset(charset));
    }

}