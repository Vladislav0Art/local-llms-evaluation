package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCommentOverwritesExistingComment {

    @Mock
    private SettingsHolder settingsHolder;

    public CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Test
    public void setCommentOverwritesExistingComment() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("path", Arrays.asList("comment1", "comment2"));
        when(settingsHolder.getComments()).thenReturn(existingComments);
        commentsConfiguration.setComment(settingsHolder, "path", "comment2");
        assertEquals(Arrays.asList("comment2"), commentsConfiguration.comments.get("path"));
    }

}