package ch.jalu.configme.configurationdata;

public class GeneratedCommentsConfigurationConstructorTest {

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

}