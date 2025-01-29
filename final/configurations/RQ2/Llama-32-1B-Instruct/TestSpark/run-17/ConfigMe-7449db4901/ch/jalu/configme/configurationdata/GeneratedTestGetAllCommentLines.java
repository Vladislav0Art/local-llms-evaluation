package ch.jalu.configme.configurationdata;

public class GeneratedTestGetAllCommentLines {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setup() {
        commentsConfiguration = new CommentsConfiguration();
    }

    /**
     * Test setting the comment lines for a single path.
     */

    @Test
    public void testGetAllCommentLines() {
        String[] commentLines = {"Hello", "", "World"};
        commentsConfiguration.setComment("/path", commentLines);
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(2, allComments.size());
        assertEquals(Arrays.asList(commentLines), allComments.get("/path"));
    }

}