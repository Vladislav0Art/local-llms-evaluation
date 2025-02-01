package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class GeneratedBuildAnnotationWithoutRegistrationTest {

    @Test
    public void buildAnnotationWithoutRegistrationTest() {
        Annotation mockAnnotation = Mockito.mock(Annotation.class);
        Method mockMethod = Mockito.mock(Method.class);

        Mockito.when(mockMethod.getAnnotations()).thenReturn(new Annotation[]{mockAnnotation});

        ProcessingElementsContainer mockContainer = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(mockMethod, mockContainer);
        builder.build();
    }

}