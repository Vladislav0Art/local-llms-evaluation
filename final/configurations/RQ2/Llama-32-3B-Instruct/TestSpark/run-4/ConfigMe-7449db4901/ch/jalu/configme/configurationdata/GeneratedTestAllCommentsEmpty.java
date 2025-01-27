package ch.jalu.configme.configurationdata;

public class GeneratedTestAllCommentsEmpty {

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
    public void testAllCommentsEmpty() {
        Comments comments = new Comments();
        assertEquals(0, comments.getCommentCount());
    }

}