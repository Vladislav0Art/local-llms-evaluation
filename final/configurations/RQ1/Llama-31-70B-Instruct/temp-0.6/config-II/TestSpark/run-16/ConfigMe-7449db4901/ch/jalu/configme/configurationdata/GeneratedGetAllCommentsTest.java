package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAllCommentsTest {

    @Test
    public void getAllCommentsTest() {
        Map<String, List<String>> commentsMap = new HashMap<>();
        commentsMap.put("path", Collections.singletonList("comment"));
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(commentsMap);
        Map<String, List<String>> actualCommentsMap = commentsConfiguration.getAllComments();
        assertNotNull(actualCommentsMap);
        assertEquals(commentsMap, actualCommentsMap);
    }

}