package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mockito.Mockito;
import org.mockito.SpyBean;
import org.assertj.core.api.Assertions;

public class GeneratedSetsAllLinesForEmptyPath {

    @Test
    public void setsAllLinesForEmptyPath() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        Map<String, List<String>> expectedComments = new HashMap<>();
        commentsConfig.setComment("", Arrays.asList("New line", "with", "comment"));
        assertThat(commentsConfig.getAllComments(), is(expectedComments));
    }

}