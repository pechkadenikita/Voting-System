package MappingTask;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name="votingcard")
	public class VotingCard {
		@Id
		private int voterid;
		private String constituency;
		
		public VotingCard() {
			super();
		}
		
		public VotingCard(int voterid, String constituency) {
			super();
			this.voterid = voterid;
			this.constituency = constituency;
		}

		public int getVoterid() {
			return voterid;
		}

		public void setVoterid(int voterid) {
			this.voterid = voterid;
		}

		public String getConstituency() {
			return constituency;
		}

		public void setConstituency(String constituency) {
			this.constituency = constituency;
		}

		@Override
		public String toString() {
			return "VotingCard [voterid=" + voterid + ", constituency=" + constituency + "]";
		}
		
		
	}

