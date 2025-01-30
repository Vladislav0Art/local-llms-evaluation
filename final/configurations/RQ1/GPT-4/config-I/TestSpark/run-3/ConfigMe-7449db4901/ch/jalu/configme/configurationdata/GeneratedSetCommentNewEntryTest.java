package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentNewEntryTest {

    @Test
    public void setCommentNewEntryTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", "Comment Line");
        List<String> commentsForPath1 = commentsConfiguration.getAllComments().get("path1");
        Assert.assertEquals(List.of("Comment Line"), commentsForPath1);
    }

}