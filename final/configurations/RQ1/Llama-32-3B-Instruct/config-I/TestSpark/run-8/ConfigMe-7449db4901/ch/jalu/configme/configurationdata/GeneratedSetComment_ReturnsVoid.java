package ch.jalu.configme.configurationdata;

public class GeneratedSetComment_ReturnsVoid {

    @Test
    public void setComment_ReturnsVoid() {
        CommentsConfiguration comments = new CommentsConfiguration();
        Map<String, List<String>> expected = new HashMap<>();
        CommentsConfiguration result = comments.setComment("path", Arrays.asList("line1", "line2"));
        assertNull(result.getComments());
    }

}