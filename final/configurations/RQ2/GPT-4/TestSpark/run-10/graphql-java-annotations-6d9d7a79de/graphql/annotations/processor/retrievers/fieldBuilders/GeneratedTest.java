package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.schema.GraphQLDirective;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.AnnotatedElement;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    AnnotatedElement annotatedElement;

    @Mock
    ProcessingElementsContainer processingElementsContainer;

    @Test
    public void buildDirectivesForAnnotatedElementTest() {
        DirectivesBuilder builder = new DirectivesBuilder(annotatedElement, processingElementsContainer);
        GraphQLDirective[] directives = builder.build();
        assertNotNull(directives);
    }

    @Test
    public void buildDirectivesForNullAnnotatedElementTest() {
        DirectivesBuilder builder = new DirectivesBuilder(null, processingElementsContainer);
        builder.build();
    }

    @Test
    public void buildDirectivesForProcessingElementContainerTest() {
        DirectivesBuilder builder = new DirectivesBuilder(annotatedElement, processingElementsContainer);
        GraphQLDirective[] directives = builder.build();
        assertEquals(directives.length, 1);
    }

    @Test
    public void buildDirectivesForInvalidProcessingElementContainerTest() {
        DirectivesBuilder builder = new DirectivesBuilder(annotatedElement, null);
        builder.build();
    }

    @Test
    public void buildDirectivesForEmptyAnnotatedElementTest() {
        DirectivesBuilder builder = new DirectivesBuilder(mock(AnnotatedElement.class), processingElementsContainer);
        GraphQLDirective[] directives = builder.build();
        assertEquals(directives.length, 0);
    }

}