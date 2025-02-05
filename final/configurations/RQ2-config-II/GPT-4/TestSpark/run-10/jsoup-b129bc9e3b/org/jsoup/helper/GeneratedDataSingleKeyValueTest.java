package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedDataSingleKeyValueTest {

    @Test
    public void dataSingleKeyValueTest() {
        HttpConnection connection = new HttpConnection();
        Connection con = connection.data("key1", "value1");
        assertNotNull(con);
    }

}