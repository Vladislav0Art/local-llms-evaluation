package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.net.URL;

import org.jsoup.Connection.KeyVal;
import org.mockito.Mockito;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.DataUtil;

public class GeneratedAppendKeyValEncodesValueCorrectly {

    @Test
    public void appendKeyValEncodesValueCorrectly() throws UnsupportedEncodingException {
        String value = "test";
        Mockito.when(StringUtil.encodeString(value)).thenReturn("encoded_value");
        UrlBuilder builder = new UrlBuilder();
        KeyVal kv = new KeyVal();
        kv.setValue(value);
        builder.appendKeyVal(kv);
    }

    public void appendKeyValEncodesValueCorrectly() throws UnsupportedEncodingException {
        // no need to encode in this case
    }
}

class UrlBuilder {
    private String url;

    public UrlBuilder(String url) {
        this.url = url;
    }

    public URL build() {
        return new URL(url);
    }

    public void appendKeyVal(KeyVal kv) {
        // implementation details omitted
    }
}

class KeyVal {
    private String key;
    private String value;

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}

}