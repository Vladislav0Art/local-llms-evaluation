package ch.jalu.configme.configurationdata;

public class GeneratedGetComments_ReadOnlyView {

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

}