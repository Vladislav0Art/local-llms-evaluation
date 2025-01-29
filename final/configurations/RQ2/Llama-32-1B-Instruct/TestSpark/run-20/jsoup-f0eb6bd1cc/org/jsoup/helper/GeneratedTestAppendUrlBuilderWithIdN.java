package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestAppendUrlBuilderWithIdN {

    @Test
    public void testAppendUrlBuilderWithIdN() throws MalformedURLException, URISyntaxException {
        String url = "https://example.com";
        URLBuilder builder = new UrlBuilder(new URI(url));
        assertNotNull(builder.build().getIdN());
    }
}

class Mapper implements org.jsoup.helper.DataUtil.DataMapper<String> {

    @Override
    public String toString(String value) {
        return value;
    }

    @Override
    public String getEncoding() throws UnsupportedEncodingException {
        return UTF_8;
    }

}