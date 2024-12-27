package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.Field;
import java.util.Arrays;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;

import static graphql.annotations.processor.retriever.annotations.GraphQLDirective;
import static graphql.annotations.processor.retriever.annotations.GraphQLDirectiveType.DIRECTIVE_TYPE;
import static graphql.annotations.processor.retriever.annotations.GraphQLField;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild_GivenNullObjectAndContainer_ReturnsEmptyDirectivesArray {

    @Mock
    private AnnotatedElement object;

    @Mock
    private ProcessingElementsContainer container;

    @Test
    public void build_GivenNullObjectAndContainer_ReturnsEmptyDirectivesArray() {
        // Given
        when(container.getAnnotatedType()).thenReturn(null);
        when(object.getClass()).thenReturn(null);

        // When
        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        // Then
        assert (builder.build().length == 0 || Arrays.equals(builder.build(), new Object[]{}));
    }

}