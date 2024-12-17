package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    private String scheme;
    private String userInfo;
    private int host;
    private int port;
    private String path;
    private String query;
    private String fragment;

    public URL() {
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public void setHost(int host, int port) {
        this.host = host;
        this.port = port;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public void setFragment(String fragment) {
        this.fragment = fragment;
    }
}

public class URLBuilder {
    private String scheme;
    private String userInfo;
    private int host;
    private int port;
    private String path;

    public String getURI() {
        return scheme + "://" + userInfo + "/" + path;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public void setHost(int host, int port) {
        this.host = host;
        this.port = port;
    }

    public void setPath(String path) {
        this.path = path;
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

}