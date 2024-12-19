package org.jsoup.nodes;

public class GeneratedClone Returns a new
instance of
the comment {

@Test
public void clone
Returns a new
instance of

the comment() {
    Comment comment = new Comment("data");
    Comment clonedComment = comment.clone();
    assertNotNull(clonedComment);
    assertEquals(comment, clonedComment);
}

}