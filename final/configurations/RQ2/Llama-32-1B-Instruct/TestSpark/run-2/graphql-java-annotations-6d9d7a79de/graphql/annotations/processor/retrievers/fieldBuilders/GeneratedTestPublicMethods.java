package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestPublicMethods {

    @Test
    public void testPublicMethods() throws InterruptedException {
        for (int i = 0; i < 10000000; i++) {
            PublicClass.testPublicMethod();
        }
    }

    static class Greeter {
        public String greet(String name) {
            return "Hello, " + name;
        }
    }

}