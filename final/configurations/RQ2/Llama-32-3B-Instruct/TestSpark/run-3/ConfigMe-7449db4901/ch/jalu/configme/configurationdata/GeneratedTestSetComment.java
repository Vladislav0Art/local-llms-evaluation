package ch.jalu.configme.configurationdata;

public class GeneratedTestSetComment {

    @Test
    public void testSetComment() {
        Map<String, List<String>> commentLinesMap = new HashMap<>();
        commentLinesMap.put("path1", Arrays.asList("line1", "line2"));

        try {
            new CommentsConfiguration(commentLinesMap).setComment(null, "line2");
            assert false;
        } catch (NullPointerException e) {
            // expected
        }
    }

}