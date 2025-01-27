package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;

import java.lang.reflect.AnnotatedElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedShouldReturnCorrectNumberOfArgumentsForEachDirective {

    @Test
    public void shouldReturnCorrectNumberOfArgumentsForEachDirective() {
        AnnotatedElement element = mock(AnnotatedElement.class);
        element.addAnnotation(GraphQLDirectives.class);
        List<GraphQLArgument> arguments = Arrays.asList(new GraphQLArgument("arg1"), new GraphQLArgument("arg2"));
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(element, container);
        List<GraphQLDirective> directives = builder.build();
        assertEquals(arguments.size(), directives.size());
    }

}