package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;
import java.net.Proxy;

import static org.junit.Assert.*;

public class GeneratedTimeoutNegativeTest {

    @Test
    public void timeoutNegativeTest() {
        HttpConnection instance = new HttpConnection();
        instance.timeout(-1000);
    }

}