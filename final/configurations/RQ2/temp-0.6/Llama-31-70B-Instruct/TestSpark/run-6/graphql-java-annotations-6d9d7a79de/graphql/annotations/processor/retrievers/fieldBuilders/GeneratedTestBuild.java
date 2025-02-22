package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import org.junit.Test;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class GeneratedTestBuild {

    @Test
    public void testBuild() throws Exception {
        AnnotatedElement annotatedElement = mock(AnnotatedElement.class);
        ProcessingElementsContainer processingElementsContainer = mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotatedElement, processingElementsContainer);
        GraphQLDirective[] graphQLDirectives = directivesBuilder.build();
        assertEquals(graphQLDirective.length, graphQLDirectives.length);
        assertTrue(graphQLDirectives.length > 0);
    }

}