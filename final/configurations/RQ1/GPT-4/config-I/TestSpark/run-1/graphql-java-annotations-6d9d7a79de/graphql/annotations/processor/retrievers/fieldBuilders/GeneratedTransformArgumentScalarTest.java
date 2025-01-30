package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

import static org.mockito.Mockito.*;

public class GeneratedTransformArgumentScalarTest {

    @Test
    public void transformArgumentScalarTest() {
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        GraphQLDirective mockDirective = Mockito.mock(GraphQLDirective.class);
        AnnotatedElement annotatedElement = Mockito.mock(AnnotatedElement.class);
        Annotation annotation = getMockDirectiveAnnotationWithMethods(1);
        when(mockDirective.getArguments()).thenReturn(Collections.singletonList(Mockito.mock(GraphQLArgument.class)));
        when(annotatedElement.getAnnotations()).thenReturn(new Annotation[]{annotation});
        when(container.getDirectiveRegistry().containsKey(any())).thenReturn(true);
        when(container.getDirectiveRegistry().get(any())).thenReturn(mockDirective);

        new DirectivesBuilder(annotatedElement, container).build();
    }

    private Annotation getMockDirectiveAnnotationWithMethods(int numberOfMethods) {
        Annotation annotation = Mockito.mock(Annotation.class);
        Class<? extends Annotation> annotationType = Mockito.mock(Class.class);
        Method[] methods = new Method[numberOfMethods];
        Arrays.fill(methods, Mockito.mock(Method.class));
        when(annotation.annotationType()).thenReturn(annotationType);
        when(annotationType.getDeclaredMethods()).thenReturn(methods);
        return annotation;
    }

}