package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.annotationTypes.directives.activation.Directive;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTransformArgsTooManyArgumentsTest {

    @Test
    public void transformArgsTooManyArgumentsTest() {
        DummyClass dummyClass = new DummyClass();
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(dummyClass.getClass(), container);

        GraphQLDirectiveExample directiveInRegistry = mock(GraphQLDirectiveExample.class);
        when(directiveInRegistry.getArguments()).thenReturn(new ArrayList<GraphQLArgument>());

        directivesBuilder.transformArgs(directiveInRegistry, new String[]{"arg1", "arg2"});
    }

    @GraphQLDirectives({
            @Directive(name = "example")
    })
    private static class DummyClassWithDirective {
    }

    @GraphQLDirectives({
            @Directive(name = "example2")
    })
    private static class DummyClass {
    }

}