package graphql.annotations.processor.retrievers.fieldBuilders;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import graphql.annotations.processor.ProcessingElementsContainer;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testConstructor() {
        AnnotatedElement annotatedElement = mock(AnnotatedElement.class);
        ProcessingElementsContainer processingElementsContainer = mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotatedElement, processingElementsContainer);
        assertEquals(annotatedElement, directivesBuilder.getObject());
        assertEquals(processingElementsContainer, directivesBuilder.getContainer());
    }

    @Test
    public void testBuild() {
        AnnotatedElement annotatedElement = mock(AnnotatedElement.class);
        ProcessingElementsContainer processingElementsContainer = mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotatedElement, processingElementsContainer);
        GraphQLDirective[] graphQLDirectives = directivesBuilder.build();
        assertEquals(0, graphQLDirectives.length);
    }

}