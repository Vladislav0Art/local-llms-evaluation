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
public class GeneratedTest {

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
        public void newUrlBuilder_withInputUrl_returnsCorrectInstance() {
            assertEquals(inputUrl, urlBuilder.getInputUrl());
        }

        @Test
        public void build_urlReturnsCorrectlyWithoutKeyValues() {
            when(inputUrl.toString()).thenReturn("http://example.com");
            urlBuilder.appendKeyVal(null);
            URL result = urlBuilder.build();
            assertEquals("http://example.com", result.toString());
        }

        @Test
        public void build_urlReturnsCorrectlyWithKeyValuePairs() {
            String base = "http://example.com";
            when(inputUrl.toString()).thenReturn(base);
            urlBuilder.appendKeyVal(new Connection.KeyVal("key1", "value1"));
            URL result = urlBuilder.build();
            assertEquals(base + "?key1=value1", result.toString());
        }

        @Test
        public void appendKeyVal_throwsUnsupportedEncodingException() {
            assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(new Connection.KeyVal("key1", "value1")));
        }

        @Test
        public void appendKeyVal_doesNotAppendDuplicateKeys() {
            String base = "http://example.com";
            when(inputUrl.toString()).thenReturn(base);
            urlBuilder.appendKeyVal(new Connection.KeyVal("key1", "value1"));
            urlBuilder.appendKeyVal(new Connection.KeyVal("key2", "value2"));
            URL result = urlBuilder.build();
            assertEquals(base + "?key1=value1&key2=value2", result.toString());
        }

    }

    public class InputUrlBuilderFactory {
        public UrlBuilder createBuilder(URL inputUrl) {
            return new UrlBuilder(inputUrl);
        }

    }