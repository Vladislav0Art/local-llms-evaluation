package org.jsoup.nodes;

public class GeneratedTestMockableTextNodeCoreValue {

    @Test
    public void testMockableTextNodeCoreValue() {
        String coreValue = "Hello, World!";
        MockableTextNode node = new MockableTextNode();

        node.coreValue(coreValue);

        assertTrue(node.coreValueCalled);
        assertEquals(coreValue, node.coreValue());
    }
}

}