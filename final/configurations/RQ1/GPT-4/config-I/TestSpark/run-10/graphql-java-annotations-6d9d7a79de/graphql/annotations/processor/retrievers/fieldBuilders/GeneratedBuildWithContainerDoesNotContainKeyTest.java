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

public class GeneratedBuildWithContainerDoesNotContainKeyTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void buildWithContainerDoesNotContainKeyTest() {
        GraphQLDirectives annotation = mock(GraphQLDirectives.class);
        Field field = mock(Field.class);
        when(field.getAnnotation(GraphQLDirectives.class)).thenReturn(annotation);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);

        when(container.getDirectiveRegistry()).thenReturn(new HashMap<>());

        DirectivesBuilder builder = new DirectivesBuilder(field, container);
        try {
            builder.build();
        } catch (GraphQLAnnotationsException e) {
            assert (e.getMessage().contains(DirectivesBuilder.NOT_FOUND_IN_DIRECTIVE_REGISTRY_ERROR));
        }
    }

}