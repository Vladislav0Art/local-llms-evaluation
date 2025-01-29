package ch.jalu.configme.configurationdata;

public class GeneratedTestGetCommentSinglePath {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setup() {
        commentsConfiguration = new CommentsConfiguration();
    }

    /**
     * Test setting the comment lines for a single path.
     */

    @Test
    public void testGetCommentSinglePath() {
        String[] commentLines = {"Hello", "", "World"};
        commentsConfiguration.setComment("/path1", commentLines);
        assertEquals(Arrays.asList(commentLines), commentsConfiguration.getAllComments().get("/path1"));
    }

}