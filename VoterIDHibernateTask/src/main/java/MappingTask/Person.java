package MappingTask;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

	@Entity
	@Table(name = "person")
	public class Person {
		@Id
		private int aadharid;
		private String name;

		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "voterid")
		private VotingCard vcard;

		@ManyToOne(cascade = CascadeType.ALL)

		private Address address;

		public Person() {
			super();
		}

		public Person(int aadharid, String name, VotingCard vcard, Address address) {
			super();
			this.aadharid = aadharid;
			this.name = name;
			this.vcard = vcard;
			this.address = address;
		}

		public int getAadharid() {
			return aadharid;
		}

		public void setAadharid(int aadharid) {
			this.aadharid = aadharid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public VotingCard getVcard() {
			return vcard;
		}

		public void setVcard(VotingCard vcard) {
			this.vcard = vcard;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

	}

