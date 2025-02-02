package org.jsoup.nodes;

public class GeneratedTestMockableTextNodeUnescape {

    @Test
    public void testMockableTextNodeUnescape() {
        String coreValue = "&lt;Hello&gt;, World!";
        MockableTextNode node = new MockableTextNode();

        node.coreValue(coreValue);

        assertTrue(node.coreValueCalled);
        assertEquals("&lt;Hello&gt;, World!", node.coreValue());
    }
}

}