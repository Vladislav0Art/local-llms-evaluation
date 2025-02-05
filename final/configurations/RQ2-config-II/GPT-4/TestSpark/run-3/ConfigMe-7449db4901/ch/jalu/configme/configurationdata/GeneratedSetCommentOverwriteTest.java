package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.jetbrains.annotations.UnmodifiableView;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentOverwriteTest {

    @Test
    public void setCommentOverwriteTest() {
        Map<String, List<String>> commentMap = new HashMap<>();
        List<String> oldComments = Arrays.asList("old1", "old2");
        commentMap.put("key", oldComments);
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentMap);
        String[] newComments = {"new1", "new2"};

        commentsConfiguration.setComment("key", newComments);
        assertEquals(commentsConfiguration.getAllComments().get("key"), Arrays.asList(newComments));
    }

}