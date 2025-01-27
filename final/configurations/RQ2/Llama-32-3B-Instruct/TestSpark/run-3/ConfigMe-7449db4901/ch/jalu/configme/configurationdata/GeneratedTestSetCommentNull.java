package ch.jalu.configme.configurationdata;

public class GeneratedTestSetCommentNull {

    @Test
    public void testSetCommentNull() {
        Map<String, List<String>> commentLinesMap = new HashMap<>();

        try {
            new CommentsConfiguration(commentLinesMap).setComment("path1", null);
            assert false;
        } catch (NullPointerException e) {
            // expected
        }
    }

}