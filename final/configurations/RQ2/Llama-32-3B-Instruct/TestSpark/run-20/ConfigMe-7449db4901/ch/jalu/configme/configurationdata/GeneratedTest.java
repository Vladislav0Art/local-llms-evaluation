package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GeneratedTest {

    private SettingsHolder mockSettingsHolder;

    public static class SettingsHolderMock {
        public HashMap<String, List<String>> getComments() {
            return new HashMap<>();
        }

        public void setComments(HashMap<String, List<String>> comments) {
        }
    }

    @org.junit.Before
    public void setup() {
        mockSettingsHolder = new SettingsHolderMock();
    }

    @Test
    public void newCommentsConfiguration_isEmpty() {
        var configuration = new CommentsConfiguration();
        assertEquals(0, configuration.getAllComments().size());
    }

    @Test
    public void newCommentsConfiguration_hasNoComments_whenConstructorIsNotCalled() {
        var configuration = new CommentsConfiguration();
        assertEquals(Collections.emptyMap(), configuration.getAllComments());
    }

}