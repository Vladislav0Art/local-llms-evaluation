package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTest {

    private Document doc = new Document();

    @Test
    public void testGettest() {
        Attributes attributes = new Attributes();
        System.out.println(attributes.get("key"));
    }

    @Test
    public void testGetIgnoreCasetest() {
        Elements elements = doc.select("key");
        for (Element element : elements) {
            System.out.println(element.get("key"));
        }
    }

    @Test
    public void testUserDataTest() {
        Attributes attributes = new Attributes();
        attributes.addUser("value");
        System.out.println(attributes.getUserData("value"));
    }

    @Test
    public void testPutUserTest() {
        Elements elements = doc.select("key");
        for (Element element : elements) {
            element.put("user", "value");
            System.out.println(element.get("key") + ": " + element.getValue());
        }
    }

    @Test
    public void testPutAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("attribute", "value");
        System.out.println(attributes.getAttribute("attribute"));
    }

    @Test
    public void testRemoveTest() {
        Elements elements = doc.select("key");
        for (Element element : elements) {
            element.remove();
            System.out.println(element.get("key"));
        }
    }

    @Test
    public void testRemoveIgnoreCaseTest() {
        Elements elements = doc.select("key");
        for (Element element : elements) {
            element.removeIgnoreCase("key");
            System.out.println(element.get("key"));
        }
    }

    @Test
    public void testHasKeyTest() {
        Attributes attributes = new Attributes();
        System.out.println(attributes.hasKey("key"));
    }

    @Test
    public void testHasKeyIgnoreCaseTest() {
        Elements elements = doc.select("key");
        for (Element element : elements) {
            System.out.println(element.get("key") + ": " + element.getValue());
        }
    }

    @Test
    public void testHasDeclaredValueForKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        System.out.println(attributes.hasDeclaredValueForKey("key"));
    }

    @Test
    public void testHasKeyForcedTest() {
        Elements elements = doc.select("key");
        for (Element element : elements) {
            if (!element.getKey().isEmpty()) {
                System.out.println(element.get("key") + ": " + element.getValue());
            }
        }
    }

    @Test
    public void testHasDeclaredValueForKeyForcedTest() {
        Elements elements = doc.select("key");
        for (Element element : elements) {
            if (!element.getKey().isEmpty()) {
                System.out.println(element.get("key") + ": " + element.getValue());
            }
        }
    }

    @Test
    public void testSizeTest() {
        Attributes attributes = new Attributes();
        System.out.println(attributes.size());
    }

    @Test
    public void testIsEmptyTest() {
        Elements elements = doc.select("key");
        for (Element element : elements) {
            System.out.println(element.get("key"));
        }
        System.out.println(Attributes.isEmpty(doc));
    }

    @Test
    public void testAddAllTest() {
        Attributes attributes1 = new Attributes();
        attributes1.addUser("value1");
        Element element1 = doc.createElement("key1");
        element1.appendChild(attributes1.getUserNode());
        for (Element element : elements) {
            System.out.println(element.get("key"));
        }
    }

    @Test
    public void testIteratorTest() {
        Attributes attributes = new Attributes();
        for (Attribute attribute : attributes.iterator()) {
            System.out.println(attribute.getKey());
        }
    }

    @Test
    public void testAsListTest() {
        Elements elements = doc.select("key");
        List<Attribute> list = new ArrayList<>();
        for (Element element : elements) {
            list.add(element.getUserNode());
        }
        System.out.println(list);
    }

    @Test
    public void testDatasetTest() {
        Attributes attributes = new Attributes();
        attributes.dataset(doc.toString(), 1000);
        Map<String, String> map = new AbstractMap.SimpleImmutableMap<>();
        for (Attribute attribute : attributes.dataset().values()) {
            map.put(attribute.getKey(), attribute.getValue());
        }
        System.out.println(map);
    }

    @Test
    public void testHtmlTest() {
        Attributes attributes = new Attributes();
        attributes.html(doc.toString());
        String html = doc.toString();
        System.out.println(html);
    }

    @Test
    public void testNormalizeTest() {
        Elements elements = doc.select("key");
        for (Element element : elements) {
            element.normalize();
            System.out.println(element.get("key"));
        }
    }

    @Test
    public void testDeduplicateTest() {
        Attributes attributes = new Attributes();
        attributes.deduplicate(doc.toString());
        String deduplicatedHtml = doc.toString();
        System.out.println(deduplicatedHtml);
    }

    @Test
    public void testInternalKeyTest() {
        Elements elements = doc.select("key");
        for (Element element : elements) {
            System.out.println(Attributes.internalKey(element.getKey()));
        }
    }

}