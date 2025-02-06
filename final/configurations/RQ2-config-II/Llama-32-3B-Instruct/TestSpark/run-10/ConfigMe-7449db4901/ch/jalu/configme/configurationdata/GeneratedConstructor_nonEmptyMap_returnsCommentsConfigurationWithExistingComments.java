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
public class GeneratedConstructor_nonEmptyMap_returnsCommentsConfigurationWithExistingComments {

    @Mock
    private SettingsHolder settingsHolderMock;

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void setup() {
        commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration = new CommentsConfiguration(Arrays.asList());
    }

    @Test
    public void constructor_nonEmptyMap_returnsCommentsConfigurationWithExistingComments() {
        Map<String, List<String>> existingComments = new HashMap<>();
        existingComments.put("path1", Arrays.asList("line1", "line2"));
        when(settingsHolderMock.getComments()).thenReturn(existingComments);
        commentsConfiguration = new CommentsConfiguration(existingComments);
        assertEquals(existingComments, commentsConfiguration.getAllComments());
    }

}