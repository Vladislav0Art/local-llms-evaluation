package org.jsoup.nodes;

public class GeneratedTest {

    private MockAttribute attributeMock;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        attributeMock = new MockAttribute();
    }

    @Test
    public void get_

    ReturnsValueForExistingKey() {
        when(attributeMock.getKey()).thenReturn("key");
        Attributes attributes = new Attributes();
        assertEquals(attributeMock.getValue(), attributes.get("key"));
    }

    @Test
    public void getIgnoreCase_

    ReturnsValueForExistingKeyInLowerCase() {
        when(attributeMock.getKey()).thenReturn("KEY");
        Attributes attributes = new Attributes();
        assertEquals(attributeMock.getValue(), attributes.getIgnoreCase("key"));
    }

    @Test
    public void getUserData_

    ReturnsUserDataForExistingKey() {
        when(attributeMock.getKey()).thenReturn("key");
        Attributes attributes = new Attributes();
        assertEquals("user data", attributes.getUserData("key"));
    }

    @Test
    public void getNull_

    ReturnsEmptyStringWhenNoValueExists() {
        Attributes attributes = new Attributes();
        assertNull(attributes.get("non-existent-key"));
    }

    @Test
    public void put_

    SetsNewKeyValueForExistingKey() {
        when(attributeMock.put(anyString(), anyString())).thenReturn(true);
        Attributes attributes = new Attributes();
        assertTrue(attributes.put("key", "value").containsKey("key"));
    }

    @Test
    public void putIgnoreCase_

    SetsNewKeyValueForExistingKeyInLowerCase() {
        when(attributeMock.putIgnoreCase(anyString(), anyString())).thenReturn(true);
        Attributes attributes = new Attributes();
        assertTrue(attributes.putIgnoreCase("key", "value").containsKey("key"));
    }

    @Test
    public void addAll_

    AddsValuesFromIncomingAttributesToOwnMap() {
        MockAttribute incomingAttribute = new MockAttribute();
        when(incomingAttribute.put(anyString(), anyString())).thenReturn(true);
        Attributes attributes = new Attributes();
        assertTrue(attributes.addAll(incomingAttribute));
    }

    @Test
    public void remove_

    RemovesValueForKeyWhenRemovingKey() {
        Attributes attributes = new Attributes();
        assertEquals(0, attributes.remove("key").size());
    }

    @Test
    public void hasKey_

    ReturnsTrueForExistingKeyAndFalseOtherwise() {
        Attributes attributes = new Attributes();
        assertTrue(attributes.hasKey("existing-key"));
        assertFalse(attributes.hasKey("non-existent-key"));
    }

    @Test
    public void hasKeyIgnoreCase_

    ReturnsTrueForExistingKeyInLowerCaseAndFalseOtherwise() {
        Attributes attributes = new Attributes();
        assertTrue(attributes.hasKeyIgnoreCase("existing-key"));
        assertFalse(attributes.hasKeyIgnoreCase("Non-Existent-Key"));
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