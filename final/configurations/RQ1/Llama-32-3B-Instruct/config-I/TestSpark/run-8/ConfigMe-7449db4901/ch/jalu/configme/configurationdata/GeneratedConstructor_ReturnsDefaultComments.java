package ch.jalu.configme.configurationdata;

public class GeneratedConstructor_ReturnsDefaultComments {

    @Test
    public void constructor_ReturnsDefaultComments() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> commentsMap = comments.getComments();
        assertThat(commentsMap, is(Collections.emptyMap()));
    }

}