package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;

public class GeneratedTest {

    @Test
    public void testPutSingleValue() {
        // Test case 1: put single value
        Document doc = Jsoup.parse("{}", "a=1");
        String key = "b";
        Object value = "c";

        Attributes attributes = new Attributes();
        boolean result = attributes.put(key, value);
        System.out.println("Test case 1: put() - Result: " + result);

        // Test case 2: put multiple values
        doc = Jsoup.parse("{}", "a=1 b=2");
        key = "c";
        Object[] values = {"d", "e"};

        attributes = new Attributes();
        boolean result2 = attributes.put(key, values);
        System.out.println("Test case 2: put() - Result: " + result2);

        // Test case 3: get
        doc = Jsoup.parse("{}", "a=1");
        String key3 = "b";

        Object result3 = attributes.get(key3);
        System.out.println("Test case 3: get() - Result: " + result3);

        // Test case 4: put with null value
        doc = Jsoup.parse("{}", "a=1 b=2");
        key3 = "b";
        Object[] values = {"c", "d"};

        attributes = new Attributes();
        boolean result3Null = attributes.put(key3, values);
        System.out.println("Test case 4: get() - Result: " + result3Null);

        // Test case 5: put with non-integer value
        doc = Jsoup.parse("{}", "a=1 b=2 c=3");
        key3 = "b";
        Object[] values = {"d", "e"};

        attributes = new Attributes();
        boolean result3NonInt = attributes.get(key3);
        System.out.println("Test case 5: get() - Result: " + result3NonInt);
    }

    @Test
    public void testPutMultipleValues() {
        // Test case 1: put multiple values
        Document doc = Jsoup.parse("{}", "a=1 b=2");
        String key = "c";
        Object[] values = {"d", "e"};

        Attributes attributes = new Attributes();
        boolean result = attributes.put(key, values);
        System.out.println("Test case 1: put() - Result: " + result);

        // Test case 2: put multiple values
        doc = Jsoup.parse("{}", "a=1 b=2 c=3");
        key = "d";
        Object[] values = {"e", "f"};

        attributes = new Attributes();
        boolean result2 = attributes.put(key, values);
        System.out.println("Test case 2: put() - Result: " + result2);

        // Test case 3: get
        doc = Jsoup.parse("{}", "a=1 b=2");
        String key3 = "c";

        Object[] values3 = {"d", "e"};
        attributes = new Attributes();
        boolean result3 = attributes.get(key3);
        System.out.println("Test case 3: get() - Result: " + result3);

        // Test case 4: put with null value
        doc = Jsoup.parse("{}", "a=1 b=2");
        key3 = "c";
        Object[] values4 = {"d", "e"};

        attributes = new Attributes();
        boolean result4 = attributes.put(key3, values4);
        System.out.println("Test case 4: get() - Result: " + result4);

        // Test case 5: put with non-integer value
        doc = Jsoup.parse("{}", "a=1 b=2 c=3");
        key3 = "c";
        Object[] values3 = {"d", "e"};

        attributes = new Attributes();
        boolean result3NonInt = attributes.get(key3);
        System.out.println("Test case 5: get() - Result: " + result3NonInt);
    }

    @Test
    public void testGet() {
        // Test case 1: get multiple values
        Document doc = Jsoup.parse("{}", "a=1 b=2");
        String key = "c";
        Object value = attributes.get(key);

        System.out.println("Test case 1: get() - Result: " + value);
    }

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