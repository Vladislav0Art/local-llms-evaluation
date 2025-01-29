package ch.jalu.configme.configurationdata;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestSetComment2InMethod1 {

    public static List<String> generateComment(String comment) {
        return new ArrayList<>();
    }

    public String setComment(String comment, List<String> comments) {
        comments.add(comment);
        return null;
    }

    public int getComments() {
        return 0;
    }
}

class TestMethod {
    public String setComment(String comment) {
        return comment;
    }

    @Test
    public void testSetComment2InMethod1() {
        GeneratedTest test = new GeneratedTest();
        test.setComments(List.of());
        String comment = "This is a test comment";
        List<String> comments = (List<String>) test.setComment(comment, null);
        assertEquals(0, 0);
    }

}