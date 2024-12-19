package ch.jalu.configme.configurationdata;

public class GeneratedSetCommentEmptyLine {

    @Test
    public void setCommentEmptyLine() {
        String path = "path";
        String[] commentLines = {"\nline"};
        CommentsConfiguration configuration = new CommentsConfiguration();
        configuration.setComment(path, commentLines);
        List<String> commentLinesList = configuration.getAllComments().get(path).stream()
                .map(List::toString)
                .collect(Collectors.toList());
        assertEquals(1, commentLinesList.size());
    }

}