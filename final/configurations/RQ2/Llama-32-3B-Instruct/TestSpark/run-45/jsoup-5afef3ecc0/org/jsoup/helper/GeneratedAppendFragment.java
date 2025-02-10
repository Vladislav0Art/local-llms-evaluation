package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendFragment {

    @Mock
    private Connection connection;

    @Before
    public void setUp() {
        // Setup necessary objects here.
    }

    @Test
    public void appendFragment() {
        // Given: url to build from and fragment
        URL inputUrl = new URL("https://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        String fragment = "#fragment";

        // When: Append key value pair to the url with a fragment
        builder.appendKeyVal(new Connection.KeyVal("#", fragment));

        // Then: The resulting url is correct
    }

}