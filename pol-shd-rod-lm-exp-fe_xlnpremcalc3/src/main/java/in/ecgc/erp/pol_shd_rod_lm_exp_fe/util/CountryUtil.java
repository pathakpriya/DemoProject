package in.ecgc.erp.pol_shd_rod_lm_exp_fe.util;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class CountryUtil {
	 public List<Country> countrylist() {
	        // A collection to store our country object
	        List<Country> countries = new ArrayList<Country>();

	        // Get ISO countries, create Country object and
	        // store in the collection.
	        String[] isoCountries = Locale.getISOCountries();
	        for (String country : isoCountries) {
	            Locale locale = new Locale("en", country);
	            String name = locale.getDisplayCountry();

	            if (!"".equals(name)) {
	                countries.add(new Country(name));
	            }
	        }

	        // Sort the country by their name and then display the content
	        // of countries collection object.
	        Collections.sort(countries, new CountryComparator());
	        return countries;
	  }
	  private  class CountryComparator implements Comparator<Country> {
          private Comparator<Object> comparator;

          CountryComparator() {
              comparator = Collator.getInstance();
          }

          public int compare(Country c1, Country c2) {
              return comparator.compare(c1.name, c2.name);
          }
      }
	  public class Country {
	      
	        private String name;
	        

	        public Country() {
				super();
				// TODO Auto-generated constructor stub
			}

			Country(String name) {
	           
	            this.name = name;
	        }

	        public String toString() {
	            return name.toUpperCase();
	        }
	    }


}
