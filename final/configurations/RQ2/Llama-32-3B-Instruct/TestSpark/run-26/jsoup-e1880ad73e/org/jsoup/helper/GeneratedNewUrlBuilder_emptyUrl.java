package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;

import javax.annotation.Nullable;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedNewUrlBuilder_emptyUrl {

    @Test
    public void newUrlBuilder_emptyUrl() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertNotNull(urlBuilder.build());
    }

}