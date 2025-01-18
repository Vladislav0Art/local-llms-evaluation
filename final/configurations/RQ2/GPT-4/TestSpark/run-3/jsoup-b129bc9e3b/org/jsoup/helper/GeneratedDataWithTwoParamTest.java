package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.junit.Test;
import org.mockito.Mockito;

import javax.net.ssl.SSLSocketFactory;
import java.io.InputStream;
import java.io.IOException;
import java.net.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedDataWithTwoParamTest {

    @Test
    public void dataWithTwoParamTest() {
        HttpConnection connection = new HttpConnection();
        Connection returnedConnection = connection.data("key", "value");
        assertNotNull(returnedConnection);
    }

}