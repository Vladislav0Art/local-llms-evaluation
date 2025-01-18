package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.anyString;

import java.lang.annotation.Annotation;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLDirective;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedBuildExceptionTest {

    @Test
    public void buildExceptionTest() {
        try {
            ProcessingElementsContainer mockContainer = Mockito.mock(ProcessingElementsContainer.class);
            DirectiveJavaAnnotationUtil mockUtil = Mockito.mock(DirectiveJavaAnnotationUtil.class);

            Mockito.when(mockContainer.getDirectiveJavaAnnotationUtil()).thenReturn(mockUtil);
            Mockito.when(mockUtil.getDirective(anyString(), Mockito.any())).thenThrow(new RuntimeException());

            Class<?> clazz = Class.forName("com.test.ExceptionCase");
            DirectivesBuilder directivesBuilder = new DirectivesBuilder(clazz, mockContainer);
            directivesBuilder.build();
            fail("Expecting a RuntimeException on invoking build");
        } catch (RuntimeException e) {
            assertTrue("Should have thrown a RuntimeException", true);
        } catch (ClassNotFoundException e) {
            fail("Test failed due to: " + e.getMessage());
        }
    }

}