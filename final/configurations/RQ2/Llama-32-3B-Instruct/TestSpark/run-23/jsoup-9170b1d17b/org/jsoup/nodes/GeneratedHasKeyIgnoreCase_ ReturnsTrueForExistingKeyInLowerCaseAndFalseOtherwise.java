package org.jsoup.nodes;

public class GeneratedHasKeyIgnoreCase_ ReturnsTrueForExistingKeyInLowerCaseAndFalseOtherwise {

    private MockAttribute attributeMock;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        attributeMock = new MockAttribute();
    }

    @Test
    public void hasKeyIgnoreCase_

    ReturnsTrueForExistingKeyInLowerCaseAndFalseOtherwise() {
        Attributes attributes = new Attributes();
        assertTrue(attributes.hasKeyIgnoreCase("existing-key"));
        assertFalse(attributes.hasKeyIgnoreCase("Non-Existent-Key"));
    }

}