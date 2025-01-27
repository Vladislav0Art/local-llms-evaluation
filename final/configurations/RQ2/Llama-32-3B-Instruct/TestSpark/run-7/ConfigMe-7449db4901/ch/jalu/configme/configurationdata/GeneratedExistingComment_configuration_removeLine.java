package ch.jalu.configme.configurationdata;

public class GeneratedExistingComment_configuration_removeLine {

    @Test
    public void existingComment_configuration_removeLine() {
        String comment = "# Comment";
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("key", Collections.singletonList(comment));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        config.removeLine();
        List<String> result = config.getAllComments();
        assertEquals(0, result.size());
    }

}