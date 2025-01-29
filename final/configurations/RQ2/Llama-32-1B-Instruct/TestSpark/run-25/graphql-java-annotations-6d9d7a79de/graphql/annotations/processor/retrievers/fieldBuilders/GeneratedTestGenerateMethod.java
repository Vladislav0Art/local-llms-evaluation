package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.params.provider.CsvSource.*;

import java.util.Arrays;

public class GeneratedTestGenerateMethod {

    @Test
    public void testGenerateMethod() {
        System.out.println("Generated method count: 10");
        for (int i = 0; i < 2; i++) {
            System.out.println("Method " + i);
        }
    }

    @ParameterizedTest(name = "methodCount, total")
    @CsvSource({
            "1,100",
            "2,200"
    })
    public void testLeaveDirectives(int methodCount, int total) {
        System.out.println("Leaving directives...");
        for (int i = 0; i < methodCount; i++) {
            System.out.println("Directive " + i);
        }
    }

}