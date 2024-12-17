package ch.jalu.configme.configurationdata;

public class GeneratedTestSetCommentLinesWithNoNewLine {

    @Test
    public void testSetCommentLinesWithNoNewLine() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("test", "line1", "line2");
        assertEquals(Arrays.asList("line1", "line2"), config.comments.get("test"));
    }

}