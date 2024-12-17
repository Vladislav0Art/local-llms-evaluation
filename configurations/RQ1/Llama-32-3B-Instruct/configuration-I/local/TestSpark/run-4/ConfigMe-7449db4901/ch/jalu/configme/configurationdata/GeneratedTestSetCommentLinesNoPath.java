package ch.jalu.configme.configurationdata;

public class GeneratedTestSetCommentLinesNoPath {

    @Test
    public void testSetCommentLinesNoPath() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertThrows(IndexOutOfBoundsException.class, () -> config.setComment(null, "line1", "line2"));
    }

}