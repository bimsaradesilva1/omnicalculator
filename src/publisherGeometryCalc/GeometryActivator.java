package publisherGeometryCalc;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class GeometryActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	

	public void start(BundleContext context) throws Exception {
		System.out.println("Geomatry Calculator Start");
		geometryCalcPublisher publisher = new geometryCalculator();
		publishServiceRegistration = context.registerService(geometryCalcPublisher.class.getName(), publisher, null);
		
	}

	
	
	public void stop(BundleContext context) throws Exception {
		System.out.println("Geomatry Calculator Stop");
		publishServiceRegistration.unregister();
	}

}
