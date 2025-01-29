package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestRequestMethod {

    @Test
    public void testRequestMethod() {
        Method method = new Method(Method.GET);
        HttpConnection connection = HttpConnection.connect(method, "https://example.com");
        assertEquals(true, connection.isAlive());
    }
}

class Method implements Connection.Method {
    private String method;

    public Method(String method) {
        this.method = method;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Method method = (Method) o;
        return method.method.equals(method);
    }
}

class Data implements Connection.Data {
    private String key;

    public Data(String key) {
        this.key = key;
    }

    @Override
    public void put(String key, Object value) {
    }

    @Override
    public boolean containsKey(String key) {
        return true;
    }

    @Override
    public Object get(String key) {
        return null;
    }
}

class KeyVal implements Connection.KeyVal {
    private String key;

    public KeyVal(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyVal keyVal = (KeyVal) o;
        return key.equals(keyVal.key);
    }

}