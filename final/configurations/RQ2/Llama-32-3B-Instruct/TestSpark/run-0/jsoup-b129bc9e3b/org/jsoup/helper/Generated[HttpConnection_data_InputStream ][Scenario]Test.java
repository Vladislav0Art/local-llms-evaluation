package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.InputStream;
import java.util.HashMap;

public class Generated[HttpConnection_data_InputStream ][Scenario]

Test {

    @Test
    public void [HttpConnection_data_InputStream ][Scenario]Test() {
        InputStream inputStream = new ByteArrayInputStream("Hello World!".getBytes());
        Connection conn = HttpConnection.data(inputStream);
        assertNotNull(conn);
    }

}