package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedNewCommentsConfiguration_fromHashMap_isCorrect {

    @Test
    public void newCommentsConfiguration_fromHashMap_isCorrect() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("key1", Arrays.asList("line1"));
        CommentsConfiguration config = new CommentsConfiguration(comments);
        assertThat(config.getAllComments(), is(Collections.unmodifiableMap(comments)));
    }

}