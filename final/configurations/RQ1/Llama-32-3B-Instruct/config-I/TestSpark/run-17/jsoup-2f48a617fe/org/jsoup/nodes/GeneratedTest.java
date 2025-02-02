package org.jsoup.nodes;

public class GeneratedTest {

    private String data;

    public void setdata(String data) {
        this.data = data;
    }

    public boolean notNull(Object obj) {
        return obj != null && !obj.equals("");
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return data;
    }
}

public class TestSpark {

    public static void main(String[] args) {
        // Initialize comment object
        Comment comment = new Comment();

        // Test notNull method
        System.out.println(comment.notNull(5));

        // Test getData method
        System.out.println(comment.getData());

        // Test toString method
        System.out.println(comment.toString());
    }

    public static void assertThrows(Class<? extends Throwable> exceptionType, Runnable codeToTest) {
        try {
            codeToTest.run();
        } catch (Throwable e) {
            if (!exceptionType.isInstance(e)) {
                throw new RuntimeException("Expected " + exceptionType.getSimpleName() + " but got " + e.getClass().getSimpleName());
            }
        }
    }

    @Test
    public void CreateCommentWithValidData_ReturnsNewComment() {
        Comment comment = new Comment("Hello, World!");
        assert comment != null;
    }

    @Test
    public void CreateCommentWithEmptyData_ReturnsEmptyComment() {
        Comment comment = new Comment("");
        assert comment.getData().isEmpty();
    }

    @Test
    public void SetDataOnComment_HandlesNullDataCorrectly() {
        Comment comment = new Comment("Hello, World!");
        comment.setData(null);
        assert comment.getData().isEmpty();
    }

    @Test
    public void NodeNameIsCorrect() {
        Comment comment = new Comment("Hello, World!");
        assert comment.nodeName().equals("#comment");
    }

    @Test
    public void getDataOnComment_ReturnsValidData() {
        Comment comment = new Comment("Hello, World!");
        assert comment.getData().equals(comment.value);
    }

    @Test
    public void isXmlDeclaration_ReturnsFalse() {
        Comment comment = new Comment("Hello, World!");
        assert !comment.isXmlDeclaration();
    }

}