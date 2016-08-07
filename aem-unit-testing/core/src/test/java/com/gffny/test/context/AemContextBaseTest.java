package com.gffny.test.context;

import com.day.cq.wcm.api.Page;
import com.gffny.test.context.AppAEMContext;
import io.wcm.testing.mock.aem.junit.AemContext;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.junit.Before;
import org.junit.Rule;

import static org.junit.Assert.assertNotNull;

/**
 * Created by John D. Gaffney | Isobar US
 * 6/5/16
 */
public class AemContextBaseTest {

    @Rule
    public final AemContext context = AppAEMContext.newAEMContext();

    @Before
    public void setUp() {

    }

    /**
     *
     * @param pageResourceLocation
     * @return
     */
    public Page getPage(String pageResourceLocation) {
        assertNotNull(pageResourceLocation);
        Resource resource = context.resourceResolver().getResource(pageResourceLocation);
        assertNotNull(pageResourceLocation, resource);
        return resource.adaptTo(Page.class);
    }

    /**
     *
     * @param servlet
     * @param <ServletType>
     * @return
     */
    public <ServletType extends SlingSafeMethodsServlet> ServletType getServlet(Class<ServletType> servlet) {
        assertNotNull(servlet);
        SlingSafeMethodsServlet servletOfType = context.getService(servlet);
        assertNotNull(servletOfType);
        return servlet.cast(servletOfType);
    }

    public <ServiceType> ServiceType getService(Class<ServiceType> serviceTypeClass) {
        assertNotNull(serviceTypeClass);
        ServiceType service = context.getService(serviceTypeClass);
        assertNotNull(service);
        return service;
    }
}
