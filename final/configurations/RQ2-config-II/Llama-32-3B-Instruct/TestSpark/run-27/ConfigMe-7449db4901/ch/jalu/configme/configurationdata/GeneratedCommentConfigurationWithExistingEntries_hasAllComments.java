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
public class GeneratedCommentConfigurationWithExistingEntries_hasAllComments {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void CommentConfigurationWithExistingEntries_hasAllComments() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("path1", Arrays.asList("comment1", "comment2"));
        existingComments.put("path2", Collections.singletonList("comment3"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(existingComments);
        assertEquals(existingComments, commentsConfiguration.getAllComments());
    }

}