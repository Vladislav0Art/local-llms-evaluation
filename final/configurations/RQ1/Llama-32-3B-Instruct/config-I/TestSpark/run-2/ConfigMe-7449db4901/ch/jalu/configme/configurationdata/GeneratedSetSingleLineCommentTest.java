package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedSetSingleLineCommentTest {

    @Test
    public void setSingleLineCommentTest() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Arrays.asList("line1", "line2"));
        configuration.setComment("path1", "\n");
        assertEquals(Collections.unmodifiableList(Arrays.asList("", "line1", "line2")), configuration.comments.get("path1"));
    }

}