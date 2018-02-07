package CollectionMap;

public class Address {

		int pc;
		String city;
		public Address( String city,int pc) {
			super();
			this.pc = pc;
			this.city = city;
		}
		@Override
		public String toString() {
			return "Address [pc=" + pc + ", city=" + city + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((city == null) ? 0 : city.hashCode());
			//result = prime * result + pc;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Address other = (Address) obj;
			if (city == null) {
				if (other.city != null)
					return false;
			} else if (!city.equals(other.city))
				return false;
			/*if (pc != other.pc)
				return false;*/
			return true;
		} 
	
	

}
