package ch.jalu.configme.configurationdata;

public class GeneratedTestSetCommentEmpty {

    @Test
    public void testSetCommentEmpty() {
        Map<String, List<String>> commentLinesMap = new HashMap<>();

        try {
            new CommentsConfiguration(commentLinesMap).setComment("path1", "");
            assert false;
        } catch (NullPointerException e) {
            // expected
        }
    }

}