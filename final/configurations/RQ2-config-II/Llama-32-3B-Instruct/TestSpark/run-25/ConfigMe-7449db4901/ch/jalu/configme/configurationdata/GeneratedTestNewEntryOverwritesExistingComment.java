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

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestNewEntryOverwritesExistingComment {

    @Mock
    private SettingsHolder settingsHolder;

    @RunWith(MockitoJUnitRunner.class)
    public void testEmptyCommentsConfiguration() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertAllCommentLinesAreEmpty(allComments);
    }

    @Test
    public void testNewEntryOverwritesExistingComment() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> initialAllComments = new HashMap<>();
        initialAllComments.put("path", Collections.singletonList("# line"));
        commentsConfiguration.setComment("path", "# line2");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(1, allComments.get("path").size());
    }

    private void assertAllCommentLinesAreEmpty(Map<String, List<String>> map) {
        for (List<String> commentLines : map.values()) {
            assertTrue(commentLines.isEmpty());
        }
    }

}