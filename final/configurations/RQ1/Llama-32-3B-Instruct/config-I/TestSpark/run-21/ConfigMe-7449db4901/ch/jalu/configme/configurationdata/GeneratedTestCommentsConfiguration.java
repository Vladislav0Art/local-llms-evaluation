package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestCommentsConfiguration {

    @Test
    public void testCommentsConfiguration() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> map = new HashMap<>();
        List<String> list1 = new ArrayList<>();
        list1.add("line1");
        List<String> list2 = new ArrayList<>();
        list2.add("line2");
        map.put("path", list1);
        commentsConfiguration.setComments(map);

        assertEquals(1, ((List<String>) commentsConfiguration.getComments().get("path")).size());
    }

}