package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import org.mockito.Mockito;
import org.mockito.SpyBean;
import org.assertj.core.api.Assertions;

public class GeneratedNewCommentsConfiguration_isEmpty {

    public class CommentsConfiguration {

        private Map<String, List<String>> commentMap = new HashMap<>();

        public Map<String, List<String>> getAllComments() {
            return commentMap;
        }

        public void setComment(String path, String... lines) {
            if (lines.length > 0 && Arrays.stream(lines).anyMatch(line -> line.isEmpty())) {
                throw new RuntimeException("Cannot have empty lines in a comment");
            }
            commentMap.put(path, Arrays.asList(lines));
        }
    }

    @Test
    public void newCommentsConfiguration_isEmpty() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        assertThat(commentsConfig.getAllComments(), is(Collections.emptyMap()));
    }

}