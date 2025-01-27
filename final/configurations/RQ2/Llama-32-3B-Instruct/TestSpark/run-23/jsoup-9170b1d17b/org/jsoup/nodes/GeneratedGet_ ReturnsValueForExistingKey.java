package org.jsoup.nodes;

public class GeneratedGet_ ReturnsValueForExistingKey {

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

}