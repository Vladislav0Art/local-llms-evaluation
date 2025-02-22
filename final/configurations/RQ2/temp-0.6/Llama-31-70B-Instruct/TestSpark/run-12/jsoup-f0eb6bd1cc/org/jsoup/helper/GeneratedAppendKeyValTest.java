package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

public class GeneratedAppendKeyValTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder(Mockito.mock(URL.class));
    }

    @Test
    public void appendKeyValTest() throws Exception {
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        urlBuilder.appendKeyVal(kv);
    }

}