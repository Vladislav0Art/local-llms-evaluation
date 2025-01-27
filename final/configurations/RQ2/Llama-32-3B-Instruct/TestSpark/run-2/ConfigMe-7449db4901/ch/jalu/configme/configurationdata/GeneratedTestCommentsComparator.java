package ch.jalu.configme.configurationdata;

public class GeneratedTestCommentsComparator {

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
    public void testCommentsComparator() {
        String comments1 = "This is a comment";
        String comments2 = "Another comment";

        CommentsComparator comparator1 = new CommentsComparator(comments1);
        CommentsComparator comparator2 = new CommentsComparator(comments1);

        assertTrue(CommentsComparator.equals(comparator1, comparator2));
        assertFalse(CommentsComparator.equals(comparator1, new CommentsComparator(comments2)));
    }

}