package org.jsoup.nodes;

public class GeneratedTestClone {

    Comment comment;

    @BeforeEach
    public void setUp() {
        comment = new Comment("test");
    }

    @Test
    public void testClone() {
        Comment commentClone = comment.clone();
        assertEquals(comment.getData(), commentClone.getData());
    }

}