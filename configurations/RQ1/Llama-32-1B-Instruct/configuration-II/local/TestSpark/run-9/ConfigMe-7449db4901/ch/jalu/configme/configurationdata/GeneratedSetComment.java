package ch.jalu.configme.configurationdata;

public class GeneratedSetComment {

    @Test
    public void setComment() {
        String path = "path";
        String commentLines[] = {"line"};
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment(path, commentLines);
        List<String> commentLinesList = configuration.getAllComments().get(path).stream()
                .map(List::toString)
                .collect(Collectors.toList());
        assertEquals(commentLines, commentLinesList);
    }

}