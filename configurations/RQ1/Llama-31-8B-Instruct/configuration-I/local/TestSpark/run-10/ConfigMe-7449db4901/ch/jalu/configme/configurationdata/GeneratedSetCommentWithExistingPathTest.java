package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(JUnit4.class)
public class GeneratedSetCommentWithExistingPathTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentWithExistingPathTest() {
        commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "line1");
        commentsConfiguration.setComment("path", "line2");
        assertEquals(Arrays.asList("line1", "line2"), commentsConfiguration.comments.get("path"));
    }

}