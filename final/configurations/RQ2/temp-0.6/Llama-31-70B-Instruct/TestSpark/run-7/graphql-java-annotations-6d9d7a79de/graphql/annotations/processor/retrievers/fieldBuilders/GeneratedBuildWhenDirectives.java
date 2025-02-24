package graphql.annotations.processor.retrievers.fieldBuilders;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedBuildWhenDirectives {

    @Mock
    private AnnotatedElement annotatedElement;

    @Mock
    private ProcessingElementsContainer processingElementsContainer;

    @Mock
    private Method method;

    @Test
    public void buildWhenDirectives() {
        when(annotatedElement.getAnnotations()).thenReturn(new Annotation[]{new GraphQLDirectives() {
            @Override
            public Class<? extends Annotation> annotationType() {
                return GraphQLDirectives.class;
            }
        }});
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotatedElement, processingElementsContainer);
        assertEquals(1, directivesBuilder.build().length);
    }

}