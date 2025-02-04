package ch.jalu.configme.configurationdata;

public class GeneratedSetEmptyPathTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setEmptyPathTest() {
        Map<String, List<String>> expectedCommentsMap = new HashMap<>();
        commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("", Arrays.asList("line1", "line2"));
        assertEquals(expectedCommentsMap, commentsConfiguration.comments);
    }

}