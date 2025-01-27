package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedNewUrlBuilder_withInvalidUrl_throwsMalformedURLException {

    @Test
    public void newUrlBuilder_withInvalidUrl_throwsMalformedURLException() {
        when(DataUtil.UTF_8).thenReturn(null);
        UrlBuilder builder = new UrlBuilder(null);
        java.lang.IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> builder.build());
        assertThat(e.getMessage(), is("URL is invalid"));
    }

}