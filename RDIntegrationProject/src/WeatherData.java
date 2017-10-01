/**
 * Defines WeatherAppObject which represents weather data
 * 
 * @author Robbie Darrow
 */
public class WeatherData {
	
	private int zip;
	private int temp;
	private int feelsLike;
	private int humidity;
	private String dayDescription;
	private String nightDescription;
	
	public WeatherData () {
		//set zip to default value
		this.zip = 33965;
	}
	
	public int getZip() {
		return this.zip;
	}
	
	public int getTemp() {
		return this.temp;
	}
	
	public int getFeelsLike() {
		return this.feelsLike;
	}

	public int getHumidity() {
		return this.humidity;
	}
	
	public String getDayDescription() {
		return this.dayDescription;
	}
	
	public String getNightDescription() {
		return this.nightDescription;
	}
	
	private void setZip(int zip) {
		this.zip = zip;
	}
	
	private void setTemp(int temp) {
		this.temp = temp;
	}
	
	private void setFeelsLike(int feelsLike) {
		this.feelsLike = feelsLike;
	}
	
	private void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	
	private void setDayDescription (String dayDescription) {
		this.dayDescription = dayDescription;
	}
	
	private void setNightDescription (String nightDescription) {
		this.nightDescription = nightDescription;
	}
}
