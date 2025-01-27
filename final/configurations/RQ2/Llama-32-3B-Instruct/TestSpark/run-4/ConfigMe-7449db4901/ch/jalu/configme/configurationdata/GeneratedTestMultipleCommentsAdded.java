package ch.jalu.configme.configurationdata;

public class GeneratedTestMultipleCommentsAdded {

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
    public void testMultipleCommentsAdded() {
        Comments comments = new Comments();
        comments.addComment("commentLine1");
        comments.addComment("commentLine2");
        assertEquals(2, comments.getCommentCount());
    }
}

public class Main {
    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("GeneratedTest");
    }

}