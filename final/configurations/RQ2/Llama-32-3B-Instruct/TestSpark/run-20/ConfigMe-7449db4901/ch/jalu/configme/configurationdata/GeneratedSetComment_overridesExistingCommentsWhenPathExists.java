package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.SettingsHolder;
import org.mockito.Mockito;

import java.util.Collections;

public class GeneratedSetComment_overridesExistingCommentsWhenPathExists {

    @Test
    public void setComment_overridesExistingCommentsWhenPathExists() {
        var comments = new HashMap<String, List<String>>();
        comments.put("/path", Arrays.asList("existingLine1", "existingLine2"));
        var settingsHolderMock = Mockito.mock(SettingsHolder.class);
        when(settingsHolderMock.getComments()).thenReturn(comments);

        var configuration = new CommentsConfiguration();
        configuration.setComment("/path", "newLine1", "newLine2");
        assertEquals(Arrays.asList("newLine1", "newLine2"), configuration.getAllComments().get("/path"));
    }

}