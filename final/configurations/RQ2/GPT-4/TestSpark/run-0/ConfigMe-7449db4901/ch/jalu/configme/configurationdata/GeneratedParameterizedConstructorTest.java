package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedParameterizedConstructorTest {

    @Test
    public void parameterizedConstructorTest() {
        Map<String, List<String>> testComments = new HashMap<>();
        testComments.put("path1", Arrays.asList("comment1", "comment2"));

        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(testComments);
        assertThat(commentsConfiguration.getAllComments().size(), is(1));
        assertThat(commentsConfiguration.getAllComments().get("path1").get(0), is("comment1"));
        assertThat(commentsConfiguration.getAllComments().get("path1").get(1), is("comment2"));
    }

}