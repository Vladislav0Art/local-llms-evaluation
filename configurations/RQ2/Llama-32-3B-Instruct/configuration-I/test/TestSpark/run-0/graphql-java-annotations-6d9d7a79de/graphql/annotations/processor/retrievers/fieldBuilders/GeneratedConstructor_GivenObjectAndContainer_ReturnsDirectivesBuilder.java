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
public class GeneratedConstructor_GivenObjectAndContainer_ReturnsDirectivesBuilder {

    @Mock
    private AnnotatedElement object;

    @Mock
    private ProcessingElementsContainer container;

    @Test
    public void constructor_GivenObjectAndContainer_ReturnsDirectivesBuilder() {
        // Given
        when(container.getAnnotatedType()).thenReturn(object.getClass());

        // When
        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        // Then
        assert builder != null;
    }

}