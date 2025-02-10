package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestGeneratePublicClasses {

    public String generateString() {
        return "Hello, World!";
    }

    public int generateInt() {
        return 42;
    }
}

public class TestGeneratedClasses {

    @Test
    public void testGeneratePublicClasses() {
        try {
            new GeneratedClass();
            assert false : "Expected exception not thrown";
        } catch (Exception e) {
        }

        try {
            new TestGeneratedClasses().newGeneratedClass();
            assert false : "Expected exception not thrown";
        } catch (Exception e) {
        }
    }

}