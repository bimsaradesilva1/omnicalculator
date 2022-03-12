package publisherFitnessCalc;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class FitnessActivator implements BundleActivator {

	ServiceRegistration publishServiceReg; 
	
	public void start(BundleContext context) throws Exception {
		System.out.println("Fitness Calculator Started."); 
		FitnessCalcPublisher fitnessPublisher = new FitnessCalculator(); 
		publishServiceReg = context.registerService(FitnessCalcPublisher.class.getName(), fitnessPublisher, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Fitness Calculator Stopped.");
		publishServiceReg.unregister();
	}

}
