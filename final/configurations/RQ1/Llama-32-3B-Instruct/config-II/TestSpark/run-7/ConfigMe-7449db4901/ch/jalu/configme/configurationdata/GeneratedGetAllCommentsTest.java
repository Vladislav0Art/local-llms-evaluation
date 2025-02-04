package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.List;

public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        Map<String, List<String>> allCommentsMap = config.getAllComments();
        assertNotNull(allCommentsMap);
        assertEquals(0, allCommentsMap.size());
    }

}