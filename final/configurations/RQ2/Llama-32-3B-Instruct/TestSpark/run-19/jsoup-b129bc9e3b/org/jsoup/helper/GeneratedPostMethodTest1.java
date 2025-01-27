package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.ByteArrayInputStream;

public class GeneratedPostMethodTest1 {

    @Test
    public void postMethodTest1() throws IOException {
        URL url = new URL("http://localhost");
        Connection connection = HttpConnection.connect(url).post();
        assertNotNull(connection);
    }
}

}