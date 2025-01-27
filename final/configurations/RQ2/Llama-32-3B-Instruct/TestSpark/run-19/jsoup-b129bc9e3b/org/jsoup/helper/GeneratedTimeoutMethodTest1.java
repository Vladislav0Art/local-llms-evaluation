package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.ByteArrayInputStream;

public class GeneratedTimeoutMethodTest1 {

    @Test
    public void timeoutMethodTest1() {
        int millis = 5000;
        Connection connection = HttpConnection.timeout(millis);
        assertEquals(millis, connection.timeout());
    }
}

}