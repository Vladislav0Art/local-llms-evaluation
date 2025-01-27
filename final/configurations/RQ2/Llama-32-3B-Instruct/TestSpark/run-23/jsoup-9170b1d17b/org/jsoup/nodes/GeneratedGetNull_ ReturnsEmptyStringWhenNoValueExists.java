package org.jsoup.nodes;

public class GeneratedGetNull_ ReturnsEmptyStringWhenNoValueExists {

    private MockAttribute attributeMock;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        attributeMock = new MockAttribute();
    }

    @Test
    public void getNull_

    ReturnsEmptyStringWhenNoValueExists() {
        Attributes attributes = new Attributes();
        assertNull(attributes.get("non-existent-key"));
    }

}