package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.when;

public class GeneratedConstructorFromCommentsMapIsCreated {

    @Test
    public void constructorFromCommentsMapIsCreated() {
        Map<String, List<String>> comments = new HashMap<>();
        comments.put("path", new ArrayList<>());
        when(comments).thenReturn(comments);
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        assertThat(configuration.getAllComments(), is(comments));
    }

}