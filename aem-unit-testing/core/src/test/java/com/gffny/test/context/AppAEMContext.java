package com.gffny.test.context;

import com.gffny.test.core.services.impl.SampleServiceImpl;

import io.wcm.testing.mock.aem.junit.AemContext;
import io.wcm.testing.mock.aem.junit.AemContextCallback;
import io.wcm.testing.mock.wcmio.handler.MockHandler;

import org.apache.sling.testing.mock.sling.ResourceResolverType;

import java.io.IOException;

/**
 * Sets up {@link AemContext} for unit tests in this application.
 * Created by John D. Gaffney | Isobar US
 * 6/2/16
 */
public class AppAEMContext {

    public static final String CONTENT_ROOT = "/content/aemunittesting/en";

    private AppAEMContext() {
        // static methods only
    }

    public static AemContext newAEMContext() {
        return new AemContext(new SetUpCallback(), ResourceResolverType.RESOURCERESOLVER_MOCK);
    }

    /**
     * Custom set up rules required in all unit tests.
     */
    private static final class SetUpCallback implements AemContextCallback {

        @Override
        public void execute(AemContext context) throws IOException {

            // setup handler
            context.registerService(SampleServiceImpl.class, new SampleServiceImpl());
            MockHandler.setUp(context);

            // register sling models
            context.addModelsForPackage("com.gffny.test.core.models");

            // import sample content
            context.load().json("/context.json", CONTENT_ROOT);

            // set default current page
            context.currentPage(CONTENT_ROOT);
        }

    }

}