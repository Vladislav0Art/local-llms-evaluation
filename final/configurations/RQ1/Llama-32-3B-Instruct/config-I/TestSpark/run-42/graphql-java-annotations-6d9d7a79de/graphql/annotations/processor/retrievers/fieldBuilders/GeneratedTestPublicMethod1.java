package graphql.annotations.processor.retrievers.fieldBuilders;

public class GeneratedTestPublicMethod1 {

    public void publicMethod1() {
        System.out.println("This is public method 1");
    }
}

public class TestPublicClass1 {

    @Test
    public void testPublicMethod1() {
        PublicClass1 publicClass = new PublicClass1();
        publicClass.publicMethod1();
    }
}

public class PublicClass2 {
    private String privateVariable = "Private Variable";

    public String publicMethod2() {
        return privateVariable;
    }
}

}