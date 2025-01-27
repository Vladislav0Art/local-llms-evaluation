package org.jsoup.nodes;

public class GeneratedHtml_ ReturnsHtmlRepresentationOfAttributesAsString {

    private MockAttribute attributeMock;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        attributeMock = new MockAttribute();
    }

    @Test
    public void html_

    ReturnsHtmlRepresentationOfAttributesAsString() {
        Attributes attributes = new Attributes();
        assertNotNull(attributes.html());
    }
}

public class MockAttribute {

    private String key;
    private Object value;

    public void put(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public boolean putIgnoreCase(String key, Object value) {
        if (key.equalsIgnoreCase(this.key)) {
            return true;
        }
        return false;
    }

    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }

}