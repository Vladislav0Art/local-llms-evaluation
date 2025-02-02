package org.jsoup.nodes;

public class GeneratedTestMockableTextNodeCoreValueNotCalled {

    private boolean coreValueCalled = false;

    public void coreValue(String coreValue) {
        this.coreValueCalled = true;
    }

    public String coreValue() {
        return coreValue;
    }
}

public class TestMockableTextNodeNoWhitespace {

    @Test
    public void testMockableTextNodeCoreValueNotCalled() {
        MockableTextNode node = new MockableTextNode();

        assertFalse(node.coreValueCalled);

        node.coreValue("test");
        assertEquals("", node.coreValue());

        assertFalse(node.coreValueCalled);
    }

}