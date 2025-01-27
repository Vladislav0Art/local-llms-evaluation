package ch.jalu.configme.configurationdata;

public class GeneratedTestCommentComparator {

    private String comment;

    public CommentComparator(String comment) {
        this.comment = comment;
    }

    public static boolean equals(CommentComparator obj1, CommentComparator obj2) {
        if (obj1 == obj2) return true;
        if (!(obj1 instanceof CommentComparator)) return false;
        if (!(obj2 instanceof CommentComparator)) return false;
        return obj1.comment.equals(obj2.comment);
    }
}

public class CommentsComparator {

    private String comments;

    public CommentsComparator(String comments) {
        this.comments = comments;
    }

    public static boolean equals(CommentsComparator obj1, CommentsComparator obj2) {
        if (obj1 == obj2) return true;
        if (!(obj1 instanceof CommentsComparator)) return false;
        if (!(obj2 instanceof CommentsComparator)) return false;
        return obj1.comments.equals(obj2.comments);
    }
}

public class CommentComparatorTest {

    @Test
    public void testCommentComparator() {
        String comment1 = "This is a comment";
        String comment2 = "This is another comment";

        CommentComparator comparator1 = new CommentComparator(comment1);
        CommentComparator comparator2 = new CommentComparator(comment1);

        assertTrue(CommentComparator.equals(comparator1, comparator2));
        assertFalse(CommentComparator.equals(comparator1, new CommentComparator(comment2)));
    }

}