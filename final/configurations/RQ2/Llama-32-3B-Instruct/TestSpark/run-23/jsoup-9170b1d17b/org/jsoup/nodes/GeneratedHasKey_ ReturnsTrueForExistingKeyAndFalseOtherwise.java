package org.jsoup.nodes;

public class GeneratedHasKey_ ReturnsTrueForExistingKeyAndFalseOtherwise {

    private MockAttribute attributeMock;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        attributeMock = new MockAttribute();
    }

    @Test
    public void hasKey_

    ReturnsTrueForExistingKeyAndFalseOtherwise() {
        Attributes attributes = new Attributes();
        assertTrue(attributes.hasKey("existing-key"));
        assertFalse(attributes.hasKey("non-existent-key"));
    }

}