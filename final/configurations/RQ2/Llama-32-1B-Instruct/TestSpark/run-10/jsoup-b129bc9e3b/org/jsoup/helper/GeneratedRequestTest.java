package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedRequestTest {

    public static void main(String[] args) {
        HttpConnection.create("http://example.com");
    }

    @Test
    public void requestTest() {
        HttpConnection connection = new HttpConnection();
        assertEquals(200, connection.request().responseCode());
    }

}