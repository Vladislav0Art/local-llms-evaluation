package org.jsoup.nodes;

public class GeneratedTest {

    private Element element;

    @Before
    public void setUp() {
        element = new Element("test")
    }

    @Test
    public void testHasChildNodes() {
        assertTrue(element.hasChildNodes());
    }

    @Test
    public void testEnsureChildNodes() {
        assertTrue(element.ensureChildNodes().size() > 0);
    }

    @Test
    public void testHasAttributes() {
        assertTrue(element.hasAttributes());
    }

    @Test
    public void testBaseUri() {
        String uri = "http://example.com";
        element.baseUri(uri);
        assertEquals(uri, element.baseUri());
    }

    @Test
    public void testTagName() {
        String tagName = "testTagName";
        element.tagName(tagName);
        assertEquals(tagName, element.tagName());
    }

    @Test
    public void testIsBlock() {
        element.tagName("div");
        assertTrue(element.isBlock());
    }

    @Test
    public void testId() {
        String id = "testId";
        element.id(id);
        assertEquals(id, element.id());
    }

    @Test
    public void testAttr() {
        String attributeKey = "testKey";
        String attributeValue = "testValue";
        element.attr(attributeKey, attributeValue);
        assertEquals(attributeValue, element.attr(attributeKey));
    }

    @Test
    public void testAttrBoolean() {
        String attributeKey = "testKey";
        element.attr(attributeKey, true);
        assertEquals("true", element.attr(attributeKey));
    }

}