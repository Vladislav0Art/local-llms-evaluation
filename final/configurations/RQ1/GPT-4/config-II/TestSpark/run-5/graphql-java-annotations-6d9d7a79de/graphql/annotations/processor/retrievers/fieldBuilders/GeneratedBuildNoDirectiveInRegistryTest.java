package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.retrievers.fieldBuilders.ProcessingElementsContainer;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildNoDirectiveInRegistryTest {

    @Test
    public void buildNoDirectiveInRegistryTest() {
        AnnotatedElement object = mock(AnnotatedElement.class);
        Annotation annotationMock = mock(Annotation.class);
        when(DirectiveJavaAnnotationUtil.getName(annotationMock)).thenReturn("test");
        when(DirectiveJavaAnnotationUtil.getDirectiveAnnotations(object)).thenReturn(Collections.singletonList(annotationMock));

        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        when(container.getDirectiveRegistry()).thenReturn(new HashMap<>());

        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        builder.build();
    }

}