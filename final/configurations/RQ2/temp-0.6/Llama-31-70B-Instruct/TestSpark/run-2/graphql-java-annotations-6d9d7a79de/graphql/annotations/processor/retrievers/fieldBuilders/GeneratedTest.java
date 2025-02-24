package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
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

    @Mock
    DirectiveJavaAnnotationUtil directiveJavaAnnotationUtil;

    @Test
    public void buildNoDirectivesTest() throws Exception {
        when(annotatedElement.getAnnotations()).thenReturn(new Annotation[0]);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotatedElement, processingElementsContainer);
        assertEquals(0, directivesBuilder.build().length);
    }

}