package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.Arrays;

public class GeneratedConstructorInvalidReturnsException {

    @Test
    public void constructorInvalidReturnsException() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        try {
            new DirectivesBuilder(object, null);
            fail("Expected exception");
        } catch (Exception e) {
            assertTrue(e instanceof NullPointerException);
        }
    }

}