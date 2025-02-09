package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.retrievers.fieldBuilders.ProcessingElementsContainer;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private AnnotatedElement annotatedElement;

    @Mock
    private ProcessingElementsContainer processingElementsContainer;

    @Test
    public void buildNoAnnotationsTest() {
        when(annotatedElement.getAnnotations()).thenReturn(new Annotation[0]);
        DirectivesBuilder builder = new DirectivesBuilder(annotatedElement, processingElementsContainer);

        GraphQLDirective[] result = builder.build();

        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void buildWithInvalidDirectivesAnnotationTest() {
        Annotation[] fakeAnnotations = {new FakeDirectivesAnnotation()};
        when(annotatedElement.getAnnotations()).thenReturn(fakeAnnotations);

        DirectivesBuilder builder = new DirectivesBuilder(annotatedElement, processingElementsContainer);

        try {
            builder.build();
            fail();
        } catch (GraphQLAnnotationsException expected) {
            assertEquals("Your annotation is not a valid directive annotation", expected.getMessage());
        }
    }

    @Test
    public void buildValidDirectivesTest() {
        Annotation[] validAnnotations = {new ValidDirectivesAnnotation()};
        when(annotatedElement.getAnnotations()).thenReturn(validAnnotations);

        DirectivesBuilder builder = new DirectivesBuilder(annotatedElement, processingElementsContainer);

        GraphQLDirective[] builtDirectives = builder.build();

        assertNotNull(builtDirectives);
        assertEquals(1, builtDirectives.length);
        assertEquals("validDirective", builtDirectives[0].getName());
    }

    private class FakeDirectivesAnnotation implements Annotation {
        @Override
        public Class<? extends Annotation> annotationType() {
            return FakeDirectivesAnnotation.class;
        }
    }

    private class ValidDirectivesAnnotation implements Annotation {
        @Override
        public Class<? extends Annotation> annotationType() {
            return ValidDirectivesAnnotation.class;
        }
    }

}