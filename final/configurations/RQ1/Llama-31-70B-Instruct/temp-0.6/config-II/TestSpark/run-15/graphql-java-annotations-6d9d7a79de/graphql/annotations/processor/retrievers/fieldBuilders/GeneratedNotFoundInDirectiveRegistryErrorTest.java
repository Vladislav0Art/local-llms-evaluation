package graphql.annotations.processor.retrievers.fieldBuilders;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.retrievers.fieldBuilders.GraphQLDirective;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

public class GeneratedNotFoundInDirectiveRegistryErrorTest {

    @Mock
    AnnotatedElement object;

    @Mock
    ProcessingElementsContainer container;

    @Test
    public void notFoundInDirectiveRegistryErrorTest() {
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        assertThrows(GraphQLAnnotationsException.class, directivesBuilder::build);
    }

}