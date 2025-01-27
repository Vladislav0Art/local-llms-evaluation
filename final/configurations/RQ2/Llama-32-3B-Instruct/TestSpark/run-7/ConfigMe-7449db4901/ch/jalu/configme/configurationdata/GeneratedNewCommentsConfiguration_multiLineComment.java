package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedNewCommentsConfiguration_multiLineComment {

    @Test
    public void newCommentsConfiguration_multiLineComment() {
        Map<String, List<String>> comments = new HashMap<String, List<String>>() {
            {
                put("", Arrays.asList(""))
            }

            ;
            CommentsConfiguration config = new CommentsConfiguration(comments);
            Map<String, List<String>> expectedMap = new HashMap<>();
		expectedMap.put("key",Arrays.asList("$","value"));

            assertThat(config.getAllComments(),is(expectedMap));
        }

    }