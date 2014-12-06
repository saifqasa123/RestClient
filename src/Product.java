import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product implements Serializable{
 
	String name;
	int qty;
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public int getQty() {
		return qty;
	}
 
	public void setQty(int qty) {
		this.qty = qty;
	}
 
}