package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentNewPathTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentNewPathTest() {
        Map<String, List<String>> expectedCommentsMap = new HashMap<>();
        expectedCommentsMap.put("new", Arrays.asList("line1", "line2"));
        commentsConfiguration = new CommentsConfiguration(expectedCommentsMap);
        commentsConfiguration.setComment("new", "line3");
        assertEquals(expectedCommentsMap, commentsConfiguration.comments);
    }

}