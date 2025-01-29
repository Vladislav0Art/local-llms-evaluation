package ch.jalu.configme.configurationdata;

public class GeneratedTestSetCommentEmptyPath {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setup() {
        commentsConfiguration = new CommentsConfiguration();
    }

    /**
     * Test setting the comment lines for a single path.
     */

    @Test
    public void testSetCommentEmptyPath() {
        commentsConfiguration.setComment("", commentLines);
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(2, allComments.size());
        assertEquals(Arrays.asList(commentLines), allComments.get("/path"));
    }

}