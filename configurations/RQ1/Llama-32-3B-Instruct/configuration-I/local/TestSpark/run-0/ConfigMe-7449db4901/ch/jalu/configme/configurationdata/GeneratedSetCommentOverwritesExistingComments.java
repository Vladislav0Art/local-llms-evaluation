package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import javax.annotation.Resource;

public class GeneratedSetCommentOverwritesExistingComments {

    @Resource
    public static final CommentsConfiguration instance = new CommentsConfiguration();

    @Test
    public void setCommentOverwritesExistingComments() {
        Map<String, List<String>> mockComments = new HashMap<>();
        when(instance.comments.put("path", Mockito.anyList())).thenReturn(mockComments);
        instance.setComment("path", "line1");
        instance.setComment("path", "line2");
        assertTrue((instance.comments.containsKey("path")));
        assertEquals(Arrays.asList(), (List) instance.comments.get("path"));
    }

}