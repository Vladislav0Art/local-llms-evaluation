package org.jsoup.nodes;

public class GeneratedTestMockDocument {

    private String content;

    public MockDocument(String content) {
        this.content = content;
    }

    @Override
    public Comment createComment() {
        return new MockComment(content);
    }
}

class MockLeafNodeAdapter extends LeafNodeAdapter {

    public MockLeafNodeAdapter(String text, String type) {
        super(text, type);
    }

    @Override
    protected void addLeafNodes(IterableLeaf>leaves) throws IOException {
        // implement logic here
    }
}

class MockComment implements Comment {
    private String content;

    public MockComment(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}

class MockDocumentTest extends GeneratedTest {

    @Test
    public void testMockDocument() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Document doc = new MockDocument("Hello World");
        LeafNodeAdapter depth = new MockLeafNodeAdapter("", "root");
        depth.depth(0, doc, outContent, 1, null);
        assertEquals(1, outContent.toString().trim().length());
    }

}