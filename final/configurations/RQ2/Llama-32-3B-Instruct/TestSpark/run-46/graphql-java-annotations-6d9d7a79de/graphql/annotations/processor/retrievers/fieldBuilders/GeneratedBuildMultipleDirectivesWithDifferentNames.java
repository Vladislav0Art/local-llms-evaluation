package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneratedBuildMultipleDirectivesWithDifferentNames {

    @Test
    public void BuildMultipleDirectivesWithDifferentNames() {
        AnnotatedElement object = createMockAnnotatedElement();
        ProcessingElementsContainer container = createMockProcessingElementsContainer();
        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        // Add mock directive annotations to the element with different names
        Method method1 = createMockMethod();
        mockMethod(method1, GraphQLDirectives.class);
        Object instance1 = createMockAnnotatedClassInstance();
        object.addAnnotation(instance1);

        Method method2 = createMockMethod();
        mockMethod(method2, GraphQLDirectives.class);
        Object instance2 = createMockAnnotatedClassInstance();
        object.addAnnotation(instance2);

        // Build directives
        GraphQLDirective[] result = builder.build();

        assertTrue(result.length == 2);
    }

}