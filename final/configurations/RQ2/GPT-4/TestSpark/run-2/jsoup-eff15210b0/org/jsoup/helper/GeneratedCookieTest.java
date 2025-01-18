package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCookieTest {

    @Test
    public void cookieTest() {
        HttpConnection connection = new HttpConnection();
        connection.cookie("name", "value");
        assertEquals("value", connection.request().cookies().get("name"));
    }

}