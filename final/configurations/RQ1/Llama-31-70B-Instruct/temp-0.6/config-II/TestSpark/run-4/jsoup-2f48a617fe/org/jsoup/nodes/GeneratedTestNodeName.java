package org.jsoup.nodes;

public class GeneratedTestNodeName {

    Comment comment;

    @BeforeEach
    public void setUp() {
        comment = new Comment("test");
    }

    @Test
    public void testNodeName() {
        assertEquals("#comment", comment.nodeName());
    }

}