package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCommentTest_MultipleLines {

    @InjectMocks
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentTest_MultipleLines() {
        commentsConfiguration.setComment("path", "line1", "line2", "line3");
        assertEquals(3, commentsConfiguration.comments.get("path").size());
        assertEquals("line1", commentsConfiguration.comments.get("path").get(0));
        assertEquals("line2", commentsConfiguration.comments.get("path").get(1));
        assertEquals("line3", commentsConfiguration.comments.get("path").get(2));
    }

}