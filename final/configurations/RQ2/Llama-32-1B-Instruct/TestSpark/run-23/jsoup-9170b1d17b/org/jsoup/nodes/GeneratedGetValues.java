package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;

public class GeneratedGetValues {

    @Test
    public void getValues() {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("html.html");
        Element root = document.body();
        String content1 = "<p>This is a test</p>";
        String content2 = "<p>This is another test</p>";

        Attributes attributes = new Attributes();

        attributes.addAttribute("test", content1);
        attributes.addAttribute("another-test", content2);

        assertTrue(attributes.containsKey("test"));
        assertFalse(attributes.containsValue(content1));

        attributes.removeAttribute("another-test");
        assertTrue(attributes.containsKey("test"));

        assertTrue(attributes.getValue("test").equals(content1));
    }
}

class Attributes {
    private String test;
    private String anotherTest;

    public void addAttribute(String key, String value) {
        this.test = key + "=" + value;
        this.anotherTest = null;
    }

    public String getAttribute(String key) {
        if (this.anotherTest != null && key.equals("another-test")) {
            return "another-" + key;
        } else {
            return test;
        }
    }

    public String getValue(String attribute) {
        return attribute.isEmpty() ? "" : this.getAttribute(attribute);
    }

    public void removeAttribute(String attribute) {
        if (this.test.contains(attribute)) {
            this.anotherTest = null;
        } else {
            this.test = "";
        }
    }

}