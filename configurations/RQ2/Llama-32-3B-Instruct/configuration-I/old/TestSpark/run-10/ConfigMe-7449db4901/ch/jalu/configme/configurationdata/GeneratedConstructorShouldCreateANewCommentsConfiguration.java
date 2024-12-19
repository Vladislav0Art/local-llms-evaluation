package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedConstructorShouldCreateANewCommentsConfiguration {

    private Map<String, List<String>> comments = new HashMap<>();

    public void setComment(String key, String line1, String line2) {
        if (line1.isEmpty()) {
            comments.remove(key);
        } else {
            comments.computeIfAbsent(key, k -> new ArrayList<>());
            ((List<String>) comments.get(key)).add(line1);
            ((List<String>) comments.get(key)).add(line2);
        }
    }

    public Map<String, List<String>> getComments() {
        return comments;
    }

    public static class CommentsConfigurationTest {

        @Test
        public void constructorShouldCreateANewCommentsConfiguration() {
            CommentsConfiguration configuration = new CommentsConfiguration();
            assertThat(configuration.getComments(), is(new HashMap<>()));
        }

    }