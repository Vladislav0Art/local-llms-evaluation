package ch.jalu.configme.configurationdata;

public class GeneratedTestSetCommentLinesWithNewLine {

    @Test
    public void testSetCommentLinesWithNewLine() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("test", "\n");
        assertEquals(Collections.singletonList(""), config.comments.get("test"));
    }

}