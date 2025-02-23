package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private CommentsConfiguration config;

    @Before
    public void setUp() {
        config = new CommentsConfiguration();
    }

    @Test
    public void setComment_validPathAndCommentLines_commentAdded() {
        String path = "test path";
        String[] comment = new String[]{"comment line 1", "comment line 2"};

        config.setComment(path, comment);

        assertEquals(Arrays.asList(comment), config.getAllComments().get(path));
    }

}