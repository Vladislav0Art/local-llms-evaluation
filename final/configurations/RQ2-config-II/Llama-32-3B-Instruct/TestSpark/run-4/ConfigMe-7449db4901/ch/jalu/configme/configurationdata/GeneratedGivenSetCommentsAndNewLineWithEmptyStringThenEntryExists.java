package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGivenSetCommentsAndNewLineWithEmptyStringThenEntryExists {

    @Test
    public void givenSetCommentsAndNewLineWithEmptyStringThenEntryExists() {
        CommentsConfiguration comments = new CommentsConfiguration();
        String path = "path";
        Map<String, List<String>> result = comments.setComment(path, "");
        assertThat(result.get(path).size(), is(0));
    }

}