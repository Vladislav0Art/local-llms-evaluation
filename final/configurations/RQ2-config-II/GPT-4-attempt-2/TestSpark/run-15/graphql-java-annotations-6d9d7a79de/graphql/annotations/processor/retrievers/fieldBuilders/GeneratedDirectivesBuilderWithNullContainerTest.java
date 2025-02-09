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

public class GeneratedDirectivesBuilderWithNullContainerTest {

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