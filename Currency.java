package currencyConverter;

import java.util.ArrayList;
import java.util.HashMap;

public class Currency {
	private String name;
	private String shortName;
	private HashMap<String, Double> exchangeValues = new HashMap<String, Double>();
	
	// "Currency" Constructor
	public Currency(String nameValue, String shortNameValue) {
		this.name = nameValue;
		this.shortName = shortNameValue;
	}
	
	// Getter for name
	public String getName() {
		return this.name;
	}
	
	// Setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	// Getter for shortName
	public String getShortName() {
		return this.shortName;
	}
	
	// Setter for shortName
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	
	// Getter for exchangeValues
	public HashMap<String, Double> getExchangeValues() {
		return this.exchangeValues;
	}
	
	// Setter for exchangeValues
	public void setExchangeValues(String key, Double value) {
		this.exchangeValues.put(key, value);
	}
	
	// Set default values for a currency
	public void defaultValues() {
		String currency = this.name;

		switch (currency) {
			case "US Dollar":
				this.exchangeValues.put("USD", 1.00);
				this.exchangeValues.put("EUR", 0.93);
				this.exchangeValues.put("GBP", 0.66);
				this.exchangeValues.put("CHF", 1.01);
				this.exchangeValues.put("CNY", 6.36);
				this.exchangeValues.put("JPY", 123.54);
				this.exchangeValues.put("INR", 83.23); // Added INR exchange rate
				break;
			case "Euro":
				this.exchangeValues.put("USD", 1.073);
				this.exchangeValues.put("EUR", 1.00);
				this.exchangeValues.put("GBP", 0.71);
				this.exchangeValues.put("CHF", 1.08);
				this.exchangeValues.put("CNY", 6.83);
				this.exchangeValues.put("JPY", 132.57);
				this.exchangeValues.put("INR", 89.75); // Added INR exchange rate
				break;
			case "British Pound":
				this.exchangeValues.put("USD", 1.51);
				this.exchangeValues.put("EUR", 1.41);
				this.exchangeValues.put("GBP", 1.00);
				this.exchangeValues.put("CHF", 1.52);
				this.exchangeValues.put("CNY", 9.60);
				this.exchangeValues.put("JPY", 186.41);
				this.exchangeValues.put("INR", 126.30); // Added INR exchange rate
				break;
			case "Swiss Franc":
				this.exchangeValues.put("USD", 0.99);
				this.exchangeValues.put("EUR", 0.93);
				this.exchangeValues.put("GBP", 0.66);
				this.exchangeValues.put("CHF", 1.00);
				this.exchangeValues.put("CNY", 6.33);
				this.exchangeValues.put("JPY", 122.84);
				this.exchangeValues.put("INR", 82.27); // Added INR exchange rate
				break;
			case "Chinese Yuan Renminbi":
				this.exchangeValues.put("USD", 0.16);
				this.exchangeValues.put("EUR", 0.15);
				this.exchangeValues.put("GBP", 0.11);
				this.exchangeValues.put("CHF", 0.16);
				this.exchangeValues.put("CNY", 1.00);
				this.exchangeValues.put("JPY", 19.41);
				this.exchangeValues.put("INR", 10.91); // Added INR exchange rate
				break;
			case "Japanese Yen":
				this.exchangeValues.put("USD", 0.008);
				this.exchangeValues.put("EUR", 0.007);
				this.exchangeValues.put("GBP", 0.005);
				this.exchangeValues.put("CHF", 0.008);
				this.exchangeValues.put("CNY", 0.051);
				this.exchangeValues.put("JPY", 1.000);
				this.exchangeValues.put("INR", 0.56); // Added INR exchange rate
				break;
			case "Indian Rupee": // New case for INR
				this.exchangeValues.put("USD", 0.012);
				this.exchangeValues.put("EUR", 0.011);
				this.exchangeValues.put("GBP", 0.0079);
				this.exchangeValues.put("CHF", 0.012);
				this.exchangeValues.put("CNY", 0.092);
				this.exchangeValues.put("JPY", 1.78);
				this.exchangeValues.put("INR", 1.000); // INR to INR is 1:1
				break;
		}
	}

	
	// Initialize currencies
	public static ArrayList<Currency> init() {
		ArrayList<Currency> currencies = new ArrayList<Currency>();
				
		currencies.add(new Currency("US Dollar", "USD"));
		currencies.add(new Currency("Euro", "EUR"));
		currencies.add(new Currency("British Pound", "GBP"));
		currencies.add(new Currency("Swiss Franc", "CHF"));
		currencies.add(new Currency("Chinese Yuan Renminbi", "CNY"));
		currencies.add(new Currency("Japanese Yen", "JPY"));
		currencies.add(new Currency("Indian Rupee", "INR")); // Added Indian Rupee
		
		for (Integer i =0; i < currencies.size(); i++) {
			currencies.get(i).defaultValues();
		}		
		
		return currencies;
	}
	
	// Convert a currency to another
	public static Double convert(Double amount, Double exchangeValue) {
		Double price;
		price = amount * exchangeValue;
		price = Math.round(price * 100d) / 100d;
		
		return price;
	}
}