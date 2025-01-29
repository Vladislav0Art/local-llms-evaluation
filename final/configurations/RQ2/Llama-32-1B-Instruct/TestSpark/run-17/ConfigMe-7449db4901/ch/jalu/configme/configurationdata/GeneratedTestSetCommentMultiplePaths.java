package ch.jalu.configme.configurationdata;

public class GeneratedTestSetCommentMultiplePaths {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setup() {
        commentsConfiguration = new CommentsConfiguration();
    }

    /**
     * Test setting the comment lines for a single path.
     */

    @Test
    public void testSetCommentMultiplePaths() {
        String[] commentLines1 = {"Hello", "", "World"};
        String[] commentLines2 = {"Foo", "", ""};
        commentsConfiguration.setComment("/path1", commentLines1);
        commentsConfiguration.setComment("/path2", commentLines2);
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(3, allComments.size());
        assertEquals(Arrays.asList(commentLines1), allComments.get("/path1"));
        assertEquals(Arrays.asList(commentLines2), allComments.get("/path2"));
    }

}