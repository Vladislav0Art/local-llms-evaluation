package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentExistingPathTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentExistingPathTest() {
        Map<String, List<String>> expectedCommentsMap = new HashMap<>();
        expectedCommentsMap.put("existing", Arrays.asList("line1", "line2"));
        commentsConfiguration = new CommentsConfiguration(expectedCommentsMap);
        commentsConfiguration.setComment("existing", "newLine");
        assertEquals(expectedCommentsMap, commentsConfiguration.comments);
    }

}