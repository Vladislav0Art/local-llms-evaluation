package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;

public class GeneratedTestPutNullValue {

    @Test
    public void testPutNullValue() {
        // Test case 1: put with null value
        Document doc = Jsoup.parse("{}", "a=1 b=2");
        String key = "c";
        Object[] values = {"d", "e"};

        attributes = new Attributes();
        boolean result = attributes.put(key, values);
        System.out.println("Test case 1: put() - Result: " + result);

        // Test case 2: put with null value
        doc = Jsoup.parse("{}", "a=1 b=2 c=3");
        key = "c";
        Object[] values = {"d", "e"};

        attributes = new Attributes();
        boolean result2 = attributes.put(key, values);
        System.out.println("Test case 2: put() - Result: " + result2);

        // Test case 3: get with null value
        doc = Jsoup.parse("{}", "a=1 b=2");
        String key3 = "c";
        Object[] values3 = {"d", "e"};
        attributes = new Attributes();
        boolean result3 = attributes.get(key3);
        System.out.println("Test case 3: get() - Result: " + result3);
    }

}