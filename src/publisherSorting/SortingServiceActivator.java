package publisherSorting;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class SortingServiceActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;
	
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Sorting Publisher Start");
		SortingServicePublisher s_publishService = new SortingServicePublisherImpl();
		
		publishServiceRegistration = context.registerService(SortingServicePublisher.class.getName(),s_publishService , null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		
		System.out.println("Sorting Publisher Stop");
		publishServiceRegistration.unregister();
	}

}
