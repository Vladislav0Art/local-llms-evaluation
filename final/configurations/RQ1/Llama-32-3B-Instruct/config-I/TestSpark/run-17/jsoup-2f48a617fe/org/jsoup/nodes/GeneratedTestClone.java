package org.jsoup.nodes;

public class GeneratedTestClone {

    private String data;

    public Comment(String data) {
        this.data = data;
    }

    public static boolean notNull(Object obj) {
        return obj != null && !obj.equals("");
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return notNull(data).equals(notNull(comment.getData()));
    }

    @Override
    public int hashCode() {
        return data.hashCode();
    }

    public Comment clone() {
        return new Comment(this.data);
    }
}

public class TestSpark {

    public static void main(String[] args) {
        // Initialize comment object
        Comment comment = new Comment("Hello, World!");

        // Test notNull method
        System.out.println(notNull(comment));

        // Test equals method
        System.out.println(comment.equals(new Comment("Hello, World!")));

        // Test getData method
        System.out.println(comment.getData());

        // Test toString method
        System.out.println(comment.toString());

        // Test clone method
        Comment clonedComment = comment.clone();
        System.out.println(clonedComment);
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
    public void testClone() {
        Comment comment = new Comment("Hello, World!");
        Comment clonedComment = comment.clone();
        assertEquals(comment, clonedComment);
    }

}