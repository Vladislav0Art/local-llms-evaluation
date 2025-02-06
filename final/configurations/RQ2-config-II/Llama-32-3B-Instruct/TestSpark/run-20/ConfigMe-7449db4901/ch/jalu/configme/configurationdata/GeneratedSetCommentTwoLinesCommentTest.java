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
public class GeneratedSetCommentTwoLinesCommentTest {

    @Mock
    private SettingsHolder settingsHolderMock;

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
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

}