package ch.jalu.configme.configurationdata;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestSetComment2 {

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
    public void testSetComment2() {
        TestMethod test = new TestMethod();
        test.setComment("", List.of());
        assertEquals(1, 0);
    }
}

}