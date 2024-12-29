package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.InputStream;
import java.util.HashMap;

public class Generated[HttpConnection_data_Map<String, String>][Scenario]

Test {

    @Test
    public void [HttpConnection_data_Map<String, String>][Scenario]Test() {
        Map<String, String> data = new HashMap<>();
        data.put("key1", "value1");
        data.put("key2", "value2");
        Connection conn = HttpConnection.data(data);
        assertNotNull(conn);
    }

}