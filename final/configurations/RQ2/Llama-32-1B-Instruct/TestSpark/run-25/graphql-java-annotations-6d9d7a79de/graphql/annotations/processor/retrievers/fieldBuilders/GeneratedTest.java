package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.params.provider.CsvSource.*;

import java.util.Arrays;

public class GeneratedTest {

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

    @Test
    public void testLeaveFields() {
        System.out.println("Leaving fields...");
    }

    @ParameterizedTest(name = "element, expectedResult")
    @CsvSource({
            ("1", Arrays.asList(1)),
            ("2",Arrays.asList(2))
})

public void testEnterDirectives(AnnotatedElement element, List<Integer> expectedResult) {
    System.out.println("Entering directives...");
    for (int i = 0; i < expectedResult.size(); i++) {
        System.out.println("Directive " + i);
    }
}

@ParameterizedTest(name = "element, expectedResult")
@CsvSource({
        ("1", Arrays.asList(1)),
        ("2",Arrays.

asList(2))
        })

public void testEnterFields(List<AnnotatedElement> elements, List<Integer> expectedResult) {
    System.out.println("Entering fields...");
    for (int i = 0; i < elements.size(); i++) {
        System.out.println("Field " + i);
    }
}

@ParameterizedTest(name = "element, expectedResult")
@CsvSource({
        ("1", Arrays.asList(1)),
        ("2",Arrays.

asList(2))
        })

public void testEnterTypes(ProcessingElementsContainer container, List<Integer> expectedResult) {
    System.out.println("Entering types...");
    for (int i = 0; i < expectedResult.size(); i++) {
        System.out.println("Type " + i);
    }
}

}