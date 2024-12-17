package ch.jalu.configme.configurationdata;

public class GeneratedGetAllCommentsReadOnlyView {

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