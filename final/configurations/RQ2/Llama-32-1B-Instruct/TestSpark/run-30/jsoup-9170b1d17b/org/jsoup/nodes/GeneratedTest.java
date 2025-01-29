package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTest {

    public static Document generateAttributes() {
        Document doc = new Document();
        Element element = doc.createElement("div");
        element.setAttribute("class", "attributes");
        doc.appendChild(element);
        return doc;
    }

    @Test
    public void testGet() {
        Document document = generateAttributes();
        Attributes attributes = document.getElementById("attributes").getElementsByName("key").first();

        assertEquals(KEY, attributes.getValue());
    }

    @Test
    public void testGetIgnoreCase() {
        Document document = generateAttributes();
        Attributes attributes = document.getElementById("attributes").getElementsByName("KEY").first();

        assertEquals("test", attributes.getValue().toLowerCase());
    }

    @Test
    public void testAdd() {
        Document document = generateAttributes();
        Element element = doc.createElement("div");
        element.setAttribute("class", "attributes");

        element.appendChild(doc.createElement("p")).setAttribute("id", "key-1").nodeValue("value1");
        element.appendChild(doc.createElement("p")).setAttribute("id", "key-2").nodeValue("value2");

        document.getElementById("attributes").appendChild(element);
    }

    @Test
    public void testPutUserdata() {
        Document document = generateAttributes();
        Element element = doc.createElement("div");
        element.setAttribute("class", "attributes");

        element.appendChild(doc.createElement("p")).setAttribute("id", "key-1").nodeValue("value1");
        element.appendChild(doc.createElement("p")).setAttribute("id", "key-2").nodeValue("value2");

        element.appendChild(doc.createElement("input"));
        element.appendChild(doc.createElement("input"));

        document.getElementById("attributes").appendChild(element);
    }

    @Test
    public void testRemove() {
        Document document = generateAttributes();
        Element element = doc.createElement("div");
        element.setAttribute("class", "attributes");

        element.appendChild(doc.createElement("p")).setAttribute("id", "key-1").nodeValue("value1");
        element.appendChild(doc.createElement("p")).setAttribute("id", "key-2").nodeValue("value2");

        document.getElementById("attributes").appendChild(element);

        element.removeChild(doc.createElement("input"));
    }

    @Test
    public void testRemoveIgnoreCase() {
        Document document = generateAttributes();
        Element element = doc.createElement("div");
        element.setAttribute("class", "attributes");

        element.appendChild(doc.createElement("p")).setAttribute("id", "key-1").nodeValue("value1");
        element.appendChild(doc.createElement("p")).setAttribute("id", "key-2").nodeValue("value2");

        document.getElementById("attributes").appendChild(element);

        element.removeByName("input");
    }

    @Test
    public void testHasKey() {
        Document document = generateAttributes();
        Element element = doc.createElement("div");
        element.setAttribute("class", "attributes");

        element.appendChild(doc.createElement("p")).setAttribute("id", "key-1").nodeValue("value1");
        element.appendChild(doc.createElement("p")).setAttribute("id", "key-2").nodeValue("value2");

        document.getElementById("attributes").appendChild(element);

        assertTrue(document.getElementById("attributes").hasAttribute("key-1"));
    }

    @Test
    public void testHasDeclaredValueForKey() {
        Document document = generateAttributes();
        Element element = doc.createElement("div");
        element.setAttribute("class", "attributes");

        element.appendChild(doc.createElement("p")).setAttribute("id", "key-1").nodeValue("value1");
        element.appendChild(doc.createElement("p")).setAttribute("id", "key-2").nodeValue("value2");

        document.getElementById("attributes").appendChild(element);

        assertTrue(document.getElementById("attributes").hasAttribute("key-1"));
    }

    @Test
    public void testHasDeclaredValueForKeyIgnoreCase() {
        Document document = generateAttributes();
        Element element = doc.createElement("div");
        element.setAttribute("class", "attributes");

        element.appendChild(doc.createElement("p")).setAttribute("id", "KEY-value").nodeValue("value");
        element.appendChild(doc.createElement("p")).setAttribute("id", "key-2").nodeValue("value2");

        document.getElementById("attributes").appendChild(element);

        assertTrue(document.getElementById("attributes").hasAttribute("KEY-value"));
    }

    @Test
    public void testSize() {
        Document document = generateAttributes();
        int size = document.getElementById("attributes").getElementsByTagName("p").size();

        assertEquals(1, size);
    }

    @Test
    public void testIsEmpty() {
        Document document = generateAttributes();
        assertTrue(document.getElementById("attributes").isEmpty());
        document.getElementById("attributes").appendChild(doc.createElement("p").nodeValue("value"));

        assertFalse(document.getElementById("attributes").isEmpty());
    }

}