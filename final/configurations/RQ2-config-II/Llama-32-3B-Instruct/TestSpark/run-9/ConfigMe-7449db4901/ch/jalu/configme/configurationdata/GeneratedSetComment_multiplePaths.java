package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedSetComment_multiplePaths {

    @Test
    public void setComment_multiplePaths() {
        String path1 = "path1";
        String path2 = "path2";
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> comments = Arrays.asList(path1).stream().map(key -> Arrays.asList("a", "b")).collect(Collectors.toMap(String::valueOf, key -> key));
        Map<String, @UnmodifiableView List<String>> actualComments = config.setComment(path2, "c");
        Map<String, @UnmodifiableView List<String>> expectedComments = new HashMap<>();
        expectedComments.put(path1, Arrays.asList("a", "b"));
        expectedComments.put(path2, Arrays.asList("c"));
        assertThat(config.getAllComments(), is(expectedComments));
    }

}