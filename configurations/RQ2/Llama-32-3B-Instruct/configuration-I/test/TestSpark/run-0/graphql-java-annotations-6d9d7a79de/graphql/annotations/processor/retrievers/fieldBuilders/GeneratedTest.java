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
public class GeneratedTest {

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

    @Test
    public void build_GivenObjectAndContainer_ReturnsDirectives() {
        // Given
        GraphQLDirective directive1 = Mockito.mock(GraphQLDirective.class);
        GraphQLDirective directive2 = Mockito.mock(GraphQLDirective.class);
        Field[] fields = new Field[]{GraphQLField.DIRECTIVE};
        Arrays.fill(fields, Mockito.any(AnnotatedElement.class));
        when(object.getAnnotations()).thenReturn(Arrays.asList(directive1, directive2));

        // When
        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        // Then
        GraphQLDirective[] directives = builder.build();
        assert (directives[0] == directive1 || directives[0].equals(directive1))
                && (directives[1] == directive2 || directives[1].equals(directive2));
    }

    @Test
    public void build_GivenObjectAndContainerWithDirectiveType_ReturnsDirectives() {
        // Given
        Field[] fields = new Field[]{GraphQLField.DIRECTIVE_TYPE};
        when(object.getAnnotations()).thenReturn(Arrays.asList(DIRECTIVE_TYPE));

        // When
        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        // Then
        GraphQLDirective[] directives = builder.build();
        assert (directives[0] == DIRECTIVE_TYPE || directives[0].equals(DIRECTIVE_TYPE))
                && !Arrays.equals(directives, new Object[]{});
    }

    @Test
    public void build_GivenEmptyObjectAndContainer_ReturnsEmptyDirectivesArray() {
        // Given
        when(container.getAnnotatedType()).thenReturn(null);

        // When
        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        // Then
        assert (builder.build().length == 0 || Arrays.equals(builder.build(), new Object[]{}));
    }

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