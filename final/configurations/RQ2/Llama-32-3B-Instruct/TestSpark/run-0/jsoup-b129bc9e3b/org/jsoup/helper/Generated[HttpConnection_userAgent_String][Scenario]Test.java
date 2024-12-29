package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.InputStream;
import java.util.HashMap;

public class Generated[HttpConnection_userAgent_String][Scenario]

Test {

    @Test
    public void [HttpConnection_userAgent_String][Scenario]Test() {
        String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.37";
        Connection conn = HttpConnection.userAgent(userAgent);
        assertNotNull(conn);
    }

}