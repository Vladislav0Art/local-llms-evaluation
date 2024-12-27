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
public class GeneratedAppendKeyVal_throwsUnsupportedEncodingException {

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
        public void appendKeyVal_throwsUnsupportedEncodingException() {
            assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(new Connection.KeyVal("key1", "value1")));
        }

    }