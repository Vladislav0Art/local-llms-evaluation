package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.InputStream;
import java.util.HashMap;

public class Generated[HttpConnection_ignoreContentType_Boolean][Scenario]

Test {

    @Test
    public void [HttpConnection_ignoreContentType_Boolean][Scenario]Test() {
        boolean ignoreContentType = true;
        Connection conn = HttpConnection.ignoreContentType(ignoreContentType);
        assertNotNull(conn);
    }

}