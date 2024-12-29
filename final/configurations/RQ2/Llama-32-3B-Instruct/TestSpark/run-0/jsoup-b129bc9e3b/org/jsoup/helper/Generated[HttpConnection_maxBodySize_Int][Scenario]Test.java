package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.InputStream;
import java.util.HashMap;

public class Generated[HttpConnection_maxBodySize_Int][Scenario]

Test {

    @Test
    public void [HttpConnection_maxBodySize_Int][Scenario]Test() {
        int bytes = 1024;
        Connection conn = HttpConnection.maxBodySize(bytes);
        assertNotNull(conn);
    }

}