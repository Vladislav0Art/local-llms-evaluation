package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGivenExistingCommentsConfigurationthenAllEntriesExist {

    @Test
    public void givenExistingCommentsConfigurationthenAllEntriesExist() {
        String path1 = "path1";
        String path2 = "path2";

        Map<String, List<String>> comments = new HashMap<>();
        comments.put(path1, Arrays.asList("line1", "line2"));
        comments.put(path2, Collections.singletonList("line3"));

        CommentsConfiguration config = new CommentsConfiguration(comments);
        Map<String, @UnmodifiableView List<String>> result = config.getAllComments();
        assertThat(result.size(), is(2));
        assertThat(result.get(path1).size(), is(2));
        assertThat(result.get(path2).get(0), is("line3"));
    }

}