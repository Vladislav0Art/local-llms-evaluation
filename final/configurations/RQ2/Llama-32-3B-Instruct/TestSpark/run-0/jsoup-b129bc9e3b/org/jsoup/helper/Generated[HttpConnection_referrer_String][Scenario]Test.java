package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.InputStream;
import java.util.HashMap;

public class Generated[HttpConnection_referrer_String][Scenario]

Test {

    @Test
    public void [HttpConnection_referrer_String][Scenario]Test() {
        String referrer = "example.com";
        Connection conn = HttpConnection.referrer(referrer);
        assertNotNull(conn);
    }

}