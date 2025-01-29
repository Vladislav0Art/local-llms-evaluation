package ch.jalu.configme.configurationdata;

public class GeneratedTestSetAllCommentLines {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setup() {
        commentsConfiguration = new CommentsConfiguration();
    }

    /**
     * Test setting the comment lines for a single path.
     */

    @Test
    public void testSetAllCommentLines() {
        String[] commentLines = {"Hello", "", "World"};
        commentsConfiguration.setComment("/path1", commentLines);
        commentsConfiguration.setComment("/path2", commentLines);
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(3, allComments.size());
        for (Map.Entry<String, List<String>> entry : allComments.entrySet()) {
            assertEquals(Arrays.asList(commentLines), entry.getValue());
        }
    }

}