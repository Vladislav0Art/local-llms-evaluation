package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestUrlBuilder {

    @Test
    public void testUrlBuilder() {
        UrlBuilder urlBuilder = new UrlBuilder();
        assertEquals("http://localhost:8080", urlBuilder.getUrl());

        urlBuilder.setUrl("http://localhost:8081");
        assertEquals("http://localhost:8081", urlBuilder.getUrl());

        urlBuilder.appendParameter("key", "value");
        assertEquals("http://localhost:8081?key=value", urlBuilder.getUrl());

        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("key", "value");
        urlBuilder.appendParameters(queryParams);
        assertEquals("http://localhost:8081?key=value", urlBuilder.getUrl());
    }
}

class UrlBuilder {
    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void appendParameter(String key, String value) {
        if (url == null) {
            url = "http://localhost:8080";
        }
        url += "?key=" + value;
    }

    public void appendParameters(Map<String, String> queryParams) {
        if (url == null) {
            url = "http://localhost:8080";
        }
        for (Map.Entry<String, String> entry : queryParams.entrySet()) {
            url += "&" + entry.getKey() + "=" + entry.getValue();
        }
    }

    public Map<String, String> getQueryParameters() {
        if (url == null) {
            return new HashMap<>();
        }
        String[] query = url.split("\\?");
        if (query.length > 1) {
            String queryParamString = query[1];
            String[] params = queryParamString.split("&");
            Map<String, String> queryParams = new HashMap<>();
            for (String param : params) {
                String[] keyValue = param.split("=");
                queryParams.put(keyValue[0], keyValue[1]);
            }
            return queryParams;
        } else {
            return new HashMap<>();
        }
    }

    public static class UrlBuilderHelper {
        public static void main(String[] args) {
            UrlBuilder urlBuilder = new UrlBuilder();
            assertEquals("http://localhost:8080", urlBuilder.getUrl());

            urlBuilder.setUrl("http://localhost:8081");
            assertEquals("http://localhost:8081", urlBuilder.getUrl());

            urlBuilder.appendParameter("key", "value");
            assertEquals("http://localhost:8081?key=value", urlBuilder.getUrl());

            Map<String, String> queryParams = new HashMap<>();
            queryParams.put("key", "value");
            urlBuilder.appendParameters(queryParams);
            assertEquals("http://localhost:8081?key=value", urlBuilder.getUrl());
        }
    }

}