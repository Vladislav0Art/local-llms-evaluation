package org.jsoup.nodes;

public class GeneratedPut_ SetsNewKeyValueForExistingKey {

    private MockAttribute attributeMock;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        attributeMock = new MockAttribute();
    }

    @Test
    public void put_

    SetsNewKeyValueForExistingKey() {
        when(attributeMock.put(anyString(), anyString())).thenReturn(true);
        Attributes attributes = new Attributes();
        assertTrue(attributes.put("key", "value").containsKey("key"));
    }

}