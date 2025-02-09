package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedNewCommentsConfiguration_canBeInitializedWithEmptyMap {

    @Test
    public void newCommentsConfiguration_canBeInitializedWithEmptyMap() {
        Map<String, List<String>> comments = new HashMap<>();
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertTrue(configuration.getAllComments().isEmpty());
    }

    private static class CommentLineMock implements List<String> {
        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public String get(int index) {
            throw new RuntimeException("Not implemented");
        }

        @Override
        public Object[] toArray() {
            throw new RuntimeException("Not implemented");
        }
    }

    private static class MapWrapper {
        public Map<String, List<String>> getMap() {
            return Mockito.mock(Map.class);
        }

        public Map<String, List<String>> setMap(Map<String, List<String>> map) {
            return map;
        }
    }

}