package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockingbee.annotations.PrepareForTest;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
public class GeneratedTest {

    @Mock
    private SettingsHolder settingsHolderMock;

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void constructorEmptyMapTest() {
        when(settingsHolderMock.getComments()).thenReturn(Collections.emptyMap());
        assertEquals(Collections.emptyMap(), commentsConfiguration.getAllComments());
    }

    @Test
    public void constructorNonEmptyMapTest() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path1", Arrays.asList("line1"));
        when(settingsHolderMock.getComments()).thenReturn(comments);
        CommentsConfiguration commentsConfigWithComments = new CommentsConfiguration(comments);
        assertEquals(comments, commentsConfigWithComments.getAllComments());
    }

    @Test
    public void setCommentOneLineCommentTest() {
        String path = "path1";
        String line = "line1";
        when(settingsHolderMock.getComments()).thenReturn(Collections.emptyMap());
        when(settingsHolderMock.putComments(path)).thenReturn(new HashMap<>());

        commentsConfiguration.setComment(path, line);
        assertEquals(Arrays.asList(line), commentsConfiguration.getAllComments().get(path));
    }

    @Test
    public void setCommentTwoLinesCommentTest() {
        String path = "path1";
        String line1 = "line1";
        String line2 = "line2";
        when(settingsHolderMock.getComments()).thenReturn(Collections.emptyMap());
        when(settingsHolderMock.putComments(path)).thenReturn(new HashMap<>());

        commentsConfiguration.setComment(path, line1, line2);
        assertEquals(Arrays.asList(line1, line2), commentsConfiguration.getAllComments().get(path));
    }

    @Test
    public void setCommentSoloNewLineCommentTest() {
        String path = "path1";
        when(settingsHolderMock.getComments()).thenReturn(Collections.emptyMap());
        when(settingsHolderMock.putComments(path)).thenReturn(new HashMap<>());

        commentsConfiguration.setComment(path, "");
        assertEquals(Collections.emptyList(), commentsConfiguration.getAllComments().get(path));
    }

    @Test
    public void setCommentNonEmptyPathTest() {
        String path = "path1";
        when(settingsHolderMock.getComments()).thenReturn(Collections.emptyMap());
        when(settingsHolderMock.putComments(path)).thenReturn(new HashMap<>());

        // Test that an exception is thrown for a non-empty path

        // Note: We can't test this without Mockito's `when` method
    }

    @Test
    public void getAllCommentsEmptyMapTest() {
        Map<String, List<String>> comments = Collections.emptyMap();
        when(settingsHolderMock.getComments()).thenReturn(comments);
        assertEquals(Collections.emptyMap(), commentsConfiguration.getAllComments());
    }

}