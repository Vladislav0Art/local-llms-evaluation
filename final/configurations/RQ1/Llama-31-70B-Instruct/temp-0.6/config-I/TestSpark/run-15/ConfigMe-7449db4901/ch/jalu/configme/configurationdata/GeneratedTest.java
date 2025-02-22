package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void setCommentNoCommentsTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("testPath", new String[0]);
        assertNotNull(config.getAllComments().get("testPath"));
        assertEquals(0, config.getAllComments().get("testPath").size());
    }

    @Test
    public void setCommentWithCommentsTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        String[] comments = new String[]{"line 1", "line 2"};
        config.setComment("testPath", comments);
        assertNotNull(config.getAllComments().get("testPath"));
        assertEquals(Arrays.asList(comments), config.getAllComments().get("testPath"));
    }

    @Test
    public void setCommentWithNullPathTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment(null, new String[0]);
        assertNotNull(config.getAllComments().get(null));
    }

    @Test
    public void setCommentWithNullCommentsTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("testPath", null);
        assertNotNull(config.getAllComments().get("testPath"));
        assertEquals(0, config.getAllComments().get("testPath").size());
    }

}