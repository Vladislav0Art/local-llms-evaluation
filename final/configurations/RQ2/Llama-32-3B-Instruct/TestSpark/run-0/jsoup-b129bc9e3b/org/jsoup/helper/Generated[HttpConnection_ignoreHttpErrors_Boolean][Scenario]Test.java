package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.InputStream;
import java.util.HashMap;

public class Generated[HttpConnection_ignoreHttpErrors_Boolean][Scenario]

Test {

    @Test
    public void [HttpConnection_ignoreHttpErrors_Boolean][Scenario]Test() {
        boolean ignoreHttpErrors = true;
        Connection conn = HttpConnection.ignoreHttpErrors(ignoreHttpErrors);
        assertNotNull(conn);
    }

}