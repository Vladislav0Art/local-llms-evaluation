package ch.jalu.configme.configurationdata;

public class GeneratedTestSetAllCommentLinesMultiplePaths {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setup() {
        commentsConfiguration = new CommentsConfiguration();
    }

    /**
     * Test setting the comment lines for a single path.
     */

    @Test
    public void testSetAllCommentLinesMultiplePaths() {
        String[] commentLines1 = {"Hello", "", "World"};
        String[] commentLines2 = {"Foo", "", ""};
        commentsConfiguration.setComment("/path1", commentLines1);
        commentsConfiguration.setComment("/path2", commentLines2);
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(3, allComments.size());
        for (Map.Entry<String, List<String>> entry : allComments.entrySet()) {
            assertEquals(Arrays.asList(commentLines1), entry.getValue());
            assertEquals(Arrays.asList(commentLines2), entry.getValue());
        }
    }

}