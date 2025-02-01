package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLType;
import graphql.schema.GraphQLScalarType;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedTransformArgsTest {

    @Test
    public void transformArgsTest() {
        GraphQLDirective directive = Mockito.mock(GraphQLDirective.class);
        Annotation annotation = Mockito.mock(Annotation.class);
        DirectivesBuilder builder = new DirectivesBuilder(null, null);
        GraphQLDirective result = builder.transformArgs(directive, annotation);
        assertNotEquals(null, result);
    }

}