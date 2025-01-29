package ch.jalu.configme.configurationdata;

public class GeneratedTestGetCommentMultiplePaths {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setup() {
        commentsConfiguration = new CommentsConfiguration();
    }

    /**
     * Test setting the comment lines for a single path.
     */

    @Test
    public void testGetCommentMultiplePaths() {
        String[] commentLines1 = {"Hello", "", "World"};
        String[] commentLines2 = {"Foo", "", ""};
        commentsConfiguration.setComment("/path1", commentLines1);
        commentsConfiguration.setComment("/path2", commentLines2);
        assertEquals(Arrays.asList(commentLines1), commentsConfiguration.getAllComments().get("/path1"));
        assertEquals(Arrays.asList(commentLines2), commentsConfiguration.getAllComments().get("/path2"));
    }

}