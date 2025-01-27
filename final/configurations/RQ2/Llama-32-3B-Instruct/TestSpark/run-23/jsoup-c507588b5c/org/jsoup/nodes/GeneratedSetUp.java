package org.jsoup.nodes;

public class GeneratedSetUp {

    @Test
    public void setUp() {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}

public class MockTextNode extends TextNode {

    private String text;

    public MockTextNode(String text) {
        this.text = text;
    }

    @Override
    public String text() {
        return text;
    }

    public static MockTextNode node(String text) {
        return new MockTextNode(text);
    }

}