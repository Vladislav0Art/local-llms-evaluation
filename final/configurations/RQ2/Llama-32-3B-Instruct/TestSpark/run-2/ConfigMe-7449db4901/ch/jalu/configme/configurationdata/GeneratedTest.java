package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private String comment;

    public static CommentComparator createCommentComparator(String comment) {
        return new CommentComparator(comment);
    }

    public boolean equals(CommentComparator obj2) {
        if (this == obj2) return true;
        if (!(obj2 instanceof CommentComparator)) return false;
        return this.comment.equals(obj2.comment);
    }
}

public class CommentsComparator {

    private String comments;

    public static CommentsComparator createCommentsComparator(String comments) {
        return new CommentsComparator(comments);
    }

    public boolean equals(CommentsComparator obj2) {
        if (this == obj2) return true;
        if (!(obj2 instanceof CommentsComparator)) return false;
        return this.comments.equals(obj2.comments);
    }
}

public class CommentComparatorTest {

}