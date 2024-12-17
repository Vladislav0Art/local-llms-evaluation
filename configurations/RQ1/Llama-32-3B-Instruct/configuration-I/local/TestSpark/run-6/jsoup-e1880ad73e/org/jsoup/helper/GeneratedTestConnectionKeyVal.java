package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestConnectionKeyVal {

    private String scheme;
    private String userInfo;
    private String host;
    private int port;
    private String path;
    private String query;
    private String fragment;

    public URL() {
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public void setHost(int host, int port) {
        this.host = Integer.toString(host);
        this.port = port;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getScheme() {
        return scheme;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return Integer.parseInt(host);
    }

    public String getPath() {
        return path;
    }

    public String getQuery() {
        return query;
    }

    public String getFragment() {
        return fragment;
    }
}

public class URLBuilder {
    private String scheme;
    private String userInfo;
    private int host;
    private int port;
    private String path;

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public void setHost(int host, int port) {
        this.host = host;
        this.port = port;
    }

    public String getURI() {
        return scheme + "://" + userInfo + "/" + path;
    }
}

public class ConnectionKeyVal {
    private String key;
    private String value;

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class GeneratedTest {

    @Test
    public void testConnectionKeyVal() {
        ConnectionKeyVal kv1 = new ConnectionKeyVal();
        ConnectionKeyVal kv2 = new ConnectionKeyVal();
        String result = "";
        kv1.setKey("key");
        kv1.setValue("value");
        result += kv2.appendTo(result, true);
        assertEquals("key=value", StringUtil.toString(result));
    }

}