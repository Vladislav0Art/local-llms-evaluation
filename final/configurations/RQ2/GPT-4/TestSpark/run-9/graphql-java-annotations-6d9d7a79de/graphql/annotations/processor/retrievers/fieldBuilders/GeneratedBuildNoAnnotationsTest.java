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

public class GeneratedBuildNoAnnotationsTest {

    @Test
    public void buildNoAnnotationsTest() {
        try {
            ProcessingElementsContainer mockContainer = Mockito.mock(ProcessingElementsContainer.class);
            DirectiveJavaAnnotationUtil mockUtil = Mockito.mock(DirectiveJavaAnnotationUtil.class);

            Mockito.when(mockContainer.getDirectiveJavaAnnotationUtil()).thenReturn(mockUtil);
            Mockito.when(mockUtil.getDirective(anyString(), Mockito.any())).thenReturn(null);

            Class<?> clazz = Class.forName("com.test.NoAnnotations");
            DirectivesBuilder directivesBuilder = new DirectivesBuilder(clazz, mockContainer);
            assertTrue("Should return an empty array when no directives annotations", directivesBuilder.build().length == 0);
        } catch (ClassNotFoundException e) {
            fail("Test failed due to: " + e.getMessage());
        }
    }

}