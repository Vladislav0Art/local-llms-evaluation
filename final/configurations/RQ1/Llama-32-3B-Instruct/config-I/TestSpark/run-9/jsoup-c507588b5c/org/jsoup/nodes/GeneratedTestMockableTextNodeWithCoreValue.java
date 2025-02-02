package org.jsoup.nodes;

public class GeneratedTestMockableTextNodeWithCoreValue {

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
    public void testMockableTextNodeWithCoreValue() {
        String coreValue = "&lt;Hello&gt;, World!";
        MockableTextNode node = new MockableTextNode();

        assertFalse(node.coreValueCalled);

        node.coreValue(coreValue);
        assertEquals("&lt;Hello&gt;, World!", node.coreValue());

        assertTrue(node.coreValueCalled);
    }
}

}