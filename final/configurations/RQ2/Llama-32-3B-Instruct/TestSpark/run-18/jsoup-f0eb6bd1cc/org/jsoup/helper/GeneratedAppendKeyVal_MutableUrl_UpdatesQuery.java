package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedAppendKeyVal_MutableUrl_UpdatesQuery {

    @Mock
    private Connection connection;

    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    public void tearDown() {
        // No cleanup needed
    }

    @Test
    public void appendKeyVal_MutableUrl_UpdatesQuery() {
        // Given:
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        String key1 = "key1";
        String val1 = "val1";
        String key2 = "key2";
        String val2 = "val2";

        // When:
        urlBuilder.appendKeyVal(new Connection.KeyVal(key1, val1));
        urlBuilder.appendKeyVal(new Connection.KeyVal(key2, val2));

        // Then:
        MatcherAssert.assertThat(urlBuilder.build().getQuery(), Matchers.equalTo("key1=val1&key2=val2"));
    }

}