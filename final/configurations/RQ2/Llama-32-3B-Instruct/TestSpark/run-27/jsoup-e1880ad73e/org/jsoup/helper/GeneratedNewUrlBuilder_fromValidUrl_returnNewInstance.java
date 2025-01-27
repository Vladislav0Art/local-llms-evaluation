package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNewUrlBuilder_fromValidUrl_returnNewInstance {

    @Mock
    private Connection connection;

    @Test
    public void newUrlBuilder_fromValidUrl_returnNewInstance() {
        URL url = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        assert builder != null;
    }

}