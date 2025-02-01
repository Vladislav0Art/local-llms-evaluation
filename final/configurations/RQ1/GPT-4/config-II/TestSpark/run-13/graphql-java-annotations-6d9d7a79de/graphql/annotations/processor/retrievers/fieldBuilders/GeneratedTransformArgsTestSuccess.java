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

public class GeneratedTransformArgsTestSuccess {

    @Test
    public void transformArgsTestSuccess() {
        GraphQLDirective directive = Mockito.mock(GraphQLDirective.class);
        GraphQLArgument argument = Mockito.mock(GraphQLArgument.class);
        ArrayList<GraphQLArgument> args = new ArrayList<>();
        args.add(argument);
        Mockito.when(directive.getArguments()).thenReturn(args);
        String[] argsValues = new String[]{"arg1"};
        DirectivesBuilder builder = new DirectivesBuilder(null, null);
        GraphQLDirective result = builder.transformArgs(directive, argsValues);
        assertNotEquals(null, result);
    }

}