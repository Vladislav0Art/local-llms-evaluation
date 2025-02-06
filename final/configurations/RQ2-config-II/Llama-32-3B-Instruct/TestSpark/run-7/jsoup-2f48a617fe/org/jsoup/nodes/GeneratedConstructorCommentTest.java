package org.jsoup.nodes;

public class GeneratedConstructorCommentTest {

    @Test
    public void constructorCommentTest() {
        Comment comment = new Comment("testData");
        assertNotNull(comment);
        assertEquals("testData", comment.getData());
    }

}