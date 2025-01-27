package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAllCommentsShouldReturnUnmodifiableMap {

    @Mock
    private SettingsHolder settingsHolder;

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Test
    public void getAllCommentsShouldReturnUnmodifiableMap() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("path1", Arrays.asList("comment1"));
        commentsConfiguration = new CommentsConfiguration(map);
        @NotNull Map<String, @UnmodifiableView List<String>> unmodifiableMap = commentsConfiguration.getAllComments();
        assertNotNull(unmodifiableMap);
    }

}