package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.net.URL;

public class GeneratedAppendKeyVal_connectionKeyVal_stringReturnNewUrlBuilder_2 {

    @Test
    public void appendKeyVal_connectionKeyVal_stringReturnNewUrlBuilder_2() {
        // Arrange and Act
        String key1 = "key1";
        String value1 = "value1";
        String key2 = "key2";
        String value2 = "value2";
        UrlBuilder builder = new UrlBuilder("");
        builder.appendKeyVal(new Connection.KeyVal(key1, value1));
        builder.appendKeyVal(new Connection.KeyVal(key2, value2));

        boolean result = false; // assuming appending should not add anything

        // Assert
        assertThat(builder, is(new UrlBuilder(String.format("%s=%s&%s=%s", key1, value1, key2, value2))));
    }

}

public class Connection {
    public static class KeyVal {
        private String key;
        private String value;

        public KeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}

public class UrlBuilder {
    private String url;

    public UrlBuilder(String url) {
        this.url = url;
    }

    public void appendKeyVal(Connection.KeyVal keyVal) {
        if (url.isEmpty()) {
            url = String.format("%s=%s", keyVal.key, keyVal.value);
        } else {
            url += String.format("&%s=%s", keyVal.key, keyVal.value);
        }
    }

    public URL build() {
        return new URL(url);
    }

}