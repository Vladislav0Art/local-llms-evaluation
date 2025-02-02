package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import ch.jalu.configme.ConfigurationDataTestBase;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentMultipleLinesTest {

    @Test
    public void setCommentMultipleLinesTest() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path1", "line1\nline2");
        assertEquals(2, config.comments.size());
        assertTrue(config.comments.get("path1").contains("line1"));
        assertTrue(config.comments.get("path1").contains("line2"));
    }

}