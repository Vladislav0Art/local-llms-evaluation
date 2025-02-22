package org.jsoup.helper;

import static org.jsoup.helper.UrlBuilder.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        URL inputUrl = new URL("https://www.example.com/");
        urlBuilder = new UrlBuilder(inputUrl);
    }

    @Test
    public void appendKeyValTest() {
        urlBuilder.appendKeyVal("key", "value");
        assertEquals("key=value", urlBuilder.q.toString());
    }

}