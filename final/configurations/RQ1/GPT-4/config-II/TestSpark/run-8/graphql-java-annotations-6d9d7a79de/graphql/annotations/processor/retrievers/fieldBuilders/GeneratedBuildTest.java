package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.Mock;

import java.lang.reflect.Method;
import java.util.Arrays;

import static org.mockito.Mockito.*;

import graphql.schema.*;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildTest {

    @Mock
    private ProcessingElementsContainer container;

    @Test
    public void buildTest() {
        Directive definition = new Directive();
        GraphQLArgument argument = mock(GraphQLArgument.class);
        when(argument.getName()).thenReturn("a");
        when(argument.getType()).thenReturn(new GraphQLScalarType("b", "c", new Coercing() {
            @Override
            public Object serialize(Object dataFetcherResult) {
                return null;
            }

            @Override
            public Object parseValue(Object input) {
                return "a";
            }

            @Override
            public Object parseLiteral(Object input) {
                return null;
            }
        }));
        when(argument.getArgumentDefaultValue()).thenReturn(new DefaultValue("a"));
        definition.setArguments(Arrays.asList(argument));

        DefinitionsRegistry registry = new DefinitionsRegistry();
        registry.register(new DirectiveDefinition("Test", definition));
        when(container.getDirectiveRegistry()).thenReturn(registry);

        DirectivesBuilder builder = new DirectivesBuilder(ClassThree.class, container);
        GraphQLDirective[] directives = builder.build();
        assertEquals(1, directives.length);
    }

    @GraphQLDirectives(values = {@GraphQLDirective(name = "Test", argumentsValues = {"a"})})
    private static class ClassThree {
    }

}