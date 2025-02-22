package org.jsoup.helper;

import static org.jsoup.helper.UrlBuilder.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildURLWithoutQuery {

    @Test
    public void buildURLWithoutQuery() throws Exception {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL normalizedUrl = builder.build();
        assertEquals("http://example.com/", normalizedUrl.toExternalForm());
    }

}