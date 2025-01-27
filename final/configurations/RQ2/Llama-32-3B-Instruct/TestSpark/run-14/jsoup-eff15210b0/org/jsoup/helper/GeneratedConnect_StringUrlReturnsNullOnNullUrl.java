package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.URL;

public class GeneratedConnect_StringUrlReturnsNullOnNullUrl {

    @Test
    public void connect_StringUrlReturnsNullOnNullUrl() {
        HttpConnection.connect(null);
    }

}