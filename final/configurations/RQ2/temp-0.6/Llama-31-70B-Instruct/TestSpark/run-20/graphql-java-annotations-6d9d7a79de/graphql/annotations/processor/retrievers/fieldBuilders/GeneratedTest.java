package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLDirective;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Mock
    private AnnotatedElement annotatedElement;
    @Mock
    private ProcessingElementsContainer container;

    private DirectivesBuilder directivesBuilder;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        directivesBuilder = new DirectivesBuilder(annotatedElement, container);
    }

    @Test
    public void build_whenGraphQLDirectivesIsNotPresent_shouldReturnEmptyArray() {
        // given
        when(annotatedElement.getAnnotation(GraphQLDirectives.class)).thenReturn(null);

        // when
        GraphQLDirective[] result = directivesBuilder.build();

        // then
        assertEquals(0, result.length);
    }

}