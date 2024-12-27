package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

import org.mockito.InjectMocks;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild_urlReturnsCorrectlyWithoutKeyValues {

    @Mock
    private URL inputUrl;

    @Mock
    private Connection.KeyVal kv;

    public void testConstruct() {
        InputUrlBuilderFactory factory = new InputUrlBuilderFactory();
        this.urlBuilder = factory.createBuilder(inputUrl);
    }

    public static class UrlBuilderTest {
        @Mock
        private URL inputUrl;

        @Mock
        private Connection.KeyVal kv;

        public void testConstruct() {
            InputUrlBuilderFactory factory = new InputUrlBuilderFactory();
            this.urlBuilder = factory.createBuilder(inputUrl);
        }

        public UrlBuilder urlBuilder;

        @Test
        public void build_urlReturnsCorrectlyWithoutKeyValues() {
            when(inputUrl.toString()).thenReturn("http://example.com");
            urlBuilder.appendKeyVal(null);
            URL result = urlBuilder.build();
            assertEquals("http://example.com", result.toString());
        }

    }