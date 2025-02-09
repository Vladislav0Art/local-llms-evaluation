package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;
import java.net.Proxy;

import static org.junit.Assert.*;

public class GeneratedMaxBodySizeNegativeTest {

    @Test
    public void maxBodySizeNegativeTest() {
        HttpConnection instance = new HttpConnection();
        instance.maxBodySize(-2048);
    }

}