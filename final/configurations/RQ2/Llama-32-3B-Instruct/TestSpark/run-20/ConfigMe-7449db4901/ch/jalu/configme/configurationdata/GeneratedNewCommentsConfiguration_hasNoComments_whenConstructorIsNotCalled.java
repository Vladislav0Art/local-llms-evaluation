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

public class GeneratedNewCommentsConfiguration_hasNoComments_whenConstructorIsNotCalled {

    @Test
    public void newCommentsConfiguration_hasNoComments_whenConstructorIsNotCalled() {
        var configuration = new CommentsConfiguration();
        assertEquals(Collections.emptyMap(), configuration.getAllComments());
    }

}