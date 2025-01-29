package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedUserAgentTest {

    public static void main(String[] args) {
        HttpConnection.create("http://example.com");
    }

    @Test
    public void userAgentTest() {
        HttpConnection connection = new HttpConnection();
        String userAgent = "My User Agent";
        assertEquals(userAgent, connection.userAgent(userAgent));
    }

}