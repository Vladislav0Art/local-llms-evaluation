package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedNewCommentsConfiguration_emptyString {

    @Test
    public void newCommentsConfiguration_emptyString() {
        CommentsConfiguration config = new CommentsConfiguration(new HashMap<String, List<String>>() {{
            put("", Arrays.asList(""));
        }};
        Map<String, List<String>> expectedMap = new HashMap<>();
        expectedMap.put("", Arrays.asList(""));
        assertThat(config.getAllComments(), is(expectedMap));
    }

}