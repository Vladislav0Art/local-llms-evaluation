package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAddComment {

    @Test
    public void testAddComment() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, List<String>> map = new HashMap<>();
        List<String> list1 = new ArrayList<>();
        list1.add("line1");
        List<String> list2 = new ArrayList<>();
        list2.add("line2");
        map.put("path", list1);

        commentsConfiguration.setComments(map);
        ((List<String>) commentsConfiguration.getComments().get("path")).add("newComment");
        assertEquals(2, ((List<String>) commentsConfiguration.getComments().get("path")).size());
    }
}

public class CommentsConfiguration {
    private Map<String, List<String>> commentsMap;

    public void setComments(Map<String, List<String>> map) {
        this.commentsMap = map;
    }

    public Map<String, List<String>> getComments() {
        return commentsMap;
    }

}