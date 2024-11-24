package MappingTask;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

	@Entity
	public class Address {
		@Id
		private int pincode;
		private String city;
		
		@OneToMany(mappedBy = "address", cascade = CascadeType.ALL)
		
		private List<Person> person = new ArrayList<Person>();
		
		public Address() {
			super();
		}
		
		public Address(int pincode, String city) {
			super();
			this.pincode = pincode;
			this.city = city;
		}

		public int getPincode() {
			return pincode;
		}

		public void setPincode(int pincode) {
			this.pincode = pincode;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}
		
		public List<Person> getPerson() {
			return person;
		}

		public void setPerson(Person person) {
			this.person.add(person);
		}

		@Override
		public String toString() {
			return "Address [pincode=" + pincode + ", city=" + city + "]";
		}
		
		
	}

