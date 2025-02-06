package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNewCommentConfiguration_isEmpty {

    @Mock
    private SettingsHolder settingsHolder;

    @Test
    public void newCommentConfiguration_isEmpty() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertTrue(commentsConfiguration.getAllComments().isEmpty());
    }

}