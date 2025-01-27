package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.ByteArrayInputStream;

public class GeneratedGetMethodTest1 {

    @Test
    public void getMethodTest1() throws IOException {
        URL url = new URL("http://localhost");
        Connection connection = HttpConnection.connect(url);
        Document document = connection.get();
        assertNotNull(document);
    }

}