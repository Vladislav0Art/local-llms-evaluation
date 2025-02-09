package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.Builder;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedBuildThrowsGraphQLAnnotationsExceptionTest {

    @Test
    public void buildThrowsGraphQLAnnotationsExceptionTest() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        Annotation[] annotations = getAnnotations();
        Mockito.when(object.getAnnotations()).thenReturn(annotations);

        assertThrows(GraphQLAnnotationsException.class, () -> {
            builder.build();
        });
    }

}