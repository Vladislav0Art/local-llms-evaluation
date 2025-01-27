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
public class GeneratedBuild_MutableUrl {

    @Mock
    private Connection connection;

    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    public void tearDown() {
        // No cleanup needed
    }

    @Test
    public void build_MutableUrl() {
        // Given:
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // When:
        URI uri = urlBuilder.build().getURI();

        // Then:
        MatcherAssert.assertThat(uri, Matchers.notNullValue());
    }

}