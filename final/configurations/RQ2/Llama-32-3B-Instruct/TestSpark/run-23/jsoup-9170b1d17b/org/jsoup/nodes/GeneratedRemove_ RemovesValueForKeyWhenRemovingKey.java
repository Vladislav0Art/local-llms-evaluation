package org.jsoup.nodes;

public class GeneratedRemove_ RemovesValueForKeyWhenRemovingKey {

    private MockAttribute attributeMock;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        attributeMock = new MockAttribute();
    }

    @Test
    public void remove_

    RemovesValueForKeyWhenRemovingKey() {
        Attributes attributes = new Attributes();
        assertEquals(0, attributes.remove("key").size());
    }

}