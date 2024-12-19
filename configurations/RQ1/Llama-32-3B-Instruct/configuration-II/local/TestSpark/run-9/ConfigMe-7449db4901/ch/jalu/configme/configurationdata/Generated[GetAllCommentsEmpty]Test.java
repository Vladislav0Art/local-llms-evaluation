package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generated[GetAllCommentsEmpty]

Test {

    @Test
    public void [GetAllCommentsEmpty]Test() {
        CommentsConfiguration configuration = new CommentsConfiguration();
        assertEquals(0, ((Map<String, List<String>>) configuration.getAllComments()).size());
    }

}