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
public class GeneratedGetAllCommentsReturnsUnmodifiableView {

    @Mock
    private SettingsHolder settingsHolder;

    @Mock
    private Map<String, List<String>> mapOfComments;

    private CommentsConfiguration commentsConfiguration;

    public CommentsConfiguration() {
        this.commentsConfiguration = new CommentsConfiguration();
    }

    public CommentsConfiguration(@NotNull Map<String, List<String>> comments) {
        this.commentsConfiguration = new CommentsConfiguration(comments);
    }

    @Test
    public void getAllCommentsReturnsUnmodifiableView() {
        Map<String, List<String>> commentMap = new HashMap<>();
        commentMap.put("test", Arrays.asList("1"));

        when(settingsHolder.getComments()).thenReturn(commentMap);

        Map<String, @UnmodifiableView List<String>> actualCommentMap = commentsConfiguration.getAllComments();

        assertTrue(actualCommentMap.containsKey("test"));
        assertTrue(actualCommentMap.get("test").isUnmodifiable());
    }

}