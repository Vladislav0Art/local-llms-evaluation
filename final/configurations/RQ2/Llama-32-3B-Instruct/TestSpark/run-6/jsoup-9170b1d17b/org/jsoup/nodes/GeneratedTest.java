package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTest {

    @Test
    public void testParse() throws IOException {
        Document doc = Jsoup.parse("<a>value</a><b>value</b>");
        assertNotNull(doc);
    }

    @Test
    public void addAttributeWithNullValueReturnsNewAttributesInstance() {
        Attributes attributes = new Attributes();
        assertEquals(1, attributes.size());
    }

    @Test
    public void addingExistingKeyIncreasesSize() throws IOException {
        Document doc = Jsoup.parse("a=\"value\" b=\"value\"");
        Attributes attributes = doc.attributes();
        assertEquals(2, attributes.size());
    }

    @Test
    public void nullValueReturnsNewAttributesInstance() {
        Attributes attributes = new Attributes();
        assertEquals(0, attributes.size());
    }

    @Test
    public void addingExistingKeyIncreasesSizeAgain() throws IOException {
        Document doc = Jsoup.parse("a=\"value\" b=\"value\"");
        Attributes attributes = doc.attributes();
        assertEquals(2, attributes.size());
    }

    @Test
    public void removingExistingKeyDecreasesSize() throws IOException {
        Document doc = Jsoup.parse("a=\"value\" b=\"value\"");
        Attributes attributes = doc.attributes();
        assertEquals(2, attributes.size());
        attributes.remove("a");
        assertEquals(1, attributes.size());
    }

    @Test
    public void addingNewKeyIncreasesSize() throws IOException {
        Document doc = Jsoup.parse("a=\"value\" b=\"value\"");
        Attributes attributes = doc.attributes();
        assertEquals(2, attributes.size());
        attributes.add("c", "value");
        assertEquals(3, attributes.size());
    }

    @Test
    public void updatingExistingKeyIncreasesSize() throws IOException {
        Document doc = Jsoup.parse("a=\"value\" b=\"value\"");
        Attributes attributes = doc.attributes();
        assertEquals(2, attributes.size());
        attributes.update("b", "new value");
        assertEquals(2, attributes.size());
    }

    @Test
    public void removingNonExistingKeyDoesNotChangeSize() throws IOException {
        Document doc = Jsoup.parse("a=\"value\" b=\"value\"");
        Attributes attributes = doc.attributes();
        assertEquals(2, attributes.size());
        attributes.remove("c");
        assertEquals(2, attributes.size());
    }

    @Test
    public void updatingNonExistingKeyDoesNotChangeSize() throws IOException {
        Document doc = Jsoup.parse("a=\"value\" b=\"value\"");
        Attributes attributes = doc.attributes();
        assertEquals(2, attributes.size());
        attributes.update("c", "new value");
        assertEquals(2, attributes.size());
    }

    @Test
    public void setExistingKeyUpdatesValue() throws IOException {
        Document doc = Jsoup.parse("a=\"value\" b=\"value\"");
        Attributes attributes = doc.attributes();
        assertEquals("value", attributes.get("a"));
        attributes.set("a", "new value");
        assertEquals("new value", attributes.get("a"));
    }

    @Test
    public void setNonExistingKeyDoesNotChangeValue() throws IOException {
        Document doc = Jsoup.parse("a=\"value\" b=\"value\"");
        Attributes attributes = doc.attributes();
        attributes.set("c", "new value");
        assertEquals("", attributes.get("c"));
    }
}

}