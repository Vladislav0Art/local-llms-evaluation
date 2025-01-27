package ch.jalu.configme.configurationdata;

public class GeneratedExistingComment_configuration_addLine {

    @Test
    public void existingComment_configuration_addLine() {
        String comment = "# Comment";
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("key", Collections.singletonList(comment));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        List<String> result = config.getAllComments();
        assertEquals(1, result.size());
        assertEquals(comment, result.get(0));
    }

}