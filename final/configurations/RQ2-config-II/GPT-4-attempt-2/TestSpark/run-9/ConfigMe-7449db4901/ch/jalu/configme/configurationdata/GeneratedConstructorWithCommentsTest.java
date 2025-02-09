package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedConstructorWithCommentsTest {

    @Test
    public void constructorWithCommentsTest() {
        Map<String, List<String>> data = new HashMap<String, List<String>>() {{
            put("path1", Arrays.asList("comment1", "comment2"));
            put("path2", Arrays.asList("comment3", "comment4"));
        }};

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(data);
        assertThat(commentsConfiguration.getAllComments().size(), is(2));
        assertThat(commentsConfiguration.getAllComments().get("path1"), is(Arrays.asList("comment1", "comment2")));
        assertThat(commentsConfiguration.getAllComments().get("path2"), is(Arrays.asList("comment3", "comment4")));
    }

}