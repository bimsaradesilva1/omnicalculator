package publisherUnitConverter;

public interface UnitConverterPublisher {
	
	//Length Converter
	public void metersToCentimeters();
	public void centimetersToMeters();

	//Temperature Converter
	public void celsiusToFahrenheit();
	public void fahrenheitToCelsius();
	
	//Weight Converter
	public void gramsToKilograms();
	public void kilogramsToGrams();
	
	
}
