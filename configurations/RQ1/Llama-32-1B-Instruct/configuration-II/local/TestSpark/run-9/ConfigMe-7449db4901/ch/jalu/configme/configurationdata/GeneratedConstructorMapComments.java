package ch.jalu.configme.configurationdata;

public class GeneratedConstructorMapComments {

    @Test
    public void constructorMapComments() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        comments.put("path2", Collections.unmodifiableList(Arrays.asList("line2")));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertNotNull(configuration.comments);
    }

}