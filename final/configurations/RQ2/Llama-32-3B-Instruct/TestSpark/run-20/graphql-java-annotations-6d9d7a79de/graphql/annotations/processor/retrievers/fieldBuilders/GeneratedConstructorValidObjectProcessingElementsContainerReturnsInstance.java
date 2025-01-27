package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.Arrays;

public class GeneratedConstructorValidObjectProcessingElementsContainerReturnsInstance {

    @Test
    public void constructorValidObjectProcessingElementsContainerReturnsInstance() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        try {
            new DirectivesBuilder(object, container);
        } catch (Exception e) {
            fail("Expected no exception");
        }
    }

}