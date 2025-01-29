package ch.jalu.configme.configurationdata;

public class GeneratedTestGetComment {

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setup() {
        commentsConfiguration = new CommentsConfiguration();
    }

    /**
     * Test setting the comment lines for a single path.
     */

    @Test
    public void testGetComment() {
        String[] commentLines = {"Hello", "", "World"};
        commentsConfiguration.setComment("/path", commentLines);
        assertEquals(Arrays.asList(commentLines), commentsConfiguration.getAllComments().get("/path"));
    }

}