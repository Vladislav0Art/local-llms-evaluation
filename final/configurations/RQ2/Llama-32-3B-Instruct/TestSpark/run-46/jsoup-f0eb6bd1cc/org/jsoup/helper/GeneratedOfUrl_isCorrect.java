package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOfUrl_isCorrect {

    @Mock
    private Connection connection;

    @Test
    public void ofUrl_isCorrect() {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        assertEquals("http://example.com", builder.build().toString());
    }

}