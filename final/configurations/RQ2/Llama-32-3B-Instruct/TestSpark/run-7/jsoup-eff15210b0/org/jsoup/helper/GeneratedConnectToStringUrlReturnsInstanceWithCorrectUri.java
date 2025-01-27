package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.HttpConnection;
import org.jsoup.HttpStatusException;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.jsoup.Connection.Method.HEAD;
import static org.jsoup.helper.DataUtil.UTF_8;
import static org.jsoup.internal.Normalizer.lowerCase;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConnectToStringUrlReturnsInstanceWithCorrectUri {

    @BeforeClass
    public static void init() {
        // setup
    }

    @Test
    public void connectToStringUrlReturnsInstanceWithCorrectUri() {
        String url = "https://example.com";
        Connection result = HttpConnection.connect(url);
        assertThat(result.url().uri(), is(url));
    }

}