package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCommentDoesNotChangeMapOrder {

    @Test
    public void setCommentDoesNotChangeMapOrder() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        String[] commentLines = {"comment1", "\n", "comment2"};
        configuration.setComment("test", commentLines);
        assertEquals(Arrays.asList("\n", "comment1", "comment2"), configuration.comments.get("test"));
    }

}