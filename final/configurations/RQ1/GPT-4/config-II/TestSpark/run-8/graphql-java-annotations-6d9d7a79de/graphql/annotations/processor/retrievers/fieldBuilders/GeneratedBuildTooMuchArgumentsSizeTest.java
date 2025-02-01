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
public class GeneratedBuildTooMuchArgumentsSizeTest {

    @Mock
    private ProcessingElementsContainer container;

    @Test
    public void buildTooMuchArgumentsSizeTest() {
        DefinitionsRegistry registry = new DefinitionsRegistry();
        registry.register(new DirectiveDefinition("Test", new Directive()));
        when(container.getDirectiveRegistry()).thenReturn(registry);

        DirectivesBuilder builder = new DirectivesBuilder(ClassTwo.class, container);
        builder.build();
    }

    @GraphQLDirectives(values = {@GraphQLDirective(name = "Test", argumentsValues = {"a", "b"})})
    private static class ClassTwo {
    }

}