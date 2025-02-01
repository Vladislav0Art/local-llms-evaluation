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

public class GeneratedTransformArgumentTestCannotParse {

    @Test
    public void transformArgumentTestCannotParse() {
        Annotation annotation = Mockito.mock(Annotation.class);
        Mockito.when(annotation.annotationType()).thenReturn(GraphQLDirectives.class);
        GraphQLDirective.Builder directiveBuilder = Mockito.mock(GraphQLDirective.Builder.class);
        GraphQLArgument argument = Mockito.mock(GraphQLArgument.class);
        GraphQLScalarType type = Mockito.mock(GraphQLScalarType.class);
        Mockito.when(argument.getType()).thenReturn(type);
        ArrayList<GraphQLArgument> args = new ArrayList<>();
        args.add(argument);
        DirectivesBuilder builder = new DirectivesBuilder(null, null);
        builder.transformArgument(annotation, directiveBuilder, args, 0);
    }

}