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
public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path", "comment1", "comment2");
        Map<String, List<String>> commentsMap = commentsConfiguration.getAllComments();
        assertNotNull(commentsMap);
        assertEquals(1, commentsMap.size());
        assertEquals(Collections.singletonList("comment1\ncomment2"), commentsMap.get("path"));
    }

}