package clases;

public class main {
	
	public static void main(String [] args) {
		
		FILO pila = new FILO();
		
		pila.push(4.3);
		pila.push(true);
		pila.push("Pila");
		pila.push('D');
		pila.push('C');
		
//		System.out.println(pila.pop());
//		System.out.println(pila.pop());
//		System.out.println(pila.peek());
		System.out.println(pila.empty());
		
//		while(pila.empty()==false) {
//			System.out.println(pila.pop());
//		}
	}

}
