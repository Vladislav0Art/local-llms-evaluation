package org.jsoup.nodes;

public class GeneratedCloneCommentsContent {

    @Test
    public void cloneCommentsContent() {
        // given:
        Comment comment = new Comment("Hello, World!");
        Comment clonedComment = comment.clone();

        // when:
        String data = clonedComment.getData();
        assertEquals(comment.getData(), data);

        // verify:
        assertNotNull(clonedComment);
        assertTrue(clonedComment instanceof Comment);
    }

}