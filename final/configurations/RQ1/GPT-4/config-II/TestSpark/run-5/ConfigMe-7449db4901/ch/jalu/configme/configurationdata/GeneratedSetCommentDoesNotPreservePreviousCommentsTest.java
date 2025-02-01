package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;

public class GeneratedSetCommentDoesNotPreservePreviousCommentsTest {

    @Test
    public void setCommentDoesNotPreservePreviousCommentsTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "comment1");
        config.setComment("path", "comment2");

        assertEquals(1, config.getAllComments().size());
        assertEquals(Arrays.asList("comment2"), config.getAllComments().get("path"));
    }

}