package ch.jalu.configme.configurationdata;

public class GeneratedTestSingleCommentAdded {

    private List<String> commentList = new ArrayList<>();

    public int getCommentCount() {
        return commentList.size();
    }

    public void addComment(String comment) {
        commentList.add(comment);
    }
}

public class GeneratedTest {

    @Test
    public void testSingleCommentAdded() {
        Comments comments = new Comments();
        comments.addComment("commentLine1");
        assertEquals(1, comments.getCommentCount());
    }

}