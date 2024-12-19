package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentSoleLine {

    @Test
    public void setCommentSoleLine() {
        String path = "path";
        String commentLines[] = {"line"};
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment(path, commentLines);
        List<String> commentLinesList = configuration.getAllComments().get(path).stream()
                .map(List::toString)
                .collect(Collectors.toList());
        assertEquals(1, commentLinesList.size());
    }

}