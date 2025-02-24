package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedGetMethodWithValidURL {

    private HttpConnection httpConnection;

    @Before
    public void setup() {
        httpConnection = Mockito.mock(HttpConnection.class);
    }

    @Test
    public void getMethodWithValidURL() throws IOException {
        Document doc = httpConnection.get();
        assertTrue(doc instanceof Document);
    }

}