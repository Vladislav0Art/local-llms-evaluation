package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDataInputTest {

    @Test
    public void dataInputTest() {
        HttpConnection connection = new HttpConnection();
        ByteArrayInputStream bis = new ByteArrayInputStream(new byte[]{1, 2, 3});
        connection.data("key", "filename", bis, "application/octet-stream");

        boolean dataExist = connection.request().data().stream()
                .anyMatch(keyVal -> keyVal.key().equals("key")
                        && keyVal.value().equals("filename")
                        && "application/octet-stream".equals(keyVal.contentType()));
        assertTrue(dataExist);
    }

}