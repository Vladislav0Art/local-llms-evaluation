package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Collections;
import java.util.Map;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("testPath", "commentLine1", "commentLine2");

        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        assertEquals(1, allComments.size());
        assertEquals(Arrays.asList("commentLine1", "commentLine2"), allComments.get("testPath"));
    }

}