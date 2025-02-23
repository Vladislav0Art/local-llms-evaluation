package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAllCommentsTest {

    @Mock
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path1", Collections.singletonList("comment1"));
        commentsMap.put("path2", Collections.singletonList("comment2"));

        commentsConfiguration = new CommentsConfiguration(commentsMap);

        assertNotNull(commentsConfiguration.getAllComments());
        assertEquals(2, commentsConfiguration.getAllComments().size());
        assertEquals("comment1", commentsConfiguration.getAllComments().get("path1").get(0));
        assertEquals("comment2", commentsConfiguration.getAllComments().get("path2").get(0));
    }

}