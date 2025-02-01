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

public class GeneratedTransformArgsTestTooMuchArgs {

    @Test
    public void transformArgsTestTooMuchArgs() {
        GraphQLDirective directive = Mockito.mock(GraphQLDirective.class);
        Mockito.when(directive.getArguments()).thenReturn(new ArrayList<>());
        String[] args = new String[]{"arg1", "arg2"};
        DirectivesBuilder builder = new DirectivesBuilder(null, null);
        builder.transformArgs(directive, args);
    }

}