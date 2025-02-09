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

public class GeneratedTest {

    @Test
    public void buildTest() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        GraphQLDirective[] build = builder.build();

        assertNotNull(build);
    }

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

    @Test
    public void DirectivesBuilderWithNullObjectTest() {
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);

        assertThrows(NullPointerException.class, () -> {
            new DirectivesBuilder(null, container);
        });
    }

    @Test
    public void DirectivesBuilderWithNullContainerTest() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);

        assertThrows(NullPointerException.class, () -> {
            new DirectivesBuilder(object, null);
        });
    }

    private Annotation[] getAnnotations() {
        Annotation annotation = Mockito.mock(Annotation.class);
        return new Annotation[]{annotation};
    }

}