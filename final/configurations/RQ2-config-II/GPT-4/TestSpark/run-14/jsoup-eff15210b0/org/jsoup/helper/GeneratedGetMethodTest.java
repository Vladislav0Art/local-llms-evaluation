package org.jsoup.helper;

import org.jsoup.Connection.*;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedGetMethodTest {

    @Test
    public void getMethodTest() throws IOException {
        assertNotNull(Jsoup.connect("http://example.com").get());
    }

}