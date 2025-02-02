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

public class GeneratedGetAllComments_ReturnsUnmodifiableListForInnerMap {

    @Test
    public void getAllComments_ReturnsUnmodifiableListForInnerMap() {
        CommentsConfiguration comments = new CommentsConfiguration();
        String path1 = "path1";
        String line11[] = {"line11"};
        Map<String, List<String>> map = Mockito.mock(Map.class);
        ((Map<String, List<String>>) map).put("innerPath", Arrays.asList("innerLine"));
        comments.setComment(path1, line11);
        List<String> innerList = new ArrayList<>();
        innerList.add("innerLine");
        Map<String, @UnmodifiableView List<String>> result = comments.getAllComments();
        assertThat(result.size(), is(1));
        String actual = result.get(path1).toString();
        assertThat(actual, is("[\"line11\", [\"innerLine\"]]"));
    }

}