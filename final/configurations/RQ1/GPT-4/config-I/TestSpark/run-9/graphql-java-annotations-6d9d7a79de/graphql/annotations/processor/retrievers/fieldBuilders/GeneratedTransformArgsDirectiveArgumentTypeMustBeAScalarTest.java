package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static graphql.schema.GraphQLDirective.newDirective;

public class GeneratedTransformArgsDirectiveArgumentTypeMustBeAScalarTest {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void transformArgsDirectiveArgumentTypeMustBeAScalarTest() {
        GraphQLArgument argument = Mockito.mock(GraphQLArgument.class);
        Mockito.when(argument.getType()).thenReturn(Mockito.mock(GraphQLType.class));

        GraphQLDirective directive = Mockito.mock(GraphQLDirective.class);
        Mockito.when(directive.getArguments()).thenReturn(Collections.singletonList(argument));

        DirectivesBuilder builder = new DirectivesBuilder(Mockito.mock(AnnotatedElement.class), Mockito.mock(ProcessingElementsContainer.class));
        builder.transformArgs(directive, new String[]{});
    }

}