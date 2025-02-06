package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedSetComment_overwritesExisting {

    @Test
    public void setComment_overwritesExisting() {
        String path = "path";
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> comments = Arrays.asList(path).stream().map(key -> Arrays.asList("a", "b")).collect(Collectors.toMap(String::valueOf, key -> key));
        config.setComment(path, "c");
        Map<String, @UnmodifiableView List<String>> actualComments = config.getAllComments();
        assertThat(actualComments, is(Maps.newHashMapWithExpectedKeySet(Arrays.asList(path))));
    }

}