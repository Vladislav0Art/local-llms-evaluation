package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLDirective;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

public class GeneratedBuildWithoutDirectivesTest {

    @Test
    public void buildWithoutDirectivesTest() {
        AnnotatedElement annotatedElement = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer processingElementsContainer = Mockito.mock(ProcessingElementsContainer.class);

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotatedElement, processingElementsContainer);
        GraphQLDirective[] directives = directivesBuilder.build();

        assertNotNull(directives);
        assertEquals(0, directives.length);
    }

}