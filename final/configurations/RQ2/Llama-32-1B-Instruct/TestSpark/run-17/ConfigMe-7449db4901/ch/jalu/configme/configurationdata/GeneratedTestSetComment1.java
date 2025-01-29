package ch.jalu.configme.configurationdata;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestSetComment1 {

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
    public void testSetComment1() {
        TestClass test = new TestClass();
        test.setComment("This is a test comment", List.of());
        assertEquals(0, 0);
    }

}