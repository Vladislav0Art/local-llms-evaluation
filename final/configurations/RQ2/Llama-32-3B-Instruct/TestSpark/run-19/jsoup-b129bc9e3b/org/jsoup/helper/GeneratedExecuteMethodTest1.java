package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.ByteArrayInputStream;

public class GeneratedExecuteMethodTest1 {

    @Test
    public void executeMethodTest1() {
        URL url = new URL("http://localhost");
        Connection response = HttpConnection.connect(url).execute();
        assertNotNull(response);
    }

}