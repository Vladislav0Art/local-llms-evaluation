package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedAppendKeyVal_givenNullConnection_throwsNullPointerException {

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

    public static class DataUtil {
        public static final String UTF_8 = "UTF-8";
    }

    public static class UrlBuilder {
        private URL inputUrl;

        public UrlBuilder(URL inputUrl) {
            this.inputUrl = inputUrl;
        }

        public void appendKeyVal(KeyVal kv) throws MalformedURLException {
            String key = kv.getKey();
            String value = kv.getValue();
            assert value != null : "Value is null";
            if (inputUrl.toURI().getScheme() == null) {
                throw new MalformedURLException("Scheme is null");
            }
            String encodedKey = URLEncoder.encode(key, DataUtil.UTF_8);
            String encodedValue = URLEncoder.encode(value, DataUtil.UTF_8).replace("+", "%20");
            inputUrl = new URL(inputUrl.getProtocol(), inputUrl.getHost(), inputUrl.getPort(), inputUrl.getPath() + "?key=" + encodedKey + "&value=" + encodedValue, null);
        }

        public String build() {
            return inputUrl.toURI().toString();
        }
    }

    @Test
    public void appendKeyVal_givenNullConnection_throwsNullPointerException() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://localhost", "localhost", 80, "/"));
        KeyVal connection = null;
        try {
            urlBuilder.appendKeyVal(connection);
            assert false : "Expected NullPointerException to be thrown";
        } catch (NullPointerException e) {
            // expected
        }
    }

}