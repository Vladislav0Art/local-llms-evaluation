package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneratedBuildInvalidDirectives {

    @Test
    public void BuildInvalidDirectives() {
        AnnotatedElement object = createMockAnnotatedElement();
        ProcessingElementsContainer container = createMockProcessingElementsContainer();
        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        // Add mock invalid directive annotations to the element
        Method method = createMockMethod();
        mockMethod(method, InvalidDirective.class);
        Object instance = createMockAnnotatedClassInstance();
        object.addAnnotation(instance);

        try {
            GraphQLDirective[] result = builder.build();
            fail("Expected exception was not thrown");
        } catch (GraphQLAnnotationsException e) {
            assertEquals("Invalid directive annotation", e.getMessage());
        }
    }

    private AnnotatedElement createMockAnnotatedElement() {
        // Create a mock element
        Object mockElement = Mockito.mock(AnnotatedElement.class);
        return (AnnotatedElement) mockElement;
    }

    private ProcessingElementsContainer createMockProcessingElementsContainer() {
        // Create a mock container
        ProcessingElementsContainer mockContainer = Mockito.mock(ProcessingElementsContainer.class);
        return mockContainer;
    }

    private Method createMockMethod() {
        Object mockMethod = Mockito.mock(Method.class);
        return (Method) mockMethod;
    }

    private Object createMockAnnotatedClassInstance() {
        // Create a mock instance of an annotated class
        Object mockInstance = Mockito.mock(Object.class);
        return mockInstance;
    }

    private void mockMethod(Method method, Class<?> annotationType) {
        // Mock the method to throw a GraphQLAnnotationsException when called
        when(method.invoke(null)).thenThrow(new GraphQLAnnotationsException("Invalid directive annotation"));
    }

}