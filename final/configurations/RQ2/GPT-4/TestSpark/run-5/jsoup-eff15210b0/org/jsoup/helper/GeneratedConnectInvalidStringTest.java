package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedConnectInvalidStringTest {

    @Test
    public void connectInvalidStringTest() {
        Connection connection = HttpConnection.connect("invalid_url");
    }

}