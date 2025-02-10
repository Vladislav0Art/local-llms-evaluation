package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneratedBuildDirectivesWithSingleDirective {

    @Test
    public void BuildDirectivesWithSingleDirective() {
        AnnotatedElement object = createMockAnnotatedElement();
        ProcessingElementsContainer container = createMockProcessingElementsContainer();
        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        // Add a mock directive annotation to the element
        Method method = createMockMethod();
        mockMethod(method, GraphQLDirectives.class);
        // Create an instance of the annotated class
        Object annotatedClassInstance = createMockAnnotatedClassInstance();

        // Add the instance to the element
        object.addAnnotation(annotatedClassInstance);

        // Build directives
        GraphQLDirective[] result = builder.build();

        assertTrue(result.length == 1);
    }

}