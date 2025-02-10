package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestGeneratePublicMethods {

    public String generateString() {
        return "Hello, World!";
    }

    public int generateInt() {
        return 42;
    }
}

public class TestGeneratedClasses {

    @Test
    public void testGeneratePublicMethods() {
        try {
            new GeneratedClass().generateString();
            assert false : "Expected exception not thrown";
        } catch (Exception e) {
        }

        try {
            new GeneratedClass().generateInt();
            assert false : "Expected exception not thrown";
        } catch (Exception e) {
        }
    }

}