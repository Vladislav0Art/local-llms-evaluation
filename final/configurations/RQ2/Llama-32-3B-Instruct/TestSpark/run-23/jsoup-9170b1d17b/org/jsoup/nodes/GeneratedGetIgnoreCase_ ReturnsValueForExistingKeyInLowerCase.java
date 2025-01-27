package org.jsoup.nodes;

public class GeneratedGetIgnoreCase_ ReturnsValueForExistingKeyInLowerCase {

    private MockAttribute attributeMock;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        attributeMock = new MockAttribute();
    }

    @Test
    public void getIgnoreCase_

    ReturnsValueForExistingKeyInLowerCase() {
        when(attributeMock.getKey()).thenReturn("KEY");
        Attributes attributes = new Attributes();
        assertEquals(attributeMock.getValue(), attributes.getIgnoreCase("key"));
    }

}