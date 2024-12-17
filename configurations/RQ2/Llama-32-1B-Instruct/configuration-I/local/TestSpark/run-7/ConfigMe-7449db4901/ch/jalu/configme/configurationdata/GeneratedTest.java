package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    @Test
    public void commentsConfigurationConstructorTest() {
        String[][] comments = {"line1\ncomment1", "line2"};
        Map<String, List<String>> map = new HashMap<>();
        map.put("path", new ArrayList<>(Arrays.asList(comments[0].split("\n"))));

        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", comments[1]);
        configuration.setComment("another path", "line3\ncomment2");

        assertEquals(map, configuration.getAllComments());
    }

    @Test
    public void setComment_SingleLineTest() {
        Map<String, List<String>> map = new HashMap<>();
        String comment = "line1";
        map.put("path", Arrays.asList(comment));

        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", comment);

        assertEquals(0L, map.get("path").size(), 1);
    }

    @Test
    public void setComment_MultipleLines() {
        String[][] comments = {"line1\ncomment1", "line2"};
        Map<String, List<String>> map = new HashMap<>();
        map.put("path", Arrays.asList(comments[0].split("\n")));

        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", comments[1]);
        configuration.setComment("another path", "line3\ncomment2");

        assertEquals(0L, map.get("path").size(), 1);
    }

    @Test
    public void getComments_ReadOnlyView() {
        Map<String, List<String>> map = new HashMap<>();
        String[][] comments = {"line1\ncomment1", "line2"};
        map.put("path", Arrays.asList(comments[0].split("\n")));

        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", comments[1]);

        Map<String, @UnmodifiableView List<String>> result = configuration.getAllComments();

        assertEquals(map, result);
    }

    @Test
    public void setCommentPathNotFound() {
        String[][] comments = {"line1\ncomment1", "line2"};
        Map<String, List<String>> map = new HashMap<>();
        map.put("path", Arrays.asList(comments[0].split("\n")));

        CommentsConfiguration configuration = new CommentsConfiguration();
        configurer.setComment("path", comments[1]);

        assertEquals(0L, map.get("path").size(), 1);
    }

    @Test
    public void setCommentInvalidPath() {
        String[][] comments = {"line1\ncomment1", "line2"};
        Map<String, List<String>> map = new HashMap<>();
        map.put("path", Arrays.asList(comments[0].split("\n")));

        CommentsConfiguration configuration = new CommentsConfiguration();
        configurer.setComment("another path", "line3");

        assertEquals(0L, map.get("path").size(), 1);
    }

    @Test
    public void getAllCommentsReadOnlyView() {
        Map<String, List<String>> map = new HashMap<>();
        String[][] comments = {"line1\ncomment1", "line2"};
        map.put("path", Arrays.asList(comments[0].split("\n")));

        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment("path", comments[1]);

        Map<String, @UnmodifiableView List<String>> result = configuration.getAllComments();

        assertEquals(map, result);
    }

    private interface Configurer {
        void setComment(String path, String... commentLines);

        Map<String, List<String>> getAllComments();
    }

}