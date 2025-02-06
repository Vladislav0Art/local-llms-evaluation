package ch.jalu.configme.configurationdata;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.support.testing.PowerMockRunner;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
public class GeneratedSetComment_addsEmptyLineWithoutCommentMarker {

    @Mock
    private SettingsHolder settingsHolderMock;

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setup() {
        commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration = new CommentsConfiguration(Arrays.asList());
    }

    @Test
    public void setComment_addsEmptyLineWithoutCommentMarker() {
        Map<String, List<String>> expectedComments = new HashMap<>();
        expectedComments.put("path1", Arrays.asList(""));
        when(settingsHolderMock.getComments()).thenReturn(expectedComments);
        commentsConfiguration.setComment("path1");
        assertEquals(expectedComments, commentsConfiguration.getAllComments());
    }

}