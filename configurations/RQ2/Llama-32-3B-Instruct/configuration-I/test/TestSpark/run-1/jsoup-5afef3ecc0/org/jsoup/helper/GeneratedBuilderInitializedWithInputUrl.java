package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuilderInitializedWithInputUrl {

    @Mock
    private URL inputUrl;

    @Test
    public void builderInitializedWithInputUrl() {
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals(urlBuilder, urlBuilder);
    }

}