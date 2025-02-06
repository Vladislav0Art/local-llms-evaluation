package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGivenSetCommentsAndNewLineThenEntryExists {

    @Test
    public void givenSetCommentsAndNewLineThenEntryExists() {
        CommentsConfiguration comments = new CommentsConfiguration();
        String path = "path";
        String comment1 = "line1";
        Map<String, List<String>> result = comments.setComment(path, comment1);
        assertThat(result.get(path).get(0), is(comment1));
    }

}