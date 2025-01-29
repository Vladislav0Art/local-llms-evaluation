package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GeneratedTestLeaveDirectives {

    @ParameterizedTest
    @CsvSource({
            "1,10",
            "2,20"
    })
    public void testGenerateMethod(int methodCount, int total) {
        System.out.println("Generated method count: " + methodCount);
        System.out.println("Total method count: " + total);
    }

    @Test
    public void testLeaveDirectives() {
        System.out.println("Leaving directives...");
    }

}