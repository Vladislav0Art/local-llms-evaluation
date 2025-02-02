package org.jsoup.nodes;

public class GeneratedTestMockableTextNodeNoWhitespace {

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
    public void testMockableTextNodeNoWhitespace() {
        MockableTextNode node = new MockableTextNode();

        assertFalse(node.coreValueCalled);

        node.coreValue("Hello");
        assertEquals("Hello", node.coreValue());

        assertTrue(node.coreValueCalled);
    }
}

}