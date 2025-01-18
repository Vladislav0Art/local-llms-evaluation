package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GeneratedBuildInvalidObjectTest {

    @Test
    public void buildInvalidObjectTest() {
        Field field = Mockito.mock(Field.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectiveJavaAnnotationUtil directiveJavaAnnotationUtil = Mockito.mock(DirectiveJavaAnnotationUtil.class);
        Mockito.when(container.getDirectiveJavaAnnotationUtil()).thenReturn(directiveJavaAnnotationUtil);
        Mockito.when(field.getAnnotations()).thenReturn(new Annotation[0]);

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(field, container);
        directivesBuilder.build();
    }

}