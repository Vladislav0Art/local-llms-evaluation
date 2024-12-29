package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.InputStream;
import java.util.HashMap;

public class Generated[HttpConnection_followRedirects_Boolean][Scenario]

Test {

    @Test
    public void [HttpConnection_followRedirects_Boolean][Scenario]Test() {
        boolean followRedirects = true;
        Connection conn = HttpConnection.followRedirects(followRedirects);
        assertNotNull(conn);
    }

}