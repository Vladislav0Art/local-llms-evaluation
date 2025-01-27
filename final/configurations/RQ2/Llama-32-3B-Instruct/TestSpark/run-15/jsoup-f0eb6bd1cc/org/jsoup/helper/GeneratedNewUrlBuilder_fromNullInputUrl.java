package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedNewUrlBuilder_fromNullInputUrl {

    @Test
    public void newUrlBuilder_fromNullInputUrl() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        Mockito.assertDoesNotThrow(() -> urlBuilder.build());
    }

}