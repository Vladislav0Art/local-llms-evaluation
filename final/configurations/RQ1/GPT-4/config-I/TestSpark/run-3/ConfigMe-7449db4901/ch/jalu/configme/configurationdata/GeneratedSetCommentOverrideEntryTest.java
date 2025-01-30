package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentOverrideEntryTest {

    @Test
    public void setCommentOverrideEntryTest() {
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put("path1", List.of("Old Comment"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(initialComments);
        commentsConfiguration.setComment("path1", "New Comment Line");
        List<String> commentsForPath1 = commentsConfiguration.getAllComments().get("path1");
        Assert.assertEquals(List.of("New Comment Line"), commentsForPath1);
    }

}