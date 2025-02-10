package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.net.URL;

public class Generated[
HttpConnection Connect][URLWithQuery]

Test {

    @Test
    public void [HttpConnection Connect][URLWithQuery]Test() throws MalformedURLException {
        URL url = new URL("http://www.example.com/path?a=1&b=2");
        Connection connection = HttpConnection.connect(url);
        assertNotNull(connection);
    }

}