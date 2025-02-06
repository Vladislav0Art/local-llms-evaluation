package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetAllComments_returnsUnmodifiableView {

    @Test
    public void getAllComments_returnsUnmodifiableView() {
        Map<String, List<String>> comments = Mockito.mock(Map.class);
        CommentsConfiguration configuration = new CommentsConfiguration(comments);
        List<String> list = ((List<String>) ((Map) Mockito.mock(Map.class)).get("path"));
        assertTrue(list instanceof @UnmodifiableView);
    }

}