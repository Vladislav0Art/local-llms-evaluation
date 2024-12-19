package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.mockito.Mockito.*;

import java.util.*;

public class GeneratedTestSetComment {

    @Test
    public void testSetComment() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", Arrays.asList("line1", "line2"));
        when(comments.get("path")).thenReturn(Arrays.asList("", ""));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        config.setComment("path", "", "");
        Assert.assertEquals(0, config.getAllComments().size());
    }

}