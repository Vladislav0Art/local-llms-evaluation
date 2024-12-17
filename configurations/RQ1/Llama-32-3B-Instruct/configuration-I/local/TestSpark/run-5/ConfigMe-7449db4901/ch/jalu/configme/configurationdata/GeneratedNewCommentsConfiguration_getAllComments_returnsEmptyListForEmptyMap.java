package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedNewCommentsConfiguration_getAllComments_returnsEmptyListForEmptyMap {

    @Test
    public void newCommentsConfiguration_getAllComments_returnsEmptyListForEmptyMap() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> comments = Collections.emptyMap();
        Map<String, @UnmodifiableView List<String>> getAllComments = config.getAllComments();
        assertThat(getAllComments(comments), is(isEmptyList()));
    }

    private static boolean isUnmodifiable(Map<String, List<String>> map) {
        return map == null || !map instanceof Map;
    }

    private static boolean isEmptyMap(Map<String, List<String>> map) {
        return map == null && map.isEmpty();
    }

    private static boolean isEmptyList(List<String> list) {
        return list == null && list.isEmpty();
    }

    private static <T> @UnmodifiableView T isUnmodifiable(T obj) {
        return Objects.requireNonNull(obj);
    }

}