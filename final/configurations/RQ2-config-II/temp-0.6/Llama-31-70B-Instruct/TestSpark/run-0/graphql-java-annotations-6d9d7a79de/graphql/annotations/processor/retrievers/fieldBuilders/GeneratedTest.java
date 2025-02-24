package graphql.annotations.processor.retrievers.fieldBuilders;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void buildWithoutDirectivesTest() {
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(null, null);
        GraphQLDirective[] directives = directivesBuilder.build();
        assertNotNull(directives);
        assertEquals(0, directives.length);
    }

    @Test
    public void buildWithDirectivesTest() {
        AnnotatedElement annotatedElementMock = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer processingElementsContainerMock = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotatedElementMock, processingElementsContainerMock);
        GraphQLDirective[] directives = directivesBuilder.build();
        assertNotNull(directives);
        assertTrue(directives.length > 0);
    }

}