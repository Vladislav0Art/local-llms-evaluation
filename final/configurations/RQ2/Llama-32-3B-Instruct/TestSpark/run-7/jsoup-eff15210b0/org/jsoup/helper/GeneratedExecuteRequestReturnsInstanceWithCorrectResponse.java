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
public class GeneratedExecuteRequestReturnsInstanceWithCorrectResponse {

    @BeforeClass
    public static void init() {
        // setup
    }

    @Test
    public void executeRequestReturnsInstanceWithCorrectResponse() throws IOException {
        URL url = new URL("https://example.com");
        Connection request = HttpConnection.connect(url).method(HEAD);
        Connection response = request.execute();
        assertThat(response, instanceOf(HttpConnection.Response.class));
    }

}