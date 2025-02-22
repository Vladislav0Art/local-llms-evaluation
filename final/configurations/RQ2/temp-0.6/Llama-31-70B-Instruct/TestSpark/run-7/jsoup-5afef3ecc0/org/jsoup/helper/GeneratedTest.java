package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class GeneratedTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder(/* URL input */);
    }

    @Test
    public void buildTest() {
        URL url = urlBuilder.build();
        // assertions
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        Connection.KeyVal keyVal = /* KeyVal input */;
        urlBuilder.appendKeyVal(keyVal);
        // assertions
    }

}