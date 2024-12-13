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
public class GeneratedSetCommentWithEmptyLineTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentWithEmptyLineTest() {
        commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "\n");
        assertEquals(Collections.emptyList(), commentsConfiguration.comments.get("path"));
    }

}