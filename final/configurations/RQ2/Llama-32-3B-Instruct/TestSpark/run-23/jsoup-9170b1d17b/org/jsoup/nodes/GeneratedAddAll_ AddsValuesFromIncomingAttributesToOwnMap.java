package org.jsoup.nodes;

public class GeneratedAddAll_ AddsValuesFromIncomingAttributesToOwnMap {

    private MockAttribute attributeMock;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        attributeMock = new MockAttribute();
    }

    @Test
    public void addAll_

    AddsValuesFromIncomingAttributesToOwnMap() {
        MockAttribute incomingAttribute = new MockAttribute();
        when(incomingAttribute.put(anyString(), anyString())).thenReturn(true);
        Attributes attributes = new Attributes();
        assertTrue(attributes.addAll(incomingAttribute));
    }

}