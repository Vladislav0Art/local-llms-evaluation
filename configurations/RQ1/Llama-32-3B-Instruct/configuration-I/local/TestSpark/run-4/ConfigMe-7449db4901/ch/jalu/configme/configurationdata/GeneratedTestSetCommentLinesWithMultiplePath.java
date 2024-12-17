package ch.jalu.configme.configurationdata;

public class GeneratedTestSetCommentLinesWithMultiplePath {

    @Test
    public void testSetCommentLinesWithMultiplePath() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "line1.1");
        config.setComment("path1", "line1.2");
        config.setComment("path2", "line2.1");

        assertEquals(Arrays.asList("line1.1", "line1.2"), config.comments.get("path1"));
        assertEquals(Collections.singletonList("line2.1"), config.comments.get("path2"));
    }

}