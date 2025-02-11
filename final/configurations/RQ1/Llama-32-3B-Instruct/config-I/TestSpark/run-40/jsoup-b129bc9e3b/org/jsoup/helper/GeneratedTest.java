package org.jsoup.helper;

public class GeneratedTest {

    private String key;
    private String value;

    public RequestBody() {
    }

    public void setValue(String value) {
        this.value = value;
    }
}

public class InputStreamWrapper implements java.io.InputStream {
    private final java.io.InputStream inputStream;

    public InputStreamWrapper(java.io.InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public int read() throws IOException {
        return inputStream.read();
    }
}

public class RequestBuilder {
    public URL url;

    public void setUrl(URL url) {
        this.url = url;
    }
}

public class KeyVal {
    private String key;
    private String value;
    private java.io.InputStream stream;
    private String contentType;

    public static KeyVal create(String key, String value) {
        return new KeyVal(key, value);
    }

    public static KeyVal create(String key, String filename, java.io.InputStream stream) {
        return new KeyVal(key)
                .setKeyValue(key, filename)
                .createStream(stream);
    }

    private void setKeyValue(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public KeyVal setKeyValue(String key, String value) {
        this.setKeyValue(key, value);
        return this;
    }

    public KeyVal createStream(java.io.InputStream stream) {
        this.stream = stream;
        return this;
    }
}

public class GeneratedTest {

}