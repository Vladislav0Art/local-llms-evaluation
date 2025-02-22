package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedShouldBuildDirectivesFromDirectiveJavaAnnotations {

    private DirectivesBuilder directivesBuilder;
    private AnnotatedElement annotatedElement;
    private ProcessingElementsContainer processingElementsContainer;

    @Before
    public void setup() {
        directivesBuilder = new DirectivesBuilder(annotatedElement, processingElementsContainer);
        annotatedElement = Mockito.mock(AnnotatedElement.class);
        processingElementsContainer = Mockito.mock(ProcessingElementsContainer.class);
    }

    @Test
    public void shouldBuildDirectivesFromDirectiveJavaAnnotations() {
        List<Annotation> annotations = Mockito.mock(List.class);
        GraphQLDirective[] directives = new GraphQLDirective[0];
        when(DirectiveJavaAnnotationUtil.getDirectiveAnnotations(annotatedElement)).thenReturn(annotations);
        when(directivesBuilder.build()).thenReturn(directives);

        directivesBuilder.build();

        assertEquals(directives, directivesBuilder.build());
    }

}