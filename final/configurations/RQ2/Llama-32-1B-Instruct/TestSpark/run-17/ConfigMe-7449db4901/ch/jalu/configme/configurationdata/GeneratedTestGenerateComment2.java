package ch.jalu.configme.configurationdata;

import java.util.List;

public class GeneratedTestGenerateComment2 {

    public static List<String> generateComment(String comment) {
        return List.of(comment);
    }

    @Test
    public void testGenerateComment2() {
        TestMethod test = new TestMethod();
        test.setComment("", List.of());
        assertEquals(TestClass.generateComment(""), 0);
    }
}

public class TestMethod {

    private String comment;

    public TestMethod() {
        this.comment = "";
    }

}