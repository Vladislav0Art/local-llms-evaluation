package org.jsoup.helper;

public class GeneratedTestUrlBuilder {

    private String[] keyValues;

    public UrlBuilder(String url) {
        this.keyValues = url.split("&");
    }

    public void addKeyValue(String entry) {
        if (keyValues == null || keyValues.length >= 10000) {
            System.out.println("Too many key-value pairs, cannot continue.");
            return;
        }
        String[] keyValue = entry.split("=");
        if (keyValue.length != 2) {
            System.out.println("Invalid key-value pair: " + entry);
            return;
        }
        keyValues[keyValues.length] = keyValue[0];
        keyValues[keyValues.length + 1] = keyValue[1];
    }

    public void printUrl() {
        for (String key : keyValues) {
            System.out.println(key + "=");
        }
    }
}

public class TestUrlBuilder {

    @Test
    public void testUrlBuilder() {
        UrlBuilder urlBuilder = new UrlBuilder("https://www.example.com");
        urlBuilder.addKeyValue("key1=value1&key2=value2");
        urlBuilder.addKeyValue("key3=value3&key4=value4");
        urlBuilder.printUrl();
    }

}