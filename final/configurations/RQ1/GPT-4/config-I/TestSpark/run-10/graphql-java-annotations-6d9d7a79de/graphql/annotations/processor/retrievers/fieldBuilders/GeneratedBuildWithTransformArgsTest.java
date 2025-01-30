package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.*;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.*;

public class GeneratedBuildWithTransformArgsTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void buildWithTransformArgsTest() {
        Field field = mock(Field.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        GraphQLDirective directive = mock(GraphQLDirective.class);
        List<GraphQLArgument> arguments = new ArrayList<>();
        GraphQLArgument argumentMock = mock(GraphQLArgument.class);
        when(argumentMock.getType()).thenReturn(mock(GraphQLScalarType.class));
        arguments.add(argumentMock);
        when(directive.getArguments()).thenReturn(arguments);

        Map<String, GraphQLDirectiveContainer> directiveRegistry = new HashMap<>();
        GraphQLDirectiveContainer containerMock = mock(GraphQLDirectiveContainer.class);
        when(containerMock.getDirective()).thenReturn(directive);
        directiveRegistry.put("mock", containerMock);

        when(container.getDirectiveRegistry()).thenReturn(directiveRegistry);

        DirectivesBuilder builder = new DirectivesBuilder(field, container);
        try {
            builder.build();
        } catch (GraphQLAnnotationsException e) {
            assert (e.getMessage().contains(DirectivesBuilder.COULD_NOT_PARSE_ARGUMENT_VALUE_TO_ARGUMENT_TYPE));
        }
    }

}