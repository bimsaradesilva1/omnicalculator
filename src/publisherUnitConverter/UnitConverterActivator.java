package publisherUnitConverter;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class UnitConverterActivator implements BundleActivator {

	ServiceRegistration publishServiceReg;

	public void start(BundleContext context) throws Exception {
		System.out.println("Unit Converter started");
		UnitConverterPublisher unitConverterPublisher = new UnitConverterPublisherImpl();
		
		publishServiceReg = context.registerService(UnitConverterPublisher.class.getName(), unitConverterPublisher, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Unit Converter stopped");
		publishServiceReg.unregister();
	}

}
