package ch.jalu.configme.configurationdata;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllComments_ReturnsUnmodifiableMap {

    @Test
    public void getAllComments_ReturnsUnmodifiableMap() {
        CommentsConfiguration comments = new CommentsConfiguration();
        String path1 = "path1";
        String line11[] = {"line11"};
        String path2 = "path2";
        String line21[] = {"line21"};
        Map<String, List<String>> result = comments.setComment(path1, line11);
        Map<String, List<String>> map = comments.getAllComments();
        assertThat(map.size(), is(1));
        assertThat(map.get(path1), is(Arrays.asList(line11)));
    }

}