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

public class GeneratedSetCommentWithNullCommentsTest {

    @Test
    public void setCommentWithNullCommentsTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("testPath", null);
        assertNotNull(config.getAllComments().get("testPath"));
        assertEquals(0, config.getAllComments().get("testPath").size());
    }

}