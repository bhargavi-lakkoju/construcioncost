package epamconstructioncost;
/**
 * 
 * @author bhargavi
 *
 */

public class Constructioncost {
	public int calculatecost(String material, int area, boolean automate) {
		int costpersf=0;
		if(material.equals("standard")) {
			costpersf=1200;
		}else if(material.equals("abovestandard")) {
			costpersf=1500;
		}else if(material.equals("highstandard")){
			if(automate)
				costpersf=2500;
			else
				costpersf=1800;
		}
		return costpersf*area;
	}

}
