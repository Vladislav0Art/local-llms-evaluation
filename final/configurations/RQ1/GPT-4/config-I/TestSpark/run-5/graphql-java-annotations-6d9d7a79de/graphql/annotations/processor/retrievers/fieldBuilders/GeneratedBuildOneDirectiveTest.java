package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.Directive;
import graphql.annotations.annotationTypes.directives.DirectiveLocations;
import graphql.annotations.annotationTypes.directives.definition.DirectiveDefinition;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildOneDirectiveTest {

    @DirectiveDefinition(directive = @Directive(name = "d", locations = {}))

    @Test
    public void buildOneDirectiveTest() {
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        Field object = mock(Field.class);
        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        GraphQLDirective graphQLDirective = GraphQLDirective.newDirective().name("directive").build();
        GraphQLArgument argument = GraphQLArgument.newArgument().name("directive context").type(GraphQLScalarType.newScalar().name("scalar").build()).build();

        Map<String, graphql.annotations.directives.DirectiveAndWiring> directiveRegistry = new HashMap<>();
        directiveRegistry.put("directive", new graphql.annotations.directives.DirectiveAndWiring(graphQLDirective));
        when(container.getDirectiveRegistry()).thenReturn(directiveRegistry);

        GraphQLDirective[] result = builder.build();

        assertEquals(1, result.length);
        assertArrayEquals(new GraphQLDirective[]{graphQLDirective}, result);
    }

    @DirectiveDefinition(directive = @Directive(name = "tooMuchArgumentsErrorTestDirective", locations = {}, argumentValues = {"arg1", "arg2", "arg3", "arg4"
    }
}