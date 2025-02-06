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
public class GeneratedGetAllCommentsEmptyMapTest {

    @Mock
    private SettingsHolder settingsHolderMock;

    private CommentsConfiguration commentsConfiguration = new CommentsConfiguration();

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getAllCommentsEmptyMapTest() {
        Map<String, List<String>> comments = Collections.emptyMap();
        when(settingsHolderMock.getComments()).thenReturn(comments);
        assertEquals(Collections.emptyMap(), commentsConfiguration.getAllComments());
    }

}