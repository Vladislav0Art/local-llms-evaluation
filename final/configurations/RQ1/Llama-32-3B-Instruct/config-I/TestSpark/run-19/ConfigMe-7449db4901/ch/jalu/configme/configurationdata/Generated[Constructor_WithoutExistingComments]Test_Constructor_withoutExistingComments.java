package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockingbird.MockFormat;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
public class Generated[Constructor_WithoutExistingComments]

Test_Constructor_withoutExistingComments {

    @Mock
    private SettingsHolder settingsHolder;

    private CommentsConfiguration commentsConfiguration;

    @Before
    public void init () {
        when(settingsHolder.registerComments()).thenReturn(commentsConfiguration);
        MockitoAnnotations.initMocks(this);
    }

    public CommentsConfiguration getCommentsConfiguration () {
        return commentsConfiguration;
    }

    @Test
    public void [Constructor_WithoutExistingComments]Test_Constructor_withoutExistingComments() throws Exception {
        Map<String, List<String>> existingComments = Collections.emptyMap();
        commentsConfiguration = new CommentsConfiguration(existingComments);
        assertNotNull(commentsConfiguration.getComments());
    }

}