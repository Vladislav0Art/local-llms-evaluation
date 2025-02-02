package org.jsoup.nodes;

public class GeneratedTestMockableTextNodeCoreValueCalled {

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
    public void testMockableTextNodeCoreValueCalled() {
        MockableTextNode node = new MockableTextNode();

        assertFalse(node.coreValueCalled);

        node.coreValue("test");
        assertEquals("test", node.coreValue());

        assertTrue(node.coreValueCalled);
    }
}

}