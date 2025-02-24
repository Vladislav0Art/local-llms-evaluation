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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    private DirectivesBuilder directivesBuilder;

    @Mock
    private AnnotatedElement mockAnnotatedElement;

    @Mock
    private ProcessingElementsContainer mockProcessingElementsContainer;

    @Mock
    private GraphQLDirective mockGraphQLDirective;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        directivesBuilder = new DirectivesBuilder(mockAnnotatedElement, mockProcessingElementsContainer);
    }

    @Test
    public void buildNoDirectivesTest() {
        when(mockAnnotatedElement.getAnnotations()).thenReturn(new Annotation[0]);
        GraphQLDirective[] result = directivesBuilder.build();
        assertEquals(0, result.length);
    }

}