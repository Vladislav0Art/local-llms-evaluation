package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.net.URL;

public class Generated[
HttpConnection Data][MapKeyVal][Scenario]

Test {

    @Test
    public void [HttpConnection Data][MapKeyVal][Scenario]Test() throws IOException {
        Map<String, String> data = new HashMap<>();
        data.put("key", "value");
        Connection connection = HttpConnection.data(data);
        assertNotNull(connection);
    }

}