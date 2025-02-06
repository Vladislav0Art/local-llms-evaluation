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
public class GeneratedSetCommentOneLineCommentTest {

    @Mock
    private SettingsHolder settingsHolderMock;

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
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

}