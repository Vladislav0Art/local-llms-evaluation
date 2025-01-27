package org.jsoup.nodes;

public class GeneratedPutIgnoreCase_ SetsNewKeyValueForExistingKeyInLowerCase {

    private MockAttribute attributeMock;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        attributeMock = new MockAttribute();
    }

    @Test
    public void putIgnoreCase_

    SetsNewKeyValueForExistingKeyInLowerCase() {
        when(attributeMock.putIgnoreCase(anyString(), anyString())).thenReturn(true);
        Attributes attributes = new Attributes();
        assertTrue(attributes.putIgnoreCase("key", "value").containsKey("key"));
    }

}