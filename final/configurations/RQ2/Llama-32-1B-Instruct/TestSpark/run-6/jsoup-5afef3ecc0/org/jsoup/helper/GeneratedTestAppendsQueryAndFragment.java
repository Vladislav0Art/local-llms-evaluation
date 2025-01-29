package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;

public class GeneratedTestAppendsQueryAndFragment {

    public static class URLMapperTest {

        @Test
        public void testAppendsQueryAndFragment() throws UnsupportedEncodingException, MalformedURLException {
            URLMapper mapper = new URLMapper();
            String urlBase = "https://example.com";
            UrlBuilder builder = new UrlBuilder(urlBase);
            builder.appendQuery(mapper);
            builder.appendFragment(mapper);
            Assert.assertEquals("https://example.com?appendsKeyVal=true#appendsKeyVal=true", buildString(urlBase));
        }
    }

    private static String buildString(String baseUrl) {
        Document doc = Jsoup.connect(baseUrl).get();
        URI uri = new URI(baseUrl);

        Elements keys = doc.select("[key]");
        for (Element key : keys) {
            URLBuilder.AppendsKeyVal appendsKeyVal = new UrlBuilder.AppendsKeyVal(new URLMapper());
            appendsKeyVal.append(key);
            String result = doc.toString();
            if (!result.contains(appendsKeyVal.getKey())) {
                return buildString(uri.resolve(uri.getScheme() + "://" + uri.getHost()));
            }
        }

        Elements params = doc.select("[param]");
        for (Element param : params) {
            URLBuilder.AppendsParam appendsParam = new UrlBuilder.AppendsParam(new URLMapper());
            appendsParam.append(param);
            String result = doc.toString();
            if (!result.contains(appendsParam.getParam())) {
                return buildString(uri.resolve(uri.getScheme() + "://" + uri.getHost()));
            }
        }

        Elements fragments = doc.select("[fragment]");
        for (Element fragment : fragments) {
            URLBuilder.AppendsFragment appendsFragment = new UrlBuilder.AppendsFragment(new URLMapper());
            appendsFragment.append(fragment);
            String result = doc.toString();
            if (!result.contains(appendsFragment.getFragment())) {
                return buildString(uri.resolve(uri.getScheme() + "://" + uri.getHost()));
            }
        }

        return uri.toString();
    }

}