import java.util.*;
public class Robot {
	private ArrayList<String> domRisp;
	private Random r;
	public Robot() {
		domRisp=new ArrayList<String>(3);
		domRisp.add("Sono Robot, tutto ok?");
		domRisp.add("Bene, lo vorrei sapere da te.");
		domRisp.add("...Sto pensando...fammi un'altra domanda.");
		r=new Random();
	}
	public String getDomRisp(){
		return domRisp.get(r.nextInt(domRisp.size()));
	}
	public int getNum(){
		return domRisp.size();
	}
	public void addDomRisp(String r){
		domRisp.add(r);
	}
}