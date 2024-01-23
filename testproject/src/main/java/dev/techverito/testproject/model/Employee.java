package dev.techverito.testproject.model;

import java.util.List;
import java.util.Objects;

import dev.techverito.testproject.model.Address;

public record Employee(int id,String name,String City) {

	/*
	 * int id; String name; List<Address> addresses; public int getId() { return id;
	 * } public void setId(int id) { this.id = id; } public String getName() {
	 * return name; } public void setName(String name) { this.name = name; } public
	 * List<Address> getAddresses() { return addresses; } public void
	 * setAddresses(List<Address> addresses) { this.addresses = addresses; }
	 * 
	 * @Override public int hashCode() { return Objects.hash(addresses, id, name); }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; Employee other = (Employee) obj; return Objects.equals(addresses,
	 * other.addresses) && id == other.id && Objects.equals(name, other.name); }
	 * public Employee(int id, String name, List<Address> addresses) { super();
	 * this.id = id; this.name = name; this.addresses = addresses; }
	 * 
	 */
}
