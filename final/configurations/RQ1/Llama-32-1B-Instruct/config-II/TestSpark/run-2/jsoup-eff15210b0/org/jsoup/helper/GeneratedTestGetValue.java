package org.jsoup.helper;

import org.junit.Test;

public class GeneratedTestGetValue {

    private String filename;

    @Override
    public KeyVal key(String key) {
        Validate.notEmptyParam(key, "key");
        this.filename = key;
        return this;
    }

    @Override
    public String key() {
        return filename;
    }

    @Override
    public KeyVal value(String value) {
        Validate.notNullParam(value, "value");
        return new KeyVal(filename, value);
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public InputStream inputStream() {
        return null;
    }

    @Override
    public void setInputStream(InputStream stream) {
        this.stream = stream;
    }
}

// Generate public class FileUrl

public class FileUrl implements Connection.KeyVal, Connection.Request {
    private String[] params;

    @Override
    public KeyVal key(String key) {
        Validate.notEmptyParam(key, "key");
        if (params != null && paramIndex >= params.length)
            throw new IllegalStateException("File URL parameters: " + java.util.Arrays.toString(params));
        this.filename = key;
        return this;
    }

    @Override
    public String filename() {
        return filename;
    }

    @Override
    public KeyVal value(String value) {
        Validate.notNullParam(value, "value");
        return new KeyVal(filename, value);
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public InputStream inputStream() {
        // for get url reqs, serialise the data map into the url
        StringBuilder sb = new StringBuilder();
        for (Connection.KeyVal keyVal : params) {
            Validate.isFalse(keyVal.hasInputStream(), "InputStream data not supported in URL query string.");
            sb.append(keyVal.key());
            if (!keyVal.hasInputStream())
                sb.append("=");
            sb.append(URLEncoder.encode(keyVal.value(), Connection.Request.RequestCharSet));
        }
        String url = sb.toString();
        // return a new Connection.KeyVal instance
        return new KeyVal(filename, url);
    }

    @Override
    public void setInputStream(InputStream stream) {
        params = new String[params.length + 1];
        for (int i = 0; i < params.length; i++)
            params[i] = params[i - 1];
        params[params.length] = "filename=" + filename + "=" + stream;
    }

    @Override
    public InputStream inputStream() {
        return null;
    }
}

// Generate public class FileResponseTest

import org.junit.Test;

public class FileResponseTest {

    @Test
    public void testGetValue() {
        Connection.KeyVal keyVal = new KeyVal("key", "value");
        System.out.println(keyVal.value());
    }

}