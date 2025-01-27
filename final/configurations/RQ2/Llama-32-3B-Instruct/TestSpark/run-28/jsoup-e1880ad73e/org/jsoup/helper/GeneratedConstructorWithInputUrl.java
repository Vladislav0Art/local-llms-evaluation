package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;

import javax.annotation.Nullable;

public class GeneratedConstructorWithInputUrl {

    private URL url;

    public UrlBuilder(URL url) {
        this.url = url;
    }

    public boolean appendKeyVal(String key, String value) {
        try {
            return Connection.KeyVal.of(key, value).of();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public URL build() throws MalformedURLException, URISyntaxException {
        URI uri = url.toURI();
        StringBuilder sb = new StringBuilder(uri.getScheme());
        sb.append("://");
        sb.append(uri.getHost());
        if (!uri.getQuery().isEmpty()) {
            sb.append('?');
            sb.append(URLEncoder.encode(uri.getQuery(), "UTF-8"));
        }
        if (uri.getFragment() != null) {
            sb.append('#');
            sb.append(URI.create(uri.getScheme()).resolve(uri.getUserInfo()).resolve(uri.getHost()).resolve(uri.getPath()).resolve(uri.getQuery()).resolve(uri.getFragment()));
        }
        return new URL(sb.toString());
    }

}

public class UrlBuilderTest {

    public interface KeyVal {
        @Nullable
        boolean of(String key, String value);
    }

    @Test
    public void constructorWithInputUrl() {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        assertNotNull(builder);
    }

}