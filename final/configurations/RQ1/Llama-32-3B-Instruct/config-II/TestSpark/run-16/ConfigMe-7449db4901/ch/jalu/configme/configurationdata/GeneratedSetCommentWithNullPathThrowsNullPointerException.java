package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCommentWithNullPathThrowsNullPointerException {

    @Test
    public void setCommentWithNullPathThrowsNullPointerException() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertThrows(NullPointerException.class, () -> configuration.setComment(null, "comment"));
    }

    private int getCommentCount(CommentsConfiguration configuration) {
        return configuration.comments.size();
    }

}