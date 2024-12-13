package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCommentTest {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentTest() {
        commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "line1", "line2");
        assertEquals(Arrays.asList("line1", "line2"), commentsConfiguration.comments.get("path"));
    }

}