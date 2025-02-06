package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCommentSetsNewLinesForPath {

    @Mock
    private SettingsHolder settingsHolder;

    @Mock
    private Map<String, List<String>> comments;

    public CommentsConfiguration getCommentsConfiguration() {
        return new CommentsConfiguration(comments);
    }

    @Test
    public void setCommentSetsNewLinesForPath() {
        CommentsConfiguration instance = getCommentsConfiguration();
        Map<String, List<String>> commentsExpected = Arrays.asList("path", Collections.singletonList("comment1"), Collections.singletonList(""));
        when(settingsHolder.getComments()).thenReturn(commentsExpected);
        instance.setComment("path", "comment1", "");
        assertEquals(commentsExpected, instance.getAllComments());
    }

}