package ch.jalu.configme.configurationdata;

public class GeneratedConstructorWithComments_ReturnsCorrectComments {

    @Test
    public void constructorWithComments_ReturnsCorrectComments() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path", Arrays.asList("line1", "line2"));
        CommentsConfiguration comments = new CommentsConfiguration(map);
        Map<String, List<String>> commentsMap = comments.getComments();
        assertThat(commentsMap, is(map));
    }

}