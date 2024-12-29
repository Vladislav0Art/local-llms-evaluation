package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedTest {

    public interface KeyVal {
        String getKey();

        String getValue();
    }

    public static class Connection implements KeyVal {
        private final String key;
        private final String value;

        public Connection(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String getKey() {
            return key;
        }

        @Override
        public String getValue() {
            return value;
        }
    }

    public class UrlBuilder {

        private URL url;

        public UrlBuilder(URL url) {
            this.url = url;
        }

        public void appendKeyVal(KeyVal connection) throws MalformedURLException, URISyntaxException {
            if (url.toURI().getScheme() == null) {
                throw new MalformedURLException("Scheme is null");
            }
            String encodedKey = URLEncoder.encode(connection.getKey(), "UTF-8").replace("+", "%20");
            String encodedValue = URLEncoder.encode(connection.getValue(), "UTF-8").replace("+", "%20");
            url = new URL(url.getProtocol(), url.getHost(), url.getPort(), url.getPath() + "?key=" + encodedKey + "&value=" + encodedValue, null);
        }

        public String build() throws URISyntaxException {
            return url.toURI().toString();
        }
    }

}