package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class GeneratedNewUrlBuilder_withValidUrl_createsCorrectUrl {

    @Test
    public void newUrlBuilder_withValidUrl_createsCorrectUrl() {
        URL url = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        URL createdUrl = builder.build();
        assertThat(createdUrl.toString(), is("http://example.com"));
    }

}