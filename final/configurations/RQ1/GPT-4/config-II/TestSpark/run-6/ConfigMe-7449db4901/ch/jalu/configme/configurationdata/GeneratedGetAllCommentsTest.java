package ch.jalu.configme.configurationdata;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("path1", Arrays.asList("This is a comment on path1"));
        commentMap.put("path2", Arrays.asList("This is a comment on path2"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentMap);
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();

        Assert.assertEquals(2, allComments.size());
        Assert.assertEquals(Arrays.asList("This is a comment on path1"), allComments.get("path1"));
        Assert.assertEquals(Arrays.asList("This is a comment on path2"), allComments.get("path2"));
    }

}