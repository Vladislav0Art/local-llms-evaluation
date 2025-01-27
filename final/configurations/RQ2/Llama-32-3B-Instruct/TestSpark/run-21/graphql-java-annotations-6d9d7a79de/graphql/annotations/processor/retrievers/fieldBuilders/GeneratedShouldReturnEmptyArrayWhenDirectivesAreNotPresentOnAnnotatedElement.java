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

public class GeneratedShouldReturnEmptyArrayWhenDirectivesAreNotPresentOnAnnotatedElement {

    @Test
    public void shouldReturnEmptyArrayWhenDirectivesAreNotPresentOnAnnotatedElement() {
        AnnotatedElement element = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(element, container);
        GraphQLDirective[] result = builder.build();
        verify(container).ignoreProcessResult(result);
    }

}