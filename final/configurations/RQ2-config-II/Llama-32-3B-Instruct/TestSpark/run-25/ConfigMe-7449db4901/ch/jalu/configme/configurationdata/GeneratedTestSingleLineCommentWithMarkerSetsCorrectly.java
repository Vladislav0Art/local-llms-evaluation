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
public class GeneratedTestSingleLineCommentWithMarkerSetsCorrectly {

    @Mock
    private SettingsHolder settingsHolder;

    @RunWith(MockitoJUnitRunner.class)
    public void testEmptyCommentsConfiguration() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assertAllCommentLinesAreEmpty(allComments);
    }

    @Test
    public void testSingleLineCommentWithMarkerSetsCorrectly() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "# line1");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        List<String> commentLinesForPath = allComments.get("path");
        assertEquals(2, commentLinesForPath.size());
    }

}