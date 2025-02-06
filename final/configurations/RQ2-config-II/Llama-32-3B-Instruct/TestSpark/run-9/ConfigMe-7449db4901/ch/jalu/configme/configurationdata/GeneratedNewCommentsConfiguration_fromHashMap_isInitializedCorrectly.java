package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedNewCommentsConfiguration_fromHashMap_isInitializedCorrectly {

    @Test
    public void newCommentsConfiguration_fromHashMap_isInitializedCorrectly() {
        String path = "path";
        Map<String, List<String>> comments = Arrays.asList(path, path).stream().map(key -> Arrays.asList("a", "b")).collect(Collectors.toMap(String::valueOf, key -> key));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        Map<String, @UnmodifiableView List<String>> actualComments = config.getAllComments();
        assertThat(actualComments, is(Maps.newHashMapWithExpectedKeySet(Arrays.asList(path))));
    }

}