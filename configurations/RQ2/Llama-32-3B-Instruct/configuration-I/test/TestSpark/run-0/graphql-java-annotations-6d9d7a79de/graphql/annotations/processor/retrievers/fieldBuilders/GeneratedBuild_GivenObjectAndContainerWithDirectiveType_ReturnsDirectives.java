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
public class GeneratedBuild_GivenObjectAndContainerWithDirectiveType_ReturnsDirectives {

    @Mock
    private AnnotatedElement object;

    @Mock
    private ProcessingElementsContainer container;

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

}