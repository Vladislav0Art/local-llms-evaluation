package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    @Test
    public void constructorComments() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertNotNull(configuration.comments);
    }

    @Test
    public void constructorMapComments() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        comments.put("path2", Collections.unmodifiableList(Arrays.asList("line2")));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertNotNull(configuration.comments);
    }

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

    @Test
    public void getComment() {
        String path = "path";
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> comments = configuration.getAllComments().get(path);
        assertNotNull(comments);
    }

}