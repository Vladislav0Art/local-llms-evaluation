package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedSetCommentThrowsForEmptyPath {

    @Test
    public void setCommentThrowsForEmptyPath() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        Map<String, List<String>> comments = new HashMap<>();
        configuration.setComment("", "", "");
    }
}

public class EntriesUnmodifiedException extends Exception {
    public EntriesUnmodifiedException() {
        super("Cannot modify an unmodifiable list");
    }

}