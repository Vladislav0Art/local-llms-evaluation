package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.HttpCookie;
import java.util.HashMap;
import java.util.Map;

public class GeneratedConnectStringInvalidTest {

    @Test
    public void connectStringInvalidTest() {
        Connection connection = HttpConnection.connect("invalid");
    }

}