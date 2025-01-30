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

public class GeneratedTransformArgsInvalidTypeTest {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void transformArgsInvalidTypeTest() {
        String[] mockArgs = {"arg1", "arg2"};
        GraphQLDirective mockDirective = Mockito.mock(GraphQLDirective.class);
        ArrayList<GraphQLArgument> arguments = new ArrayList<>();
        arguments.add(createMockGraphQLArgumentWithoutScalarType());

        Mockito.when(mockDirective.getArguments()).thenReturn(arguments);

        DirectivesBuilder builder = new DirectivesBuilder(Mockito.mock(AnnotatedElement.class), Mockito.mock(ProcessingElementsContainer.class));

        expectedEx.expect(GraphQLAnnotationsException.class);
        expectedEx.expectMessage("Directive argument type must be a scalar!");

        builder.transformArgs(mockDirective, mockArgs);
    }

    private void mockDirectiveRegistryWithMockDirective(ProcessingElementsContainer mockContainer) {
        GraphQLDirective.Builder directiveBuilder = newDirective();
        directiveBuilder.name("MockDirective");
        directiveBuilder.argument(newArgument().name("arg").type(GraphQLString).build());
        DirectiveRegistry directiveRegistry = new DirectiveRegistry();
        directiveRegistry.put("MockDirective", new DirectiveWiring("MockDirective", directiveBuilder.build()));
        Mockito.when(mockContainer.getDirectiveRegistry()).thenReturn(Collections.singletonMap("MockDirective", new DirectiveWiring("MockDirective", directiveBuilder.build())));
    }

    private GraphQLArgument createMockGraphQLArgumentWithoutScalarType() {
        return new GraphQLArgument("name", "description", mockGraphQLType(), null);
    }

    private GraphQLType mockGraphQLType() {
        return Mockito.mock(GraphQLType.class);
    }

}